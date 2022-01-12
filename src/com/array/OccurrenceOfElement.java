package com.array;

import java.util.Scanner;

/**
 * @author Kumar Vijay
 */
public class OccurrenceOfElement {
    public static void main(String[] args) {
        int inputArray[] = {0, 1, 1, 2, 0, 1, 2};
        System.out.println("Enter the element");
        Scanner sc = new Scanner(System.in);
        int element = sc.nextInt();
        int countOfOccurrence = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (element == inputArray[i]) {
                countOfOccurrence++;
            }
        }
        System.out.println("Element " + element + " Occurred " + countOfOccurrence + " times.");
    }
}
