package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kumar Vijay
 */
public class RevereseEachWord {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the string:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr= br.readLine();
        String[] strArr=inputStr.split("//s");

        String reverseString="";
        for(int i=strArr.length-1;i>=0;i--){
            reverseString=reverseString+strArr[i]+" ";
        }
        reverseString.trim();
        System.out.println("Reverse string is : "+reverseString);
    }
}
