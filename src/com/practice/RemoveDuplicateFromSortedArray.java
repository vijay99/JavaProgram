package com.triky.interview.question;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String args[]) {
        int arr[] = {1, 1, 1, 2, 2, 3, 4, 4, 4, 4,9,9};
        int length = uniqueArr(arr);
        System.out.println("Length of array is:" + length);
        System.out.println("Array after removing all duplicate is:");
        for(int i=0;i<length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    private static int uniqueArr(int[] arr) {
        int j = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (i < n - 1 && arr[i] == arr[i + 1])
                continue;
            else
                arr[j++] = arr[i];
        }
        return j;
    }
}
