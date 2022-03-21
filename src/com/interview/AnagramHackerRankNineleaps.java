package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AnagramHackerRankNineleaps {
    public static void main(String[] args) {
       /* String arr1 [] ={"eat","pen","top"};
        String arr2 [] ={"tea","ten","lots"};*/
        List<String> list1 = new ArrayList<>(Arrays.asList("eat", "abc", "top"));
        List<String> list2 = new ArrayList<>(Arrays.asList("tea", "def", "lots"));

        List<Integer> list = getList(list1, list2);
        System.out.println(list);
    }

    private static List<Integer> getList(List<String> list1, List<String> list2) {
        List<Integer> myList = new ArrayList<>();

        for (int i = 0; i < list1.size(); i++) {

            String s1 = list1.get(i);
            String s2 = list2.get(i);

            if (s1.length() != s2.length())
                myList.add(-1);
            else {
                char[] charArr1 = s1.toCharArray();
                char[] charArr2 = s2.toCharArray();

                int matchedCount = 0;
                for (int j = 0; j < charArr1.length; j++) {
                    for (int k = 0; k < charArr2.length; k++) {
                        if (charArr1[j] == charArr2[k])
                            matchedCount++;
                    }
                }
                myList.add(charArr1.length - matchedCount);
            }

        }
        return myList;
    }
}
