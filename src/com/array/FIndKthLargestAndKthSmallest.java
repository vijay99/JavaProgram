package com.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kumar Vijay
 */
public class FIndKthLargestAndKthSmallest {
    public static void main(String[] args) {
        int inputArray[] = {6, 1, 0, -8, 9, 4};
        System.out.println("Input Array is:" + Arrays.toString(inputArray));
        sortTheArray(inputArray);
        System.out.println("Sorted Array is:" + Arrays.toString(inputArray));
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the kth value to which you want to get maximum and minimum :");
        int k=sc.nextInt();
        System.out.println(k+"th max and min is "+inputArray[inputArray.length-k]+","+inputArray[k-1]);;
    }

    private static void sortTheArray(int[] inputArray) {
        boolean isAlreadySorted = true;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    isAlreadySorted = false;
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j + 1];
                    inputArray[j + 1] = temp;
                }
            }
            if (isAlreadySorted)
                break;
        }
    }
}
