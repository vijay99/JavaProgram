package com.demo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Kumar Vijay
 */
public class FindAllPairsForTargetUsingHashMap {

    public static void main(String[] args) {
        int [] inputArr={1,2,3,5,7,9};
        System.out.println("Please Enter the target number:");
        Scanner sc = new Scanner(System.in);
        int target=sc.nextInt();

        printPairForTarget(inputArr,target);

    }
    private static void printPairForTarget(int inputArr[],int target){
        Set<Integer> mySet= new HashSet<>();
        int p;
        for(int n : inputArr){
            p=target-n;
            if( mySet.contains(p))
                System.out.println(n+","+p);

            mySet.add(n);
        }
    }
}
