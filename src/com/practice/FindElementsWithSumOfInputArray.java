package com.triky.interview.question;

import java.util.Arrays;
import java.util.Scanner;

//complexity of below program is O(n^2)
/*public class FindElementsWithSumOfInputArray {

    public static void main(String args[]) {
        int arr[] = {9, 6, 7, 2, 1, 9};
        int n = arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the value of K:");
        int k = sc.nextInt();
        System.out.println("Value of k is:" + k);
        findElements(arr, n, k);
    }

    private static void findElements(int[] arr, int n, int k) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == k)
                    System.out.println("Elements are :" + "(" + arr[i] + "," + arr[j] + ")");
            }
        }
    }
}*/

//This is more efficient as complexity of this program is O(nlog(n))
public class FindElementsWithSumOfInputArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the value of K:");
        int k = sc.nextInt();
        int arr[] = {2, 6, 5, 8, 4, 3, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int start = 0, end = arr.length - 1;

        while (start < end) {
            if (arr[start] + arr[end] == k) {
                System.out.println("(" + arr[start] + "," + arr[end] + ")");
                start++;
                end--;
            } else if (arr[start] + arr[end] > k)
                end--;
            else
                start++;
        }
    }
}
