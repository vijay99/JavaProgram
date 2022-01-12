package com.interview;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class ConsumerProducerDemoHPE {
    //define a queue
    Queue<Integer> myIntegerQueue = new ArrayDeque<>(10);

    public static void main(String[] args) {

        ConsumerProducerDemoHPE consumerProducerDemo = new ConsumerProducerDemoHPE();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumerProducerDemo.produce();
            }
        }, "Producer-Thread");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                consumerProducerDemo.consume();
            }
        }, "Consumer-Thread");

        //start the threads
        t1.start();
        t2.start();

    }

    private void consume() {
        synchronized (this) {
            if (myIntegerQueue.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            int sum = calculateSum(myIntegerQueue.poll());

            notify();
        }
    }

    //526    13
    //calculates the sum of all elements in the digit
    private int calculateSum(int val) {
        int sum = 0, rem;
        while (val > 0) {
            rem = val % 10;
            sum = sum + rem;

            val = val / 10;
        }
        return sum;
    }

    private void produce() {
        synchronized (this) {
            if (!myIntegerQueue.isEmpty()) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            for (int i = 0; i < 10; i++) {
                myIntegerQueue.add(i);
            }
            notify();
        }

    }

    //define a consumer


    //define a producer
}
