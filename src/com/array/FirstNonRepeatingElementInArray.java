package com.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Kumar Vijay
 */
public class FirstNonRepeatingElementInArray {
    //O(n2)
    /*public static void main(String[] args) {
        int arr[] = {3, 4, 5, 5, 3, 9, 4, 1};
        int n = arr.length;
        System.out.println("First non repeating element is :" + printFirstNonRepeating(arr, n));
    }

    private static int printFirstNonRepeating(int[] arr, int n) {

        for (int i = 0; i < arr.length; i++) {
            int j;
            for (j = 0; j < arr.length; j++) {
                if (i != j & arr[i] == arr[j])
                    break;
            }
            if (j == n)
                return arr[i];

        }
        return -1;
    }*/

    //hashmap way (efficient way) O(n)
    public static void main(String[] args) {
        int arr[] = {3, 4, 5, 5, 3, 9, 4, 1};

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);

        }

        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                System.out.println("First Non repeating element is :"+arr[i]);
                break;
            }

        }
    }





}