package com.pack1;

import com.classData.classdemo;

public class java1 {

   public int a;
    public double d;
    public char c;
    public String str;

    public void display(){
        System.out.println("a=" +a);
        System.out.println("d=" +d);
        System.out.println("c=" +c);
        System.out.println("str=" +str);
    }

    public static void main(String[] args) {
        java1 cd = new java1();

        cd.a= 10;
        cd.d = 1.1;
        cd.c = 'f';
        cd.str = "Harshal";

        cd.display();

    }
}
