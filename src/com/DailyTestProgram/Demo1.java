package com.DailyTestProgram;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class Demo1 {
    public static void main(String[] args) {
        //immutable class : An immutable class is a type of class whose state can't be changed.
        Date dateOfBirth = new Date();
        dateOfBirth.setDay(01);
        dateOfBirth.setMonth(02);
        dateOfBirth.setYear(1989);

        Student student = new Student("Amit",101,dateOfBirth);
        //dateOfBirth.setYear(1985);
        student.getDateOfBirth().setYear(2010);
        System.out.println(student.getDateOfBirth().getYear());
    }
}

final class Student {
    final String name;
    final int id;
    final Date dateOfBirth;

    public Student(String name,int id,Date dateOfBirth){
        this.name=name;
        this.id=id;
        Date cloneDate = new Date();
        cloneDate.setDay(dateOfBirth.getDay());
        cloneDate.setMonth(dateOfBirth.getMonth());
        cloneDate.setYear(dateOfBirth.getYear());
        this.dateOfBirth=cloneDate;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public Date getDateOfBirth() {
        Date cloneDate = new Date();
        cloneDate.setDay(dateOfBirth.getDay());
        cloneDate.setMonth(dateOfBirth.getMonth());
        cloneDate.setYear(dateOfBirth.getYear());
        return cloneDate;
    }
}

class Date {
    int day;
    int month;
    int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
