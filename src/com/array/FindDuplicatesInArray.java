package com.array;

/**
 * @author Kumar Vijay
 */
public class FindDuplicatesInArray {
    public static void main(String[] args) {


        int arr[] = {2,2, 5, 2, 0,0};
        int count;
        for (int i = 0; i < arr.length-1;i++){
            count=1;
            for( int j=i;j<arr.length-1;j++){
                if(arr[i]==arr[j+1])
                    count++;
            }
            if(count==2) {
                //System.out.println("Element "+arr[i]+" appears "+count+" times.");
                System.out.println("Duplicate elements are:" + arr[i]);
            }
        }
    }
}
