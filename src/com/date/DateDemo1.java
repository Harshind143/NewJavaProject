package com.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        Date date = new Date();

        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd | MMMM  yy h:mm");
        System.out.println(sdf.format(date));
        System.out.println(sdf1.format(date));
        System.out.println(sdf2.format(date));
    }

}
