package com.interview;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNonRepetativeAccolite {

    //"swiss" 'w' is the first non-repeated character -

    public static void main(String[] args) {
        String str ="swiss";
        char [] charArr= str.toCharArray();
        HashMap<Character,Integer> myMap = new LinkedHashMap<>();

        for(char c : charArr){
            if(myMap.containsKey(c))
                myMap.put(c,myMap.get(c)+1);
            else
                myMap.put(c,1);
        }
        for( char c : charArr){
            if(myMap.get(c)==1) {
                System.out.println(c + ": " + myMap.get(c));
                break;
            }
        }

        //System.out.println(myMap);
    }
}
