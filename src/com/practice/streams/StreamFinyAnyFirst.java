package com.practice.streams;

import java.util.*;

/*
        * Returns an {@link Optional} describing some element of the stream, or an
        * empty {@code Optional} if the stream is empty.
*/
public class StreamFinyAnyFirst {

    public static void main(String args[]) {

        List<String> namelist = Collections.unmodifiableList(Arrays.asList("murrit", "john", "peter", "marek"));
        /*for(String name : namelist){
            System.out.println("name is  ::: " +  name);
        }*/

        //using stream for each
        namelist.stream().forEach(name -> System.out.println(name));

        System.out.println("==========================================");
        System.out.println("==========================================");

        //using stream find any
        Optional<String> name = namelist.stream()
                        .findAny();
        System.out.println("name ::: "+  name.get());

        //using stream find any on empty list
        List<String> namelist1 = new ArrayList<>();
        Optional<String> name1 = namelist1.stream()
                .findAny();
        System.out.println("name1 ::: "+  name1.isPresent());

        System.out.println("==========================================");
        System.out.println("==========================================");


        //using stream find first
        Optional<String> namefirst = namelist.stream()
                .findFirst();
        System.out.println("namefirst ::: "+  namefirst.get());

        //using stream find any on empty list
        List<String> namefirstList = new ArrayList<>();
        Optional<String> namefirst1 = namefirstList.stream()
                .findAny();
        System.out.println("namefirst1 ::: "+  namefirst1.isPresent());


        System.out.println("==========================================");
        System.out.println("==========================================");


    }
}
