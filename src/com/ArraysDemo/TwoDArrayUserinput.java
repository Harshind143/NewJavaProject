package com.ArraysDemo;

import java.util.Scanner;

public class TwoDArrayUserinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter row ");
        int row = sc.nextInt();

        System.out.println("Enter column");
        int col = sc.nextInt();

        int a[][] = new int[row][col];

        for (int i = 0; i < row; i++) {

            for (int j = 0; j < col; j++) {

                System.out.println("a[" + i + "][" + j + "]= ");
                a[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                System.out.print(a[i][j]+"\t");
                System.out.println("\n");

            }

        }
    }
}
