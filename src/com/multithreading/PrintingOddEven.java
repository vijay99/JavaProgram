package com.multithreading;

/**
 * @author Kumar Vijay
 */
public class PrintingOddEven {
    int counter = 1;
    int limit = 20;

    public static void main(String[] args) {
        PrintingOddEven poe = new PrintingOddEven();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                poe.printEvenNumber();
            }
        }, "Even-Thread");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                poe.printOddNumber();
            }
        }, "Odd-Thread");

        t1.start();
        t2.start();

    }

    public void printOddNumber() {
        synchronized (this) {
            while (counter <= limit) {
                if (counter % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;
                notify();
            }
        }
    }

    public void printEvenNumber() {
        synchronized (this) {
            while (counter <= limit) {
                if (counter % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(Thread.currentThread().getName() + " : " + counter);
                counter++;
                notify();
            }
        }
    }
}
