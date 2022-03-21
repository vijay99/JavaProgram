package com.missionArrayAndString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Sacumen (www.sacumen.com)
 */
public class ReverseArray {

    public static void main(String[] args) {
        int inputArray[] = {3, 2, 1,5,99};
        System.out.println("Input array is :" + Arrays.toString(inputArray));
        reverseArray(inputArray);
        System.out.println("Reversed array is:" + Arrays.toString(inputArray));
    }

    private static void reverseArray(int[] inputArray) {
        int start = 0;
        int end = inputArray.length - 1;
        while (start < end) {
            inputArray[start] = inputArray[start] + inputArray[end];
            inputArray[end] = inputArray[start] - inputArray[end];
            inputArray[start] = inputArray[start] - inputArray[end];
            start++;
            end--;

        }
        List<String> list= new ArrayList<>();
    }


}
