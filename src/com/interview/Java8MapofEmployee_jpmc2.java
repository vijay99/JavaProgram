package com.interview;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Kumar Vijay
 */
public class Java8MapofEmployee_jpmc2 {
    public static void main(String[] args) {
        List<Employee1> employee1List = new ArrayList<>();
        employee1List.add(new Employee1(10,100,"Amit"));
        employee1List.add(new Employee1(20,200,"Dinesh"));
        employee1List.add(new Employee1(30,300,"Nimit"));
        employee1List.add(new Employee1(30,500,"Nimit"));

        Map<Integer,List<Employee1>> mapList = employee1List.stream()
                                               .collect(Collectors.groupingBy( e -> e.getEmpId()));
       // Map<Integer,Employee1> empMap = employee1List.stream().collect(Collectors.toMap(e -> e.getEmpId(),e -> e,(e1,e2) -> e1.getDeptId()>=e2.getDeptId() ? e1 :e2));
        /*for(Map.Entry<Integer,Employee1> emp :empMap.entrySet()){
            System.out.println("emp id : "+emp.getKey()+"employee : "+emp.getValue());
        }*/
       // System.out.println(empMap);
        for(Map.Entry<Integer,List<Employee1>> entry : mapList.entrySet()){
            System.out.println("emp id : "+entry.getKey());
             List<Employee1> empList=entry.getValue();
               for(Employee1 emp : empList){
                   System.out.println(emp);
               }
        }
    }
}

class Employee1 implements Comparable{
    private int empId;
    private int deptId;
    private String empName;

    public Employee1(int empId, int deptId, String empName) {
        this.empId = empId;
        this.deptId = deptId;
        this.empName = empName;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee1 employee1 = (Employee1) o;
        return empId == employee1.empId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "empId=" + empId +
                ", deptId=" + deptId +
                ", empName='" + empName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return Integer.valueOf(empId).compareTo(((Employee1)o).getEmpId());
    }
}