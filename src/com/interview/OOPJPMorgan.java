package com.interview;

/**
 * @author Kumar Vijay
 */
public class OOPJPMorgan {
    public static void main(String[] args) {
        //Base Base = new Base("vijay");
        Derived derived = new Derived();
       


    }
}

class Base {
    static {
        System.out.println("Base : Static block:");
    }

    {
        System.out.println("Base : IIB-1");
    }

   /* public Base() {
        System.out.println("Base : no - arg constructor");
    }*/

    public Base(String s1) {
        System.out.println("Base : one - argument constructor");
    }
}

class Derived extends Base {
    static {
        System.out.println("Derived : static block");
    }
    {
        System.out.println("Derived : IIB-1");
    }

    public Derived() {
        super("vijay");
        System.out.println("Derived: no - arg constructor");
    }
}

//Derived : static block
//Base : static block
//Base : IIB-1
//Base : no - arg constructor
//Derived : IIB-1
//Derived: no - arg constructor

