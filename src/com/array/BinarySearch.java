package com.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Kumar Vijay
 */
public class BinarySearch {
    int Value =10;
    public static void main(String[] args) {
        int arr[] = {2,6,1,9,4,7};
        Arrays.sort(arr);
        System.out.println("Array is "+ Arrays.toString(arr));
        System.out.println("Enter the element you want to search :");
        Scanner sc = new Scanner(System.in);
        int element=Integer.parseInt(sc.next());
        int s=0,e=arr.length-1,mid;
        boolean isFound=false;
        while (s<=e) {
            mid = (s + e) / 2;

            if (arr[mid] == element) {
                isFound = true;
                s++;
                e--;
                System.out.println("Element is at index : " + mid);
                break;
            } else if (element > arr[mid]) {
                s = mid + 1;
            } else
                e = mid - 1;
        }
        if(!isFound){
            System.out.println("Element not found in array.");
        }
    }
}
