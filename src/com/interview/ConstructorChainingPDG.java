package com.interview;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class ConstructorChainingPDG {

    public static void main(String[] args) {

        A c = new C();
    }
}


class A{
    public A(){
        System.out.println("Class A,A()");
    }
}

class B extends A {
    public B(){
        System.out.println("Class B,B()");
    }
}

class C extends B{
    public C(){
        System.out.println("CLass C,C()");
    }
}
