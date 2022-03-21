package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HealSoftwareJava8 {
    public static void main(String[] args) {
        List<User> myList = new ArrayList<>( Arrays.asList(new User("Amit","IT","Male"),
                new User("Rekha","HR","Female"),new User("Pankaj","Sales","Male")));

        Map<String,List<User>> myMap=myList.stream().collect(Collectors.groupingBy( emp ->emp.gender));

        for(Map.Entry<String,List<User>> entry : myMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().size());

           /* for(User user :entry.getValue()){
                System.out.println(user);
            }*/
        }


    }
}

class User{

    public User(String name, String dept, String gender) {
        this.name = name;
        this.dept = dept;
        this.gender = gender;
    }

    String name;
    String dept;
    String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}