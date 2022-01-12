package com.data_structure;

import java.util.Stack;

/**
 * @author Kumar Vijay
 */
public class BalancedStringOptimized {
    public static void main(String[] args) {
        String str = "abc(d(e)f)gh)";
        System.out.println("Balanced String is :"+getBalancedString(str));
    }

    private static String getBalancedString(String str) {
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                continue;
            } else if (str.charAt(i) == '(' || str.charAt(i) == ')')
                myStack.push(i);
            else if (str.charAt(i) == ')')
                myStack.pop();
        }
        int index;
        StringBuilder sb = new StringBuilder(str);
        while (!myStack.isEmpty()) {
            index = myStack.pop();
            sb.deleteCharAt(index);
        }
        return sb.toString();

    }
}
