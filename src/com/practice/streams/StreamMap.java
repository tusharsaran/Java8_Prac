package com.practice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Returns a stream consisting of the results of applying the given function to the elements of this stream.
map() method used for transformation
map takes a STREAM and RETURN RESULT AS ANOTHER STREAM
Its mapper function produces single value for each input value . hence it is also called
 */

public class StreamMap {

    public static void main(String args[]) {

        List<String> namelist = Collections.unmodifiableList(Arrays.asList("murrit", "john", "peter", "marek"));
        for(String name : namelist){
            System.out.println("name is  ::: " +  name);
        }

        System.out.println("==========================================");
        System.out.println("==========================================");


        //using stream for each
       namelist.stream().map(name ->  name.toUpperCase()).collect(Collectors.toList()).forEach(n ->  System.out.println(n));

        System.out.println("==========================================");
        System.out.println("==========================================");

    }
}