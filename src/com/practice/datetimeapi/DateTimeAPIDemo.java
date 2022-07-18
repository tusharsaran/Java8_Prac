package com.practice.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTimeAPIDemo {

    public static void main(String[] args ){
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now(ZoneId.of("Asia/Kolkata")));


       /* DateTimeFormatter df = DateTimeFormatter.ofPattern("mm/dd/yyyy");
        System.out.println(df.format(LocalDate.now()));*/


    }
}
