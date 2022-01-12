package com.array;

import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class ReverseArray {
    public static void main(String[] args) {
        int inputArray[] = {8, 5, 4, 1, 9, 2};
        System.out.println("Input Array is:" + Arrays.toString(inputArray));
        reverseArray(inputArray);
        System.out.println("Reverse array is:" + Arrays.toString(inputArray));
    }

    private static void reverseArray(int[] inputArray) {

        int start = 0, end = inputArray.length - 1;
        while (start < end) {
            inputArray[start] = inputArray[start] + inputArray[end];
            inputArray[end] = inputArray[start] - inputArray[end];
            inputArray[start] = inputArray[start] - inputArray[end];
            start++;
            end--;
        }
    }


}
