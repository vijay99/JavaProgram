package com.array;

import java.util.Scanner;

/**
 * @author Kumar Vijay
 */
public class PalindromeCheckOptimized {
    public static void main(String[] args) {
        System.out.println("Please enter the string.");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int s=0,e=str.length()-1;
        while (s<=e){
            if(str.charAt(s)!=str.charAt(e))
              break;
            else
                s++;e--;
        }
        if(s<=e){
            System.out.println("String is not palindrome");
        }
        else
            System.out.println("String is palindrome");
    }
}
