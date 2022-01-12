package com.interview;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class StringCheckPDG {
    public static void main(String[] args) {
        String s1="vijay";
        String s2 = new String("vijay");

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
