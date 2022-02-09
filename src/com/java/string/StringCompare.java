package com.java.string;

public class StringCompare {

    public static void main(String[] args) {

        String str = "Amol";
        String str1 = "Amol";
        String str2 = new String("Amol");

        System.out.println(str.equalsIgnoreCase(str2));

        System.out.println(str==str1);
        System.out.println(str1==str2);

    }
}
