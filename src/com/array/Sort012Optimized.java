package com.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Kumar Vijay
 */
public class Sort012Optimized {
    public static void main(String[] args) {
        int arr []={2,1,2,0,1,2,0};
        int lo=0,m=0,hi=arr.length-1;
        while (m<=hi){
            if(arr[m]==0){
               arr[lo]=arr[lo]+arr[m];
               arr[m]=arr[lo]-arr[m];
               arr[lo]=arr[lo]-arr[m];
               lo++;
               m++;
            }
            else if(arr[m]==1){
                m++;
            }
            else if(arr[m]==2){
                arr[m]=arr[m]+arr[hi];
                arr[hi]=arr[m]-arr[hi];
                arr[m]=arr[m]-arr[hi];
                hi--;
            }
        }
        System.out.println("Sorted arrays is :"+ Arrays.toString(arr));
    }
}
