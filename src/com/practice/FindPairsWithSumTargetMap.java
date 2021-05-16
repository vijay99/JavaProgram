package com.practice;

/**
 * Created by Kumar Vijay on 01/05/21.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Complexity Analysis:
 *
 * Time Complexity: O(n).As the whole array is needed to be traversed only once.
 * Auxiliary Space: O(n).A hash set has been used to store array elements.
 */
public class FindPairsWithSumTargetMap {
    public static void main(String[] args) throws IOException {
        {
            int inputArr[]={3,4,-1,2,0};
            System.out.println("Please enter the target element:");
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int target=Integer.parseInt(br.readLine());
            Set<Integer> set = new HashSet<>();
            for(int i=0;i<inputArr.length;i++){
                if(set.contains(target-inputArr[i])) {
                    int temp = target - inputArr[i];
                    System.out.println(+inputArr[i] + "," + temp);
                }

                else
                    set.add(inputArr[i]);
            }
        }
    }
}
