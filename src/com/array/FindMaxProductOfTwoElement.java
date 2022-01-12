package com.array;

/**
 * @author Kumar Vijay
 */
public class FindMaxProductOfTwoElement {

    public static void main(String[] args) {
        int arr[] = {-7,2,9, 4, 5, 3, 6};
        int max1=arr[0];
        int max2=Integer.MIN_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max1){
                max2=max1;
                max1=arr[i];
            }
            else  if(arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("Max element is : "+max1);
        System.out.println("Second Max element is : "+max2);
    }
}
