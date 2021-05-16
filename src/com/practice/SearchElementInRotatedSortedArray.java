package com.triky.interview.question;

import java.util.Scanner;

public class SearchElementInRotatedSortedArray {
    public static void main(String args[]) {
        int arr[] = {4, 5, 1, 2, 3};
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Please enter the target element:");
        int target = keyboardInput.nextInt();
        int index = searchInRotatedSortedArray(arr, target);
        if (index == -1)
            System.out.println("Target is not in array:");
        else
            System.out.println("Target is on index :" + index);
    }

    private static int searchInRotatedSortedArray(int[] arr, int target) {
        int start = 0, end = arr.length - 1, mid = (start + end) / 2;

        while (start <= end) {
            mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[start] <= arr[mid]) { //left part is sorted
                if (target < arr[mid] && target >= arr[start])  //target lies in between start and mid
                    end = mid - 1;
                else
                    start = mid + 1;
            } else //right part is sorted
            {
                if (target > arr[mid] && target <= arr[end]) //target lies between mid and end index
                    start = mid + 1;
                else
                    end = mid - 1;

            }
        }
        return -1;
    }
}
