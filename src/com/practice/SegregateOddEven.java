package com.triky.interview.question;

import java.util.Arrays;

public class SegregateOddEven {
    public static void main(String args[]) {
        int arr[] = {5, 8, 4, 1, 2, 9, 7, 55, 12};
        System.out.println("Array before segregation:"+ Arrays.toString(arr));
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            if (arr[start] % 2 == 0)
                start++;
            else if (arr[end] % 2 != 0)
                end--;
            else {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }
        System.out.println("Array after segregation:"+ Arrays.toString(arr));
    }
}
