package com.practice;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String args[]) {
        System.out.println("Please enter the string to check if it is palindrome or not:");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next().toLowerCase();
        String revString = getReverseStr(inputString);
        if (revString.equals(inputString))
            System.out.println("String is Palindrome:");
        else
            System.out.println("Input String is not Palindrome:");
    }

    private static String getReverseStr(String inputString) {
        StringBuilder rev = new StringBuilder();
        int l = inputString.length();
        for (int i = l - 1; i >= 0; i--) {
            rev.append(inputString.charAt(i));
        }
        return rev.toString();
    }
}
