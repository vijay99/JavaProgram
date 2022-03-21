package com.interview;

public class AreaOfPolygon {
    public static void main(String[] args) {
        int n=4;
        int area= calculateArae( n);
        System.out.println("Area of polygon is :"+area);
    }

    private static int calculateArae(int n) {
        return 2*n*(n-1)+1;
    }
}
