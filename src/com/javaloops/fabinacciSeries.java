package com.javaloops;

public class fabinacciSeries {

    public static void main(String[] args) {
        int n = 10, x = 0, y = 1;
        System.out.println("Fibonacci Series till " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(x + ", ");
            int a = x + y;
            x = y;
            y = a;
        }
    }
}
