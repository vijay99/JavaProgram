package com.array;

import java.util.Scanner;

/**
 * @author Kumar Vijay
 */
public class FindOccuranceOfElement {
    public static void main(String[] args) {
        int arr[]={5,2,3,4,5,6,5};
        int count=0;
        System.out.println("Enter element to find frequency : ");
        Scanner sc = new Scanner(System.in);
        int element =Integer.parseInt(sc.next());
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element)
                count++;
        }
        System.out.println("Frequency od element is :"+count);
    }
}
