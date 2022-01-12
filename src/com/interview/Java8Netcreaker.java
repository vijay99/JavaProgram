package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Kumar Vijay
 */
//Write java 8 program to sort in natural order: "abc", "aaa", "cbf"
public class Java8Netcreaker {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>(Arrays.asList("abc", "aaa", "cbf"));

        List<String> sortedList = strList.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);
    }
}
