package com.triky.interview.question;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number to reverse:");
        int n = sc.nextInt();
        int rev = 0;
        int remainder;

        while (n > 0) {
            remainder = n % 10;
            rev = rev * 10 + remainder;
            n = n / 10;
        }
        System.out.println("Reverse number is:" + rev);
    }
}
