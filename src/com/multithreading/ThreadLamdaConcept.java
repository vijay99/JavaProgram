package com.multithreading;

public class ThreadLamdaConcept {

    public static void main(String args[]) {
        System.out.println("I am from Thread - " + Thread.currentThread().getName());

        Runnable task = () -> {
            System.out.println("I am from Thread - " + Thread.currentThread().getName());
        };
        Thread t1 = new Thread(task);
        t1.setName("My-Thread");
        t1.start();
    }
}
