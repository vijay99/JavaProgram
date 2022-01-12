package com.array;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class Sort0s1s2s {
    public static void main(String[] args) {
        int inputArray[] = {0,2, 0, 0, 0, 1, 1,0,0,0};
        System.out.println("Input Array is:" + Arrays.toString(inputArray));
        int zeroCount = 0;
        int oneCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == 0)
                zeroCount++;
            else if (inputArray[i] == 1)
                oneCount++;
        }

        for (int i = 0; i < inputArray.length; i++) {
            if (i < zeroCount)
                inputArray[i] = 0;
            else if (i >= zeroCount && i < (oneCount + zeroCount))
                inputArray[i] = 1;
            else
                inputArray[i] = 2;
        }
        System.out.println("Sorted input arrays is:" + Arrays.toString(inputArray));
    }
}
