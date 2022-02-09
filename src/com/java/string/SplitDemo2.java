package com.java.string;

public class SplitDemo2 {

    public static void main(String[] args) {
        String str = "This is thss kh";

        String a [] = str.split(" ");

        for (int i = 0; i < a.length ; i++) {

            if(a[i].charAt(1)=='h'){
                System.out.println(a[i]);
            }

        }
    }
}
