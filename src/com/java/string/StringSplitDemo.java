package com.java.string;

public class StringSplitDemo {

    public static void main(String[] args) {
        String str = "Hey baby you are so lovely";

        String a [] = str.split(" ");

        for (int i = 0; i < a.length; i++) {
            String temp = a[i];

            int l =temp.length();
           if(a[i].endsWith("y"))
            //if (temp.charAt(l-1)=='y')
            {
                System.out.println(a[i]);
        }

        }

    }
}
