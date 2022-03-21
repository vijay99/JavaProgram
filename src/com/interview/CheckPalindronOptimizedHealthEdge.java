package com.interview;

public class CheckPalindronOptimizedHealthEdge {
    public static void main(String[] args) {
        //palindrome check

        String str = "nitina";


        boolean isPalindome = check(str);

        System.out.println("Is palindrome ? "+isPalindome);

    }

    private static boolean check(String str) {
        int s = 0, e = str.length() - 1;
        while (s < e) {

            if (str.charAt(s) == str.charAt(e)) {
                s++;
                e--;
                continue;
            } else
                return false;

        }

        return true;
    }
}



