package com.multithreading;

public class ThreadWithAnonymousInnerClass {
    public  static void main(String args[]){
        System.out.println("I am from Thread - "+Thread.currentThread().getName());

        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am from Thread - "+Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(task);
        t1.start();
    }
}
