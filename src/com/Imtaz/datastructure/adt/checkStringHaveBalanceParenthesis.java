package com.Imtaz.datastructure.adt;

import java.util.Stack;

/**
 * @author Kumar Vijay
 */
public class checkStringHaveBalanceParenthesis {
    public static void main(String[] args) {
        String str = "{[]}}";
        System.out.println("Is string have balance parenthesis  -->"+checkbalnaceparentesis(str));
    }

    private static boolean checkbalnaceparentesis(String str) {
        Stack<Character> stack = new Stack();
        //Checking if any open parenthesis and adding them into stack
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == '[' || x == '{' || x == '(') {
                stack.push(x);
                continue;
            }


            char check;
            if (stack.isEmpty())
                return false;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '}' || check == ']')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == ')' || check == ']')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == ')' || check == '}')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}

/**
 * 1.First traverse string from start to end
 *  a.Add all open parenthesis found in stack using push()
 *  b.If any closing parenthesis found, check top of stack ,if there is match repet if not string is not balanced
 */
