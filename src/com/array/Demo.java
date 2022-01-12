package com.array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Kumar Vijay
 */
public class Demo {
    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();
        List<String> emp1DeptList = new ArrayList<>();
        emp1DeptList.add("Englist");
        emp1DeptList.add("Microservices");
        empList.add(new Employee(101,"Shivam",emp1DeptList));


        List<String> emp2DeptList = new ArrayList<>();
        emp1DeptList.add("Data Structure");
        emp1DeptList.add("Algo");
        empList.add(new Employee(201,"Vijay",emp1DeptList));

        List<Long> ageList =empList.stream().map(employee -> employee.getAge()).collect(Collectors.toList());
        System.out.println("Age list is : "+ageList);
        //List<String> deptListUsingStream = emp1DeptList.stream().flatMap()



    }
}

class Employee {
    private long age;
    private String empName;
    private List<String> deptLst;

    public Employee(long age,String empName,List<String> deptLst){
        this.age=age;
        this.empName=empName;
        this.deptLst=deptLst;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public List<String> getDeptLst() {
        return deptLst;
    }

    public void setDeptLst(List<String> deptLst) {
        this.deptLst = deptLst;
    }
}
