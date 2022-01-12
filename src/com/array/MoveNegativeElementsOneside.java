package com.array;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class MoveNegativeElementsOneside {
    public static void main(String[] args) {
        int inputArray[] = {-3, 4, 7, 8, 1, -6, 4, -2};
        System.out.println("Input Array is :" + Arrays.toString(inputArray));
        sort(inputArray);
        System.out.println("After moving negative left side :" + Arrays.toString(inputArray));
    }

    private static void sort(int[] inputArray) {
        boolean isAlreadySorted = true;
        for (int i = 0; i < inputArray.length - 1; i++) {
            for (int j = 0; j < inputArray.length - 1 - i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    isAlreadySorted = false;
                    inputArray[j] = inputArray[j] + inputArray[j + 1];
                    inputArray[j + 1] = inputArray[j] - inputArray[j + 1];
                    inputArray[j] = inputArray[j] - inputArray[j + 1];
                }
            }
            if (isAlreadySorted)
                break;
        }
    }
}
