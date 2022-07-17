package com.practice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamSkip {

    public static void main(String args[]) {

        List<String> namelist = Collections.unmodifiableList(Arrays.asList("murrit", "john", "peter", "marek"));
        /*for(String name : namelist){
            System.out.println("name is  ::: " +  name);
        }*/

        //using stream for each
        namelist.stream().forEach(name -> System.out.println(name));

        System.out.println("==========================================");
        System.out.println("==========================================");

        //using stream for each and skip
        namelist.stream().skip(3).forEach(name -> System.out.println(name));


    }
}
