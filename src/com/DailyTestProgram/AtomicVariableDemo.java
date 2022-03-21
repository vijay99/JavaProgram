package com.DailyTestProgram;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariableDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=0;i<1000;i++){
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                   counter.increaseValueByOne();
                }
            });
        }
        executorService.shutdown();
        executorService.awaitTermination(30, TimeUnit.SECONDS);
        System.out.println(counter.getValue());

    }
}

class Counter {
    AtomicInteger value = new AtomicInteger();

    public void increaseValueByOne() {
        value.incrementAndGet();
    }

    public AtomicInteger getValue() {
        return value;
    }
}
