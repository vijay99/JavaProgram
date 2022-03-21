package com.array;


import java.util.Arrays;

public class DemoTrappingWater {
    public static void main(String[] args) {
        int arr [] ={1,0,3,0,2,0,4,0,1};
        System.out.println("Original array is :"+Arrays.toString(arr));
        int result=0;

        int leftMax,rightMax;
        int leftArr []= new int[arr.length];
        int rightArr [] = new int[arr.length];

        leftMax=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=leftMax)
                leftMax=arr[i];
            leftArr[i]=leftMax;
        }

        System.out.println("leftArr is :"+ Arrays.toString(leftArr));
        rightMax=arr[arr.length-1];
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]>=rightMax)
                rightMax=arr[i];
            rightArr[i]=rightMax;
        }
        System.out.println("rightArr is :"+ Arrays.toString(rightArr));
        for(int i=0;i<arr.length;i++){
            result=result + (Math.min(leftArr[i],rightArr[i]) - arr[i]);
        }

        System.out.println("Accumulated water is : "+result);
    }
}
