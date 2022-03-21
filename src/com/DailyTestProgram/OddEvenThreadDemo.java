package com.DailyTestProgram;

public class OddEvenThreadDemo {
    private int counter = 50;
    private int limit = 100;

    public static void main(String[] args) {

        OddEvenThreadDemo demo = new OddEvenThreadDemo();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.printEven();
            }
        }, "Even Thread");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.printOdd();
            }
        }, "Odd Thread");

        t1.start();
        t2.start();
    }

    private void printOdd() {
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

    private void printEven() {
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
