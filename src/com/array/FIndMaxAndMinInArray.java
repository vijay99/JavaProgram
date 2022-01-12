package com.array;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class FIndMaxAndMinInArray {
    public static void main(String[] args) {
        int inputArray []={1,3,4,5};
        System.out.println("Input Array is :"+ Arrays.toString(inputArray));
        sortInputArray(inputArray);
        System.out.println("Max and Min is:"+inputArray[inputArray.length-1]+","+inputArray[0]);

    }

    private static void sortInputArray(int inputArray[]) {
         boolean isAlreadySorted=true;
        for(int i=0;i<inputArray.length-1;i++){
            for(int j=0;j<inputArray.length-1-i;j++){
                if(inputArray[j]>inputArray[j+1])
                {
                    isAlreadySorted=false;
                    inputArray[j]=inputArray[j]+inputArray[j+1];
                    inputArray[j+1]=inputArray[j]-inputArray[j+1];
                    inputArray[j]=inputArray[j]-inputArray[j+1];
                }
            }
            if(isAlreadySorted){
                System.out.println("Input array is sorted,in "+i+"th pass");
                break;
            }
        }
    }


}
