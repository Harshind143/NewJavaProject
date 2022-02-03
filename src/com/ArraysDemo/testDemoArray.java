package com.ArraysDemo;

public class testDemoArray {
    public static void main(String[] args) {
        int a[]= {2,6,5,8,9,10,34,55,66};

        for (int i = 0; i < a.length; i++) {

            if(a[i]%2==0){
                System.out.println("Even " +a[i]);
            }else{
                System.out.println("odd " +a[i]);
            }

        }
    }




}
