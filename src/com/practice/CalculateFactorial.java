package com.triky.interview.question;

import java.util.Scanner;

public class CalculateFactorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number to calculate factorial");
        int n = sc.nextInt();
        int factorialValue = calculateFactorial(n);
        System.out.println("Factorial of " + n + " is - " + factorialValue);
    }

    private static int calculateFactorial(int n) {
        if (n == 0)
            return 1;
        else {
            return n * calculateFactorial(n - 1);
        }
    }
}
