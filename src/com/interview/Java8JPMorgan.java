package com.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kumar Vijay
 */
public class Java8JPMorgan {
    public static void main(String[] args) {
        int countOfEmployee;
        List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(56,70000,"Mukesk"),
                new Employee(66,60000,"Amit"),new Employee(76,30000,"Pankaj")));

        List<String> empNameList=empList.stream().filter(e -> e.getAge() > 50 && e.getSalary()<50000).map(e -> e.getName()).collect(Collectors.toList());
        System.out.println("All employes having age  greater then 50 and salary less then 50000"+empNameList);
    }
}

class Employee {
    private int age;
    private int salary;
    private String name;

    public Employee(int age, int salary, String name) {
        this.age = age;
        this.salary = salary;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
