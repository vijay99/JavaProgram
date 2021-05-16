package com.triky.interview.question;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]) {
        int arr[] = {1,5, 4, 6, 3, 9,0};
        System.out.println("Input array:" + Arrays.toString(arr));
        sort(arr);
        System.out.println("After sorting Array is:" + Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        boolean check = false;
        for (int i = 0; i < arr.length - 1; i++) {
            check = false;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    check = true;
                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
            if (check == false)
                break;
        }
    }
}
