package com.practice.stringjoiner;

import java.util.StringJoiner;

/*
 is used to construct a sequence of characters separated by a delimiter
 */

public class StringJoinerDemo {

    public static void  main(String[]  args){
        StringJoiner sj = new StringJoiner(",");
        sj.add("Hello");
        sj.add("Hi");

        System.out.println(sj);

    }
}
