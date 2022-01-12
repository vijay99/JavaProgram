package com.array;

import java.util.Scanner;

/**
 * @author Kumar Vijay
 */
public class FactorialByRecursion {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());
        System.out.println("Factorial value is : "+calFactorial(num));

    }

    private static int calFactorial(int n) {
        if (n == 0)
            return 1;
        return n*calFactorial(n - 1);
    }
}
