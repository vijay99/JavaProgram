package com.triky.interview.question;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortListJava8 {
    public static void main(String args[]){
        List<Integer> integerList = new ArrayList<>();
        integerList.add(10);
        integerList.add(60);
        integerList.add(20);
        integerList.add(90);
        integerList.add(11);
        System.out.println("Before Sorting:"+integerList);
        sortList(integerList);
    }

    private static void sortList(List<Integer> integerList) {
        //List<Integer> sortedList=integerList.stream().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        List<Integer> sortedList=integerList.stream().sorted((o1,o2) ->o1.compareTo(o2)).collect(Collectors.toList());
        System.out.println(sortedList);
    }
}
