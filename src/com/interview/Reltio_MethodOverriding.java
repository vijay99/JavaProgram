package com.interviewquestion;

/**
 * @author Sacumen (www.sacumen.com)
 */
public class Reltio_MethodOverriding {
    public static void main(String[] args) {
     A a = new B();
     a.foo1();
     //a.foo3();
    }

}


class A{
    public void foo1(){
        foo2();
    }
    public void foo2(){
        System.out.println("Class A:foo2()");
    }
}

class B extends A{
    public void foo2(){
        System.out.println("Class B: foo2()");
    }

    public void foo3(){
        System.out.println("Class B: foo3()");
    }
}
