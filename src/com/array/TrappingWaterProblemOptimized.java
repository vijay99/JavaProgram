package com.array;

/**
 * @author Kumar Vijay
 */
public class TrappingWaterProblemOptimized {

    public static void main(String[] args) {
        int arr [] = {3,0,4,0,2};
        int lo=0,hi=arr.length-1,leftMax=0,rightMax=0,result=0;

        while(lo<=hi){
            if(arr[lo]<arr[hi]) {
                if (arr[lo] > leftMax)
                    leftMax = arr[lo];
                else
                    result += leftMax - arr[lo];
                lo++;
            }
            else{
                if(arr[hi]>rightMax)
                    rightMax=arr[hi];
                else
                    result+=rightMax-arr[hi];
                hi--;
            }
        }
        System.out.println("Trapping water is : "+result);
    }
}
