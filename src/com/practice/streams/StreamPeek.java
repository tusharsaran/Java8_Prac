package com.practice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Returns a stream consisting of the elements of this stream, additionally performing the provided action on each element as elements are consumed from the resulting stream.
can be used for debugging purpose
 */
public class StreamPeek {



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
        namelist.stream()
                .filter(name ->  name.startsWith("m"))
                .peek(name -> System.out.println(name))
                .skip(1)
                .peek(name -> System.out.println(name))
                .collect(Collectors.toList());

        System.out.println("==========================================");
        System.out.println("==========================================");


    }

}
