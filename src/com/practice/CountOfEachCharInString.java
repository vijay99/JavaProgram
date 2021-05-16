package com.triky.interview.question;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOfEachCharInString {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide the input String:");
        String str = sc.next();
        Map<Character, Integer> charCountMap = new HashMap();

        for (Character c : str.toCharArray()) {
            if (charCountMap.containsKey(c))
                charCountMap.put(c, charCountMap.get(c) + 1);
            else
                charCountMap.put(c, 1);
        }

        for (Map.Entry entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
            if ((Integer) entry.getValue() == 1)
                System.out.println("Character " + entry.getKey() + " occurred for only one time");
        }

    }

}
