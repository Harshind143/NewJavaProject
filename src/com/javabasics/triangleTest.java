package com.javabasics;

public class triangleTest {

    public static void main(String [] args) {
        int a = 25;
        int b = 90;
        int c = 65;

        if (a + b + c == 180 && a>0 && b>0 && c>0) {

            if (a == b && b == c) {
                System.out.println("equilateral tringel");
            }
            if (a != b && b != c && c != b) {
                System.out.println("scalen triangle");
            }
            if (a == 90 | b == 90 | c == 90) {
                System.out.println("Right angel tringle");

            }
            if ((a == b && c != b) || (b == c && a != c) || (c == a && b != a)) {
                System.out.println("Isoscalen triangle");
            }
        }else{
            System.out.println("this is not triangle");
        }
    }

}
