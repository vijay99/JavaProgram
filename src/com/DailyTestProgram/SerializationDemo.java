package com.DailyTestProgram;

import java.io.*;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
public class SerializationDemo {

    public static void main(String[] args)  {

        Employee employee = new Employee(10,"testEmployee");
        //serialize the employee object
        try {
            FileOutputStream fout = new FileOutputStream("/home/kumar/employee.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(employee);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("Success");
        }
        catch (Exception ex){
            System.out.println(ex);
        }


        //De-serialize the Employee object
        try {
            FileInputStream fis = new FileInputStream("/home/kumar/employee.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Employee employee1=(Employee)ois.readObject();
            System.out.println(employee1.id+","+employee1.empName);

            //closing the stream
            ois.close();
        }
        catch (Exception ex){
            System.out.println(ex);
        }


    }

}


class Employee implements Serializable {
     transient int id;
     String empName;
     //static String company="CGI";

    public Employee(int id,String empName){
        this.id=id;
        this.empName=empName;
    }

}