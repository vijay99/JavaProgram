package com.array;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class SortArray {
    public static void main(String[] args) {
        int inputArray[]={-6,7,8,11,9,2,1,-9};
        System.out.println("Input Array is:"+ Arrays.toString(inputArray));
        bubbleSort(inputArray);
        System.out.println("Sorted Array is:"+ Arrays.toString(inputArray));
    }

    private static void bubbleSort(int[] inputArray) {
        boolean isAlreadySorted=true;
        for(int i=0;i<inputArray.length-1;i++){
            for(int j=0;j<inputArray.length-1-i;j++){
                if(inputArray[j]>inputArray[j+1]){
                    isAlreadySorted=false;
                    int temp=inputArray[j];
                    inputArray[j]=inputArray[j+1];
                    inputArray[j+1]=temp;
                }
            }
            if(isAlreadySorted)
                break;
        }
    }
}
