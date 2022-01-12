package com.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Kumar Vijay
 */
public class CountFrequencyOfLetter {
    public static void main(String[] args) throws IOException {
        System.out.println("Please Enter the String:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        char charArr[]=inputStr.toCharArray();

        Map<Character,Integer> myMap= new HashMap<>();
        for(char c : charArr){
            if(myMap.containsKey(c))
                myMap.put(c,myMap.get(c)+1);
            else
                myMap.put(c,1);
        }
        System.out.println(myMap);
    }
}
