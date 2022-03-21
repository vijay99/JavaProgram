package com.missionArrayAndString;

import java.util.Arrays;

/**
 * @author Sacumen (www.sacumen.com)
 */
public class FindMaxMinInArray {
    public static void main(String[] args) {
        int inputArray[] = {66,5, 6, 0,9, 2,10};
        System.out.println("Input Array is :" + Arrays.toString(inputArray));
        sortTheArray(inputArray);
        System.out.println("Max Element in Array is:" + inputArray[inputArray.length - 1]);
        System.out.println("Min Element in Array is:" + inputArray[0]);
    }

    private static void sortTheArray(int[] inputArray) {
        if (inputArray.length == 1) {
            System.out.println("Array should contains at least 2 element");
            return;
        }
        boolean isArrayAlreadySorted=true;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    isArrayAlreadySorted=false;
                    inputArray[j] = inputArray[j] + inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j] - inputArray[j + 1];
                    inputArray[j] = inputArray[j] - inputArray[j + 1];
                }
            }
            if(isArrayAlreadySorted)
                break;
        }
    }
}
