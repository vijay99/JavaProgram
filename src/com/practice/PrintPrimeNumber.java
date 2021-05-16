package com.triky.interview.question;

//import sun.awt.X11.XSystemTrayPeer;

import java.util.Scanner;

public class PrintPrimeNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter till what number you want to print prime number:");
        int n = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i < n; i++) {
            flag = false;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = true;
                }
            }
            if (flag == true)
                System.out.println(+ i + " is not prime");
            else
                System.out.println(+ i + " is prime:");
        }
    }
}
