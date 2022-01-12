package com.interview;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class PrintMissingNumberRingCentral {
    public static void main(String[] args) {
        //input arr : 1,2,3,5,6,7,8,9,10,15
        //output :4,11-14

        int arr[] = {1, 2, 3, 5, 6, 7, 8, 9, 10, 11};

        int temp = arr[0] - 1;
        for (int i = 0; i < arr.length; i++) {
            temp++;
            if (temp == arr[i]) {
                continue;
            } else {
                System.out.print(arr[i] + " ");
            }

        }
    }

}
