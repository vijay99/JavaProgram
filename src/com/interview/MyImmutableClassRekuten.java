package com.interview;


import java.util.HashMap;
import java.util.Map;


final class MyImmutableClassRekuten {
   private  int id;
   private  String name;
   private  Map<Integer,String> myMap;

    public MyImmutableClassRekuten(int id, String name, Map<Integer, String> myMap) {
        this.id = id;
        this.name = name;
       /* Map<Integer,String> myCloneMap = new HashMap<>();
         for(Map.Entry<Integer,String> entry : myMap.entrySet()){
             myCloneMap.put(entry.getKey(),entry.getValue());
         }
        this.myMap = myCloneMap;*/
        this.myMap=myMap;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Map<Integer, String> getMyMap() {
        Map<Integer,String> myCloneMap = new HashMap<>();
        for(Map.Entry<Integer,String> entry : myMap.entrySet()){
            myCloneMap.put(entry.getKey(),entry.getValue());
        }


        return myCloneMap;
    }
}
 //
