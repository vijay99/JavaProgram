package com.triky.interview.question;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String args[]) {
        int arr[] = {3, 6, 8,12,15,18};
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the element you  want to search:");
        int k = sc.nextInt();
        search(arr, k);
    }

    private static void search(int[] arr, int k) {
        int start = 0, end = arr.length - 1, mid;
        boolean isPresent = false;
        while (start <= end) {
            mid = (start + end) / 2;
            if (k == arr[mid]) {
                isPresent = true;
                break;
            } else if (k > arr[mid])
                start = mid+1;
            else
                end = mid-1;
        }
        if (isPresent)
            System.out.println("Element is present in array:");
        else
            System.out.println("Element is not present in array:");
    }
}
