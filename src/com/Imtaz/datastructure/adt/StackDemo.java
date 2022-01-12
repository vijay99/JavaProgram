package com.Imtaz.datastructure.adt;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class StackDemo {
    public static void main(String[] args) {

        MyStack myStack = new MyStack(3);
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        while (!myStack.isEmpty()){
            int value=myStack.pop();
            System.out.println(value);
        }

        System.out.println("Pooping element "+myStack.pop());

    }
}

class MyStack {
    int maxSize;
    int top;
    int stackArr[];

    public MyStack(int maxSize) {
        this.maxSize = maxSize;
        stackArr=new int[maxSize];
        top=-1;
    }

    //pop operation
    public int pop() {
        if(!isEmpty()) {
            int old_top = top;
            top = top - 1;
            return stackArr[old_top];
        }
        return -1;
    }

    //push operation
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else
            stackArr[++top] = element;
    }

    //Check if stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    //Check if stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

}
