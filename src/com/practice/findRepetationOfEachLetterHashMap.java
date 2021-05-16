package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class findRepetationOfEachLetterHashMap {
    public static void main(String[] args) {
        System.out.println("Please enter the word:");
        Scanner sc= new Scanner(System.in);
        String str=sc.next();
        Map<Character, Integer> map = new HashMap<>();

        char strArr[] = str.toCharArray();

        for (char c : strArr) {
            if (map.containsKey(c))
                map.put(c, map.get(c) + 1);
            else
                map.put(c, 1);
        }
        System.out.println(map);
    }
}
