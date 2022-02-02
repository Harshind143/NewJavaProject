package com.javabasics;

public class MarksDemo {

    public static void main(String[] args) {
        int marks = 100;

        if (marks < 40){
            System.out.println("failed");
        }else if(marks>=40 && marks <50){
            System.out.println("Passed");
        }else if(marks >=50 && marks <60){
            System.out.println("Second Class");
        }else if (marks>=60 && marks< 66){
            System.out.println("first class");
        }else if (marks>=66 && marks<=100){
            System.out.println("Distinction");
        }
    }
}
