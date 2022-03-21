package com.interview;

import java.util.TreeSet;

public class FarthestFromZeroHealthEdge {
    public static void main(String[] args) {
       // int arr [] = {1,3,5,-2,0,1,4};
          int arr [] = {1,-5,3,5,-2,0,1,4};

        int farthestElement=farthestElement(arr,arr.length);
        System.out.println(farthestElement);
    }

    private static int farthestElement(int[] arr, int n) {
        TreeSet<Integer> ts = new TreeSet<>();

        for(int i=0;i<n;i++){
            ts.add(arr[i]);
        }

        System.out.println(ts);

        int maxVal=ts.last();
        int minVal=ts.first();

        if(Math.abs(minVal)>=maxVal)
        {
            return minVal;
        }
       return maxVal;
    }
}
