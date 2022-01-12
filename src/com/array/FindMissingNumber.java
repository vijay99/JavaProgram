package com.array;

/**
 * @author Kumar Vijay
 */
public class FindMissingNumber {
    public static void main(String[] args) {
        int inputArray[] = {1, 2, 3, 5};
        int n = 5;
        int sumTotal = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < inputArray.length; i++) {
            sum = sum + inputArray[i];
        }
        System.out.println("Missing number is:"+(sumTotal-sum));

    }
}


