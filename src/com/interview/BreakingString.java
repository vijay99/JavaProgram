package com.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BreakingString {
    public static void main(String[] args) {
        // input : abc "def ghi"
        // output : ["abc", "def ghi"]


        String str ="abc \"def ghi\"";
      //  String str = "Location \"Welcome  to india\" Bangalore " +"Channai \"IT city\"  Mysore";

        List<String> list = new ArrayList<>();
        Matcher m = Pattern.compile("([^\"]\\S*|\".+?\")\\s*").matcher(str);
        while (m.find())
        {
            list.add(m.group(1));
        }

        System.out.println(list);
    }

}
