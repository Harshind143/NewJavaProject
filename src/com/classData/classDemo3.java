package com.classData;

public class classDemo3 {
    int a;
    double d;
    char c;
    String str;

     classDemo3(int a, double d,char c,String str)
     {
        this.a=a;
        this. d=d;
         this.c=c;
        this. str=str;
    }
    void display(){
        System.out.println("a=" +a);
        System.out.println("d=" +d);
        System.out.println("c=" +c);
        System.out.println("str=" +str);
    }
    public static void main(String[] args) {
        classDemo3 cd = new classDemo3(10, 2.2,'y',"demo");

        cd.display();

    }
}
