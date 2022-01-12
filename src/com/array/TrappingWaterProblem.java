package com.test;

import java.util.Arrays;

/**
 * @author Kumar Vijay
 */
public class TrappingWaterProblem {
    public static void main(String[] args) {
        int orignalArr [] = {2,0,5,0,3,0,7};
        int leftMaxArr [] = new int[orignalArr.length];
        int rightMaxArr []= new int[orignalArr.length];

        int totalAccumulation=0;

        //create left max array
        int leftMaxVal=Integer.MIN_VALUE;
        for(int i=0;i<orignalArr.length;i++){
            if(orignalArr[i]>leftMaxVal){
                leftMaxVal=orignalArr[i];
            }
            leftMaxArr[i]=leftMaxVal;
        }
        Arrays.toString(leftMaxArr);
        //create right max array
        int rightMaxVal=Integer.MAX_VALUE;
        for(int i=orignalArr.length-1;i>=0;i--){
            if(rightMaxVal>orignalArr[i])
                rightMaxArr[i]=rightMaxVal;
        }


        //calculate accumulated water

        for(int i =0;i<orignalArr.length;i++){
            if(orignalArr[i]<Integer.min(leftMaxArr[i],rightMaxArr[i])){
                totalAccumulation +=Integer.min(leftMaxArr[i],rightMaxArr[i])-orignalArr[i];
                System.out.println(totalAccumulation);
            }
        }
        System.out.println("Accumulated water is:"+totalAccumulation);
    }



}
