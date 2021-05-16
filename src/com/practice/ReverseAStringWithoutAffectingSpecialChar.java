package com.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Input:   str = "a,b$c"
 * Output:  str = "c,b$a"
 * Note that $ and , are not moved anywhere.
 * Only subsequence "abc" is reversed
 */
public class ReverseAStringWithoutAffectingSpecialChar {
    public static void main(String[] args) {
        System.out.println("Please enter the string to reverse:");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        System.out.println("Input String is:" + inputString);
        char inputArr[] = inputString.toCharArray();
        reverseString(inputArr);
        System.out.println("Reverse String is :" + Arrays.toString(inputArr));
    }

    static void reverseString(char inputArr[]) {
        int start = 0, end = inputArr.length - 1;
        while (start < end) {
            //if element at index is special character ignore it
            if (!Character.isAlphabetic(inputArr[start]))
                start++;
            else if (!Character.isAlphabetic(inputArr[end]))
                end--;
            else {
                char temp;
                temp = inputArr[start];
                inputArr[start] = inputArr[end];
                inputArr[end] = temp;
                start++;
                end--;
            }
        }
    }
}
