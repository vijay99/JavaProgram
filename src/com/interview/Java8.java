/*
import sun.print.PeekMetrics;

import java.util.Arrays;
import java.util.List;

public class Demo12 {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList( new Employee(1, "Akash", "214000", "IT", 1), new Employee(2, "Suresh", "322000", "Operations", 5),
                new Employee(3, "Sam", "551000", "IT", 1), new Employee(4, "John", "221200", "Operations", 5), new Employee(5, "Angel", "881000", "HR", 3),
                new Employee(6, "Phoebe", "191200", "Finance", 2), new Employee(7, "Monica", "9921000", "IT", 1), new Employee(8, "Ross", "2022000", "Operations", 5),
                new Employee(9, "Joe", "21000100", "IT", 1), new Employee(10, "Chandler", "291200", "Operations", 5), new Employee(11, "Lata", "11000", "HR", 3),
                new Employee(12, "Henry", "901200", "Finance", 2) );


        String maxSalary=employees.stream().map(emp -> Integer.parseInt(emp.getSalary())).max();
    }



}


class Employee{
    private int empId; private String empName; private String salary; private String deptName; private int deptNumber; public Employee() { super(); }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getDeptNumber() {
        return deptNumber;
    }

    public void setDeptNumber(int deptNumber) {
        this.deptNumber = deptNumber;
    }

    public Employee(int empId, String empName, String salary, String deptName, int deptNumber) { super(); this.empId = empId; this.empName = empName; this.salary = salary; this.deptName = deptName; this.deptNumber = deptNumber;
      }
}

//long salary=employees.stream().map(employee -> employee.getSalary()).*/
