package com.data_structure;

import java.util.Stack;

/**
 * @author Kumar Vijay
 */
public class stack {
    public static void main(String[] args) {
        String str = "({[()]}";
        Stack<Character> myStack=new Stack<>();
        boolean isBalanced=true;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='(' || str.charAt(i)=='{' || str.charAt(i)=='['){
                myStack.push(str.charAt(i));
            }
            else if(!myStack.isEmpty() && str.charAt(i)==')'){
                 if(myStack.pop()=='(')
                     isBalanced=true;
                 else
                     break;
            }
            else if(!myStack.isEmpty() && str.charAt(i)=='}'){
                if(myStack.pop()=='{')
                    isBalanced=true;
                else
                    break;
            }
            else if(!myStack.isEmpty() && str.charAt(i)==']'){
                if(myStack.pop()=='[')
                    isBalanced=true;
                else
                    break;
            }
        }
        if(myStack.isEmpty()){
            System.out.println("It is balanced!");
        }
        else
            System.out.println("It is not balanced.");
    }
}
