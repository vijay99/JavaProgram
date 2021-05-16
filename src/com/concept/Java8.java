package com.concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kumar Vijay
 */
public class Java8 {
    public static void main(String[] args) {
        String arr[] = {"Apple", "Mango", "Banana"};
        printOnlyEven();
        Java8 obj = new Java8();
        obj.multiplyEachByTen(arr);
        obj.flatMapExample();
    }

    private static void printOnlyEven() {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        List<Integer> onlyEvenNumber = integerList.stream().filter(value -> value % 2 == 0).collect(Collectors.toList());
        System.out.println("Only Even numbers are:" + onlyEvenNumber);
    }

    private void multiplyEachByTen(String arr[]) {
        List<Integer> fruitLengthList = Arrays.asList(arr).stream().map(fruit -> fruit.length()).collect(Collectors.toList());
        System.out.println("Length of each fruit is :" + fruitLengthList);
    }

    private void flatMapExample() {
        List<String> empList = new ArrayList<>();
        empList.add("Ruchika");
        empList.add("Vikram");
        empList.add("Pritish");
        empList.add("Parul");

        List<String> projectList = new ArrayList<>();
        empList.add("BigId");
        empList.add("AlenVault");
        empList.add("Splunk");
        empList.add("Qradar");

        List<List<String>> sacumen = new ArrayList<>();
        sacumen.add(empList);
        sacumen.add(projectList);

        List<String> flatMap = sacumen.stream().flatMap(value -> value.stream()).collect(Collectors.toList());
        System.out.println("Flat is : " + flatMap);
    }
}

