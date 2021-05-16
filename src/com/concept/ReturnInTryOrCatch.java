package com.concept;

/**
 * @author Kumar Vijay
 */
public class ReturnInTryOrCatch {
    public static void main(String[] args) {
        ReturnInTryOrCatch obj = new ReturnInTryOrCatch();
        int returnVal = obj.add();
        System.out.println("Value of c is:" + returnVal);

    }

    public int add() {
        int a = 40;
        int b = 10;
        int c = 0;
        try {
            c = a / b;
            System.out.println("I am after performing operation in try:");
            //return 10;
            System.exit(0);
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            System.out.println("I am from finally:");
        }
        return c;
    }
}
