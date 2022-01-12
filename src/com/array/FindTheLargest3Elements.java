package com.array;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class FindTheLargest3Elements {
    public static void main(String[] args) {
        int arr []={2,4,1,8,3,12,0,19};
        System.out.println("Input Array is:"+ Arrays.toString(arr));
        sortArray(arr);
        System.out.println("Input Array is:"+ Arrays.toString(arr));
        int n=arr.length-1;
        System.out.println("Three largest element in array are : "+arr[n]+" "+arr[n-1]+" "+arr[n-2]);
    }

    private static void sortArray(int[] arr) {
        int temp;
        boolean isAlreadySorted=true;
        for(int i =0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    isAlreadySorted=false;
                     temp=arr[j];
                     arr[j]=arr[j+1];
                     arr[j+1]=temp;
                }
            }
            if(isAlreadySorted)
                break;
        }
    }
}
