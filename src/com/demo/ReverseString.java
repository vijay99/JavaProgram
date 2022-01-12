package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kumar Vijay
 */
public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Please enter the string:");
        String inputStr=br.readLine();
        StringBuilder sb= new StringBuilder();

        for(int i=inputStr.length()-1;i>=0;i--){
            sb.append(inputStr.charAt(i));
        }
        System.out.println("Reverse of "+inputStr+" is - "+sb);
    }
}
