package com.java.string;

import java.util.Locale;

public class StringDemo {

    public static void main(String[] args) {
        String str = "This is a java program";

        System.out.println(str.length());

        System.out.println(str.charAt(21));

        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println( str.substring(11,20));

        System.out.println(str.substring(11));

    }
}
