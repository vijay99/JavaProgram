package com.interview;

public class ThreadCreationWay extends Thread {
    public static void main(String[] args) {

        ThreadCreationWay t1 = new ThreadCreationWay();
        t1.setName("Thread -1 ");
        t1.start();

        Test test = new Test();
        Thread t2 = new Thread(test);
        t2.setName("Thread-By-Runnable");
        t2.start();

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("I am thread anonymous example");
                System.out.println("Thread name is : "+Thread.currentThread().getName());
            }
        },"Thread-Anonmous-1");

        t3.start();


    }

    @Override
    public void run(){
        System.out.println("I am from extending Thread class");
        System.out.println(Thread.currentThread().getName());
    }

}


class Test implements Runnable{
    @Override
    public void run() {
        System.out.println("I am from thread:"+Thread.currentThread().getName());
    }
}
