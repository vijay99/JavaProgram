package com.concept;

/**
 * @author Kumar Vijay
 */
public class StaticBlock {


    static int i;

    static {
        i=10;
    }
    public static void main(String[] args) {
        System.out.println("value of i is:"+i);
        //Trying to modify the value of i
        StaticBlock staticBlock = new StaticBlock();
        staticBlock.changeStaticVariableValue();
        System.out.println("I want to modify value of i is:"+i);
    }

    public void changeStaticVariableValue(){
        i=i*10;
    }
}
