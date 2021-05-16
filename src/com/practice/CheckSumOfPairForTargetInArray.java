package com.practice;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Simple Java program to check if sum of two element (pair of element) exist in array for given target number.
 *  We are applying Sorting and Two-Pointers technique.
 */
public class CheckSumOfPairForTargetInArray {
    public static void main(String[] args) {
        int[] inputArray = {2, 4, 1, -2, 6, 3};
        System.out.println("Input array is:" + Arrays.toString(inputArray));
        System.out.println("Please enter the target number value:");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        Boolean isPairExist = checkPairExistForTarget(inputArray, target);
        if (isPairExist)
            System.out.println("Pair exist in Array!");
        else
            System.out.println("Pair doesn't exist in Array!");

    }

    private static boolean checkPairExistForTarget(int[] inputArray, int target) {
        //Sort the input array
        Arrays.sort(inputArray);
        int start = 0, end = inputArray.length - 1;
        while (start < end) {
            if (inputArray[start] + inputArray[end] == target)
                return true;
            else if (inputArray[start] + inputArray[end] > target)
                end--;
            else
                start++;
        }
        return false;
    }

}
