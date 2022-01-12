package com.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Kumar Vijay
 */
public class FindFirstRepeatingElement {
    public static void main(String[] args) {
        int arr[] = {10, 23, 1, 45,10, 90,23};
        printFirstRepeating(arr);
    }

    private static void printFirstRepeating(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                System.out.println("First repeating element in array is " + arr[i]);
                break;
            }
            set.add(arr[i]);
        }
    }
}
