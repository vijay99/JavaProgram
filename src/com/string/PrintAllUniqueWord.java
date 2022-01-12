package com.string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kumar Vijay
 */
public class PrintAllUniqueWord {
    public static void main(String[] args) throws IOException {
        System.out.println("Please enter the input String");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString = br.readLine();
        String [] strArr= inputString.split(" ");
        int count;

        for (int i = 0; i < strArr.length; i++) {
            count = 1;
            for (int j = i; j < strArr.length - 1; j++) {
                if (strArr[j] == strArr[j + 1])
                    count++;
            }
            if (count == 1)
                System.out.println("unique word is " + strArr[i]);

        }
    }
}
