package com.practice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxCount {

    public static void main(String args[]) {

        List<String> namelist = Collections.unmodifiableList(Arrays.asList("murrit", "john", "peter", "marek"));
        /*for(String name : namelist){
            System.out.println("name is  ::: " +  name);
        }*/

        //using stream for each
        namelist.stream().forEach(name -> System.out.println(name));

        System.out.println("==========================================");
        System.out.println("==========================================");

        //using stream min
        Optional<String> minValue  = namelist.stream().min((m, n) -> m.compareTo(n));
        System.out.println("minValue :: " + minValue.get());

        System.out.println("==========================================");
        System.out.println("==========================================");

        //using stream min
        Optional<String> maxValue  = namelist.stream().max((m, n) -> m.compareTo(n));
        System.out.println("maxValue :: " + maxValue.get());

        System.out.println("==========================================");
        System.out.println("==========================================");



        namelist.stream().filter(name -> name.length() <= 4).forEach(name -> System.out.println(name));
        //System.out.println("maxValue :: " + maxValue.get());

        //using stream count
        System.out.println("count before filter  :: " + namelist.stream().count());
        System.out.println("count after filter  :: " +  namelist.stream().filter(name -> name.length() <= 5).count());



        System.out.println("==========================================");
        System.out.println("==========================================");

    }

}
