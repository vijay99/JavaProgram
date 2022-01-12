package com.interview;

import java.util.Arrays;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class ReverseSameArrayHPE {
    public static void main(String[] args) {
        //
        int intArr [] ={5,2,6,4};
        //output :4,6,2,5
        /*int j=0;
        for(int i=intArr.length-1;i>=0;i--){
            intArr[j++]=intArr[i];
        }
        System.out.println(Arrays.toString(intArr));*/
        int s=0,e=intArr.length-1;
        int temp;
        while (s<e){
           temp=intArr[s];
           intArr[s]=intArr[e];
           intArr[e]=temp;
           s++;
           e--;
        }
        System.out.println(Arrays.toString(intArr));
    }
}


