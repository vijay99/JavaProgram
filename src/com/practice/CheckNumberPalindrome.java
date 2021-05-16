package com.practice;

import java.util.Scanner;

public class CheckNumberPalindrome {
    public static void main(String[] args) {
        System.out.println("Please Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int orignalNum = inputNumber;
        int revNum = getReverse(orignalNum);
        if (inputNumber == revNum)
            System.out.println("Number is Palindrome:");
        else
            System.out.println("Number is not Palindrome:");
    }

    static int getReverse(int orignalNum) {
        int reminder, reverseNum = 0;
        while (orignalNum > 0) {
            reminder = orignalNum % 10;
            orignalNum = orignalNum / 10;
            reverseNum = reverseNum * 10 + reminder;
        }
        return reverseNum;
    }
}
