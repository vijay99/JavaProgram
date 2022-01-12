package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kumar Vijay
 */
public class StringPalindrome {
    public static void main(String[] args) {
        String inputStr = null;
        System.out.println("Please enter the String ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputStr = br.readLine().toLowerCase();
        } catch (IOException ioe) {
            System.out.println("Error while reading input from user");
        }
        System.out.println("Input string is :" + inputStr);
        boolean isPalindrome = palindromeCheck(inputStr);
        System.out.println("Is input string palindrome :" + isPalindrome);

    }

    private static boolean palindromeCheck(String inputStr) {
        int i = 0, l = inputStr.length() - 1;
        while (i <= l) {
            if (!isAlphaNumeric(inputStr.charAt(i)))
                i++;
            else if (!isAlphaNumeric(inputStr.charAt(l)))
                l--;
            else if (inputStr.charAt(i) != inputStr.charAt(l))
                return false;
            else {
                i++;
                l--;
            }
        }
        return true;
    }

    private static boolean isAlphaNumeric(char c) {
        if (c >= 48 && c <= 57 || c >= 97 && c <= 122 || c >= 65 && c <= 90)
            return true;
        else
            return false;
    }

}
