package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kumar Vijay
 */
public class PrintLengthOfLastWord {

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        System.out.println("length od last word is:" + getLengthOfLastWord(inputStr));
    }

    private static int getLengthOfLastWord(String inputStr) {
        if (inputStr.length() == 0)
            return 0;
        else if (inputStr.length() == 1)
            return inputStr.length();
        else {
            String[] arr = inputStr.split(" ");
            return arr[arr.length - 1].length();

        }
    }
}
