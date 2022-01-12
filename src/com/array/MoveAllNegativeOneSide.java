package com.array;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
/*
public class MoveAllNegativeOneSide {
    public static void main(String[] args) {
        int arr []={-2,-4,15,-1};
        System.out.println("Array before :"+ Arrays.toString(arr));
        int j=0;
        int temp;
        for(int i=0;i< arr.length;i++){
            if(arr[i]<0){
                if(i!=j){
                   */
/* temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;*//*

                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
                j++;
            }
        }
        System.out.println("Array after :"+ Arrays.toString(arr));

    }
}
*/

public class MoveAllNegativeOneSide {
    public static void main(String[] args) {
        int arr[]={2,3,-1,-4};
        int s=0,e=arr.length-1;

        while (s<e){
            if(arr[s]<0 && arr[e]<0)
                s++;
            else if(arr[s]>0 && arr[e]<0){
                arr[s]=arr[s]+arr[e];
                arr[e]=arr[s]-arr[e];
                arr[s]=arr[s]-arr[e];
                s++;
                e--;
            }
            else if(arr[s]>0 && arr[e]>0){
                e--;
            }
        }
        System.out.println("Array after sorting:"+Arrays.toString(arr));
    }
}
