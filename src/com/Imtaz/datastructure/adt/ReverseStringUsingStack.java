package com.Imtaz.datastructure.adt;

/**
 * @author Kumar Vijay
 */
public class ReverseStringUsingStack {
    public static void main(String[] args) {
        System.out.println(reverseString("HELLO"));

    }
    private static String reverseString(String str){
        int maxSize=str.length();
        StackOfChar myStack= new StackOfChar(maxSize);
        for(int i=0;i<str.length();i++){
            myStack.push(str.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        while (!myStack.isEmpty()){
            sb.append(myStack.pop());
        }
        return sb.toString();
    }
}
class StackOfChar{
    int top;
    int maxSize;
    char charArr[];

    public StackOfChar(int maxSize) {
        this.maxSize = maxSize;
        charArr = new char[maxSize];
        top = -1;
    }

    public char pop() {
        if (!isEmpty()) {
            int old_top = top;
            top = top - 1;
            return charArr[old_top];
        }
        return '0';
    }

    //push operation
    public void push(char element) {
        if (isFull()) {
            System.out.println("Stack is full");
        } else
            charArr[++top] = element;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
