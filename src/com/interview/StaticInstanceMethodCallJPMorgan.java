package com.interview;

/**
 * @author Kumar Vijay
 */
public class StaticInstanceMethodCallJPMorgan {

    public static void main(String[] args) {
        //instanceMethod();
        //staticMethod();
        StaticInstanceMethodCallJPMorgan obj = new StaticInstanceMethodCallJPMorgan();
        obj.instanceMethod();
    }

    public void instanceMethod(){
        System.out.println("I am from instanceMethod()");
        staticMethod();
    }
    public  static void staticMethod(){
        System.out.println("I am from staticMethod()");
        //instanceMethod();
    }
}

/*output:
        I am from staticMethod()
        I am from instanceMethod()
        I am from staticMethod()*/

