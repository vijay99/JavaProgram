package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kumar Vijay
 */
public class ImmutabilityJPMorgan {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("DS");
        list.add("Algo");
        list.add("Core Java");

        Age age = new Age();
        age.setDay(1);
        age.setMonth(2);
        age.setYear(1989);
        Student student = new Student(10, "Vijay", list,age);

       /* System.out.println("Year Before modification is : "+student.getAge().getYear());
        age.setYear(2021);
        System.out.println("Year After modification is : "+student.getAge().getYear());


        List<String> skillList = student.getSkillList();
        System.out.println("List of  skills before modification : " + skillList);
        list.add("Microservices");
        System.out.println("List of  skills after modification : " + skillList);
*/


        System.out.println("Year Before modification is : "+student.getAge().getYear());
        student.getAge().setYear(2021);
        System.out.println("Year After modification is : "+student.getAge().getYear());


        List<String> skillList = student.getSkillList();
        System.out.println("List of  skills before modification : " + skillList);
        student.getSkillList().add("Kafka");
        System.out.println("List of  skills after modification : " + skillList);

    }

}

final class Student {
    final String name;
    final int id;
    final Age age;
    final List<String> skillList;


    public Student(int id, String name, List<String> skillList,Age age) {
        this.id = id;
        this.name = name;
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age=cloneAge;
        List<String> cloneList = new ArrayList<>();
        cloneList.addAll(skillList);
        this.skillList=cloneList;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<String> getSkillList() {
       List<String> cloneSkillList= new ArrayList<>();
       cloneSkillList.addAll(skillList);

        return cloneSkillList;
    }

    public Age getAge() {
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        return cloneAge;
    }
}

class Age {
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

