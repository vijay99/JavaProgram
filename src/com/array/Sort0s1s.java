package com.array;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class Sort0s1s {
    public static void main(String[] args) {
        int inputArr[]={0,1,1,1,0,0,0,1};
        System.out.println("Provided in put Array is : "+Arrays.toString(inputArr));
        int s=0,e=inputArr.length-1;
        while(s<e){
            while (inputArr[s]==0 & s<e){
                s++;
            }
            while (inputArr[e]==1 & s<e){
                e--;
            }

            if(s<e){
                inputArr[s]=inputArr[s]+inputArr[e];
                inputArr[e]=inputArr[s]-inputArr[e];
                inputArr[s]=inputArr[s]-inputArr[e];
                s++;
                e--;
            }
        }
        System.out.println("Sorted input Array is  : "+Arrays.toString(inputArr));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
