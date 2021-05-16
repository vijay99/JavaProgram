package com.practice;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple Java program to remove duplicate from unsorted array using map
 * Time complexity : O(n)
 */
public class RemoveDuplicateUsingMap {
    public static void main(String[] args) {
        int inputArr[] = {7, 2, 4, 9, 1, 2, 6, 6, 4};
        removeDuplicate(inputArr);
    }

    private static void removeDuplicate(int inputArr[]) {
        HashMap<Integer, Boolean> hashMap = new HashMap<>();

        for (int i = 0; i < inputArr.length; i++) {
            if (hashMap.get(inputArr[i]) == null)
                System.out.print(inputArr[i] + " ");
                hashMap.put(inputArr[i], true);
        }
    }
}
