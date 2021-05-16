package com.triky.interview.question;

/*public class FindMissingNumber {
    public static void main(String args[]) {
        int arr[] = {3,2, 4, 1,5,6,9,8};
        int n = arr.length + 1;
        int s1 = (n * (n + 1)) / 2;
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            s2 = s2 + arr[i];
        }
        System.out.println("Missing number is : " + (s1 - s2));
    }
}*/

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String args[]) {
        int arr[] = {1,3,4,-1,-2,2,6};
        int n = 6;
        int s1 = (n * (n + 1)) / 2;
        int s2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0)
            s2 = s2 + arr[i];
        }
        System.out.println("Missing number is : " + (s1 - s2));
    }
}

