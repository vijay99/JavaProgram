package com.interview;

public class AnagramDifference {
    public static void main(String[] args) {
        String s1="penac"; //acenp
        String s2="nlpdc";//cdlnp

        int diff=0;

        for(int i=0;i<s1.length();i++){
            for(int j=0;j<s2.length();j++){
                if(s1.charAt(i)==s2.charAt(j))
                    diff++;
            }
        }
        System.out.println("diff is :"+diff);
    }
}
