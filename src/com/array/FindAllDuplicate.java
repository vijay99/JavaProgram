package com.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kumar Vijay
 */
public class FindAllDuplicate {
    public static void main(String[] args) {
        int arr[]={2,3,4,2,5,4,2};
        Map<Integer,Integer> myMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(myMap.containsKey(arr[i])){
                myMap.put(arr[i],myMap.get(arr[i])+1);
            }
            else {
                myMap.put(arr[i],1);
            }
        }
        for(int n :myMap.keySet()){
            if(myMap.get(n)>1){
                System.out.println(n+"times "+myMap.get(n));
            }
        }
        System.out.println(myMap);
    }
}
