package com.concept;

/**
 * @author Kumar Vijay
 */
public class ImmutableDemo {
    public static void main(String[] args) {

        Age age = new Age();
        age.setDay(1);
        age.setDay(2);
        age.setYear(1989);
        ImmutableStudent student = new ImmutableStudent(10,"Alex",age);
        System.out.println("Student age year before modification "+student.getAge().getYear());
       // age.setYear(1985);
        student.getAge().setYear(1985);
        System.out.println("Student age year after modification "+student.getAge().getYear());

    }



}

final class ImmutableStudent {

    private final int id;
    private final String name;
    private final Age age;

    public ImmutableStudent(int id, String name,Age age) {
        this.id = id;
        this.name = name;
        //this.age=age;
        Age cloneAge= new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        this.age=cloneAge;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public Age getAge(){
        Age cloneAge = new Age();
        cloneAge.setDay(age.getDay());
        cloneAge.setMonth(age.getMonth());
        cloneAge.setYear(age.getYear());
        return cloneAge;
    }
}

class Age {
    private int day;
    private int month;
    private int year;

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
