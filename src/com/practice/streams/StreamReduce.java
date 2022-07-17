package com.practice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamReduce {
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
        String finalWord = namelist.stream().reduce("aa", (partialString, element) -> partialString+element);
        System.out.println("finalWord :: " + finalWord);

        System.out.println("==========================================");
        System.out.println("==========================================");


    }
}
