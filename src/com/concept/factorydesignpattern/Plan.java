package com.concept.factorydesignpattern;

/**
 * Created by Kumar Vijay on 29/04/21.
 */

/**
 * Plan abstract class
 */
public abstract class Plan {
    protected long rate;

    abstract void getRate();

    public void calculateBill(int unit) {
        System.out.println("Bill amount is :" + rate * unit);
    }
}
