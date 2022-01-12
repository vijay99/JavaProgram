package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kumar Vijay
 */
public class SumOfPowerOftwoForInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the input number");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int inputNum = Integer.parseInt(br.readLine());
        int sum=0;
        int product;
        for(int i=0;i<inputNum;i++){
            product=2;
            for(int j=0;j<i;j++){
                product=product*2;
            }
            sum=sum+product;
        }
        System.out.println("Result is :"+sum);
    }
}
