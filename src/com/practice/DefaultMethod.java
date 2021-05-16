package com.triky.interview.question;

public class DefaultMethod implements Interface1,Interface2{

    public static void main(String args[]){
        DefaultMethod defaultMethod = new DefaultMethod();
        defaultMethod.default1();

    }
    @Override
    public void default1() {
        System.out.println("I am from DefaultMethod:");

    }
}


interface Interface1 {
    default void default1() {
     System.out.println("I am from inside interface1:");
    }
}

interface Interface2{
    default void default1(){
        System.out.println("I am from inside interface2:");

    }
}