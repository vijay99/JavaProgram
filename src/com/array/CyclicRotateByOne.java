package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Kumar Vijay
 */
public class CyclicRotateByOne {
    public static void main(String[] args) {
        int inputArray[] = {5, 4, 2, 9, 8};
        System.out.println("Input Array:" + Arrays.toString(inputArray));
        int size = inputArray.length;
        int lastElement = inputArray[size - 1];
        for (int i = size - 1; i > 0; i--) {
            inputArray[i] = inputArray[i - 1];
        }
        inputArray[0] = lastElement;
        System.out.println("Cyclic array is:" + Arrays.toString(inputArray));


    }
}
