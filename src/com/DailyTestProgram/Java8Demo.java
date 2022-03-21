package com.DailyTestProgram;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Demo {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        List<Integer> evenList = integerList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        // System.out.println(evenList);


        List<Integer> myMapping = integerList.stream().map(n -> n * 10).collect(Collectors.toList());
        // System.out.println(myMapping);

        List<Sweet> mySweetList = Arrays.asList(new Sweet("sweet", 4, 100),
                new Sweet("soar", 4, 200), new Sweet("mix", 1, 300));


       // Map<Integer, Sweet> myMap = mySweetList.stream().collect(Collectors.toMap(s -> s.getRating(), s -> s,(s1,s2) -> s1.getPrice()<=s2.getPrice()?s1:s2,() -> new TreeMap<>()));

       /* for (Map.Entry<Integer, Sweet> entry : myMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/

        Map<Integer,List<Sweet>> myMapwithList = mySweetList.stream().collect(Collectors.groupingBy(s -> s.getRating()));

       for(Map.Entry<Integer,List<Sweet>> entry : myMapwithList.entrySet()){
           System.out.println(entry.getKey());
           List<Sweet> list =entry.getValue();
           for(Sweet sweet : list){
               System.out.println(sweet);
           }
       }


    }
}



//Functional interface
//1.Predicate<T>  boolean test(T t)
//2.Function<T,R>  ,BineryOperator(input and out of same type),Bi-function<T,Q,R>  R apply(T t,Q q)
//3.Consumer<T> accept(T t)
//4.Supplier<T>  T get(T t)

class Sweet {
    String type;
    int rating;
    double price;

    public Sweet(String type, int rating, double price) {
        this.type = type;
        this.rating = rating;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "type='" + type + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}