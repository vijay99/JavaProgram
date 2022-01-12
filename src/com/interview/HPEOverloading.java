package com.interview;

/**
 * @author Sacumen (www.sacumen.com) <br> <br>
 */
    public class HPEOverloading {


        public void print(String str){
            System.out.println("Inside print(String str)");
            System.out.println(str);
        }

        public void print(int value){
            System.out.println("Inside print(int value)");
            System.out.println(value);
        }

        public void print(Object obj){
            System.out.println("Inside print(Object obj)");
            System.out.println(obj);
        }

        public static void main(String[] args) {

            HPEOverloading hpeOverloading = new HPEOverloading();
            hpeOverloading.print(1);
            hpeOverloading.print(null);
            hpeOverloading.print("vijay");


            // vijay
            //  1
            //null

        }



}
