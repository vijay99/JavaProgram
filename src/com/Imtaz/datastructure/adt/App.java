package com.Imtaz.datastructure.adt;

/**
 * @author Kumar Vijay
 */
public class App {
    public static void main(String[] args) {
        Counter myCounter = new Counter("incrementCounter");
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        myCounter.increment();
        System.out.println("myCounter.getCurrentValue() -> "+myCounter.getCurrentValue());
        System.out.println("myCounter.getCurrentValue() -> "+myCounter.toString());
    }
}
