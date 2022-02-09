package com.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

    public static void main(String[] args) throws ParseException {
        String str  = "02/23/2021";

        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyy");

       Date date = sdf.parse(str);
        System.out.println(date);
    }
}
