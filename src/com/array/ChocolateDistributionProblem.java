package com.array;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class ChocolateDistributionProblem {

    public static void main(String[] args) {
        int arr[]={3, 4, 1, 9, 56, 7, 9, 12};
        Arrays.sort(arr);
        System.out.println("Sorted Array is:"+Arrays.toString(arr));
        //number of student among chocolate should be distributed
        int m=3;
        int minDiff=Integer.MAX_VALUE;
        int indexS=Integer.MAX_VALUE;
        int indexE=Integer.MAX_VALUE;

        for(int i=0;i+m-1<arr.length;i++){
            if((arr[i+m-1]-arr[i])<minDiff){
                minDiff=arr[i+m-1]-arr[i];
                indexS=i;
                indexE=i+m-1;
            }
        }

        System.out.println("minDiff = "+minDiff);
        System.out.println("minS = "+indexS);
        System.out.println("minE = "+indexE);
        /*for(int i=minS;minS<=minE;minS++){
            System.out.print(arr[minS]+" ");
        }*/
    }
}
