package com.interview;

public class StaticVsConstructorExtremeNetworks {
    int instanceVar;
    static {
        //static block
        System.out.println("StaticBlock!");
    }

    StaticVsConstructorExtremeNetworks() {
        System.out.println("Constructor-1");
        System.out.println("instanceVar is :"+instanceVar);
    }

    StaticVsConstructorExtremeNetworks(int c) {
        System.out.println("Constructor-2");
    }

    public static void main(String[] args) {
        StaticVsConstructorExtremeNetworks sc = new StaticVsConstructorExtremeNetworks();
        StaticVsConstructorExtremeNetworks sc2 = new StaticVsConstructorExtremeNetworks(10);
    }
    {
        System.out.println("I am from instance block 1.");
        instanceVar=100;
    }

    {
        System.out.println("I am from instance block 2.");
        instanceVar=100;
    }
}

/*output :
        StaticBlock!
        Constructor-1
        Constructor-2*/
