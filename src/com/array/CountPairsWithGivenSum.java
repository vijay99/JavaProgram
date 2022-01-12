package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kumar Vijay
 */
public class CountPairsWithGivenSum {
   /* public static void main(String[] args) throws IOException {
        int arr[] = {3, 4, 1, 5, 2};
        System.out.println("Input Array is :"+Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Sorted Array is:"+ Arrays.toString(arr));
        System.out.println("Input sum value");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum=Integer.parseInt(br.readLine());
        int s=0,e=arr.length-1;
        while (s<e){
            if(sum==(arr[s]+arr[e])) {
                System.out.println(arr[s] + " " + arr[e]);
                s++;
                e--;
            }
            else if(sum>(arr[s]+arr[e]))
                s++;
            else
                e--;
        }
    }

    private static void sortArray(int[] arr) {
        boolean isAlreadySorted = true;
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    isAlreadySorted=false;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if(isAlreadySorted)
                break;
        }
    }*/


    public static void main(String[] args) {
        int arr[] ={5,4,9,1,0};
        Set<Integer> set = new HashSet<>();
        System.out.println("Please enter sum value:");
        Scanner sc = new Scanner(System.in);
        int sum=Integer.parseInt(sc.next());

        for(int i=0;i<arr.length;i++){
            if(set.contains(sum-arr[i]))
                System.out.println(arr[i]+" "+(sum- arr[i]));
            set.add(arr[i]);
        }
    }
}
