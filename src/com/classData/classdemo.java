package com.classData;

public class classdemo {

    int a;
     double d;
     char c;
     String str;

     void display(){
         System.out.println("a=" +a);
         System.out.println("d=" +d);
         System.out.println("c=" +c);
         System.out.println("str=" +str);
     }

    public static void main(String[] args) {
        classdemo cd = new classdemo();

        cd.a= 10;
        cd.d = 1.1;
        cd.c = 'f';
        cd.str = "Harshal";

        cd.display();


    }
}
