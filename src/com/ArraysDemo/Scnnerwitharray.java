package com.ArraysDemo;

import java.util.Scanner;

public class Scnnerwitharray {

    public static void main(String[] args) {

        int a [] = new int[5];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            a[i] = s.nextInt();
           // int temp = a[i];
        }

        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);


        }



    }
}
