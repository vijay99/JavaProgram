package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
//Logic is applicable to unsorted non zero array
public class FindSubArrayForGivenSum {
    public static void main(String[] args) throws IOException {
        int arr[] = {7, 3, 5, 6};
        System.out.println("Input Arrays is:" + Arrays.toString(arr));
        System.out.println("Please enter sum value:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = Integer.parseInt(br.readLine());
        findSubArray(arr, sum);
    }

    private static int findSubArray(int[] arr, int sum) {
        int curr_sum, i, j;
        //pick a starting point
        for (i = 0; i < arr.length; i++) {
            curr_sum = arr[i];
            //Try all sub array starting with 'i'
            for (j = i + 1; j <=arr.length; j++) {
                if (curr_sum == sum) {
                    int p = j - 1;
                    System.out.println("Sum is zero for indexes " + i + " to " + p);
                    return 1;
                }
                if (curr_sum > sum || j == arr.length)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }
        System.out.println("No sub array found:");
        return -1;
    }
}
