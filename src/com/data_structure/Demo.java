package com.data_structure;

import java.util.Stack;

/**
 * @author Kumar Vijay
 */
public class Demo {
    public static void main(String[] args) {
        String str = "a(b)";
        System.out.println("Balanced string is :" + getBalanced(str));
    }

    private static String getBalanced(String str) {
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= 97 && str.charAt(i) <= 122)
                continue;
            else if (str.charAt(i) == '(' || str.charAt(i) == ')')
                if (myStack.peek() == '(')
                    myStack.pop();
                else
                    myStack.push(i);
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
