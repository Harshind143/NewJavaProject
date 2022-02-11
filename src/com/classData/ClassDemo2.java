package com.classData;

public class ClassDemo2 {
    int a;
    double d;
    char c;
    String str;

     ClassDemo2()
     {
        a= 10;
        d = 1.1;
        c = 'f';
        str = "Harshal";
    }

    void display(){
        System.out.println("a=" +a);
        System.out.println("d=" +d);
        System.out.println("c=" +c);
        System.out.println("str=" +str);
    }

    public static void main(String[] args) {
      ClassDemo2 cd = new ClassDemo2();
        cd.display();


    }
}
