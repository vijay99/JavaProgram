package com.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @author Kumar Vijay
 */
public class frequencyOfMultipleElement {
    static HashMap<Integer, Integer> countOfElementMap = new HashMap<>();

    public static void main(String[] args) throws IOException {
        int inputArray[] = {2, 3, 2, 1, 2, 5, 3};
        System.out.println("Please provide the input element to find frequency");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int userInput = Integer.parseInt(br.readLine());
        getMap(inputArray, countOfElementMap);
        int frequency = findElementCount(countOfElementMap, userInput);
        System.out.println("Frequency of " + userInput + " is : " + frequency);

    }

    private static void getMap(int[] inputArray, HashMap<Integer, Integer> countOfElementMap) {
        for (int i = 0; i < inputArray.length; i++) {
            int element = inputArray[i];
            if (countOfElementMap.containsKey(element)) {
                countOfElementMap.put(element, countOfElementMap.get(element) + 1);
            } else
                countOfElementMap.put(inputArray[i], 1);
        }
    }

    private static int findElementCount(HashMap<Integer, Integer> countOfElementMap, int inputElement) {
        return countOfElementMap.get(inputElement) == null ? 0 : countOfElementMap.get(inputElement);
    }
}
