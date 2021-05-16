package com.practice;

import java.util.Scanner;

public class CheckPalindromeOptimizedWay {
    public static void main(String[] args) {
        System.out.println("Please Enter the Input String:");
        Scanner sc = new Scanner(System.in);
        String inputString=sc.next();
        int startIndex=0,endIndex=inputString.length()-1;
        while(startIndex<endIndex){
            if(inputString.charAt(startIndex)==inputString.charAt(endIndex)){
                System.out.println("startIndex is:"+startIndex+"-----------"+"endIndex is:"+endIndex);
                startIndex++;
                endIndex--;
                continue;
            }
            else
                break;
        }
        if(startIndex<=endIndex){
            System.out.println("Input number is Palindrome!!");
        }
        else
            System.out.println("Number is not palindrome");
    }

}
