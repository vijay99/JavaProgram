package com.array;

/**
 * @author Kumar Vijay
 */
public class CountPairWithGivenSum {
    public static void main(String[] args) {
        int arr [] ={2,3,4,1,5,0};
        int count=0;
        int sum=5;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(sum==arr[i]+arr[j])
                    count++;
            }
        }
        System.out.println("Count of pair of goven sum is : "+count);
    }
}
