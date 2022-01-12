package com.demo;

import java.util.Scanner;

/**
 * @author Kumar Vijay
 */
public class CheckIfNumberIsPalindome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the number:");
        int inputNumber=Integer.parseInt(sc.next());
        int orignalInput=inputNumber;

        int revNum=0,reminder=0;

        while(inputNumber>0){
            reminder=inputNumber%10;
            revNum=reminder+revNum*10;
            inputNumber=inputNumber/10;
        }
        System.out.println("Input number is - "+orignalInput+",reverse number is - "+revNum);
        if(revNum==orignalInput){
            System.out.println("Input number is palindrome");
        }
        else
            System.out.println("Number is not palindrome");
    }


}
