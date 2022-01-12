package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class FindCountOfAllPairForGivenSum {

    public static void main(String[] args) throws IOException {
        int arr[] = {2, 3, 9, 5, 0, 6,1,4};
        System.out.println("Input Array is :" + Arrays.toString(arr));
        System.out.println("Please enter the sum value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        sortTheArray(arr);
        System.out.println("Sorted Array is : " + Arrays.toString(arr));
        System.out.println("There are "+getCountofPair(arr,sum)+" pairs for given sum");
    }

    private static int getCountofPair(int[] arr, int sum) {
        int s=0,l=arr.length-1;
        int countOfPair=0;

        while (s<l){
            if(arr[s]+arr[l]==sum) {
                countOfPair++;
                s++;
                l--;
            }
            else if(arr[s]+arr[l]>sum){
                l--;
            }
            else
                s++;
        }
        return countOfPair;
    }

    private static void sortTheArray(int[] arr) {
        boolean isAlreadySorted = true;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isAlreadySorted = false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (isAlreadySorted)
                break;
        }
    }
}
