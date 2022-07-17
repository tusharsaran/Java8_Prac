package com.practice.streams;

import java.util.*;
import java.util.stream.Stream;

/*
Stream is used to process the collections of objects
Stream is a sequence of objets
    - that supports various methods
        - methods which can be pipelined
            - to get a desired result
Streams dont change the original data structure

Methods
- parallelStream
- foreach  - consumer **
- filter  - predicate**
- sorted **
- skip **
- peek - consumer **
- reduce - identity, BinaryOperator<T> accumulator **
- min  - comparator**
- max  - comparator**
- count **
- map - Function **
- flatmap - Function  **
- collect ***
- findAny
- findFirst
- limit
 */
public class StreamDemo {

    public static void main(String args[]){

        List<String> namelist = Collections.unmodifiableList(Arrays.asList("Murrit", "john", "peter", "marek"));
        /*for(String name : namelist){
            System.out.println("name is  ::: " +  name);
        }*/

        //using stream for each
        namelist.stream()
                .forEach(name -> System.out.println(name));

        Map<Integer, String> mp  = new HashMap<>();
        mp.put(1, "a");
        mp.put(2, "b");
        mp.put(3, "c");
        mp.put(4, "d");

        Iterator itr =  mp.keySet().iterator();
        while(itr.hasNext()){
            Integer key = (Integer) itr.next();
            System.out.println(mp.get(key));
        }
        System.out.println("==========================================");
        System.out.println("==========================================");
        mp.forEach((k, v) -> System.out.println(v));

        System.out.println("==========================================");
        System.out.println("==========================================");

        Iterator itr1 =  mp.entrySet().iterator();

        while(itr1.hasNext()){
          System.out.println(itr1.next());
        }
        System.out.println("==========================================");
        System.out.println("==========================================");
        mp.entrySet().forEach((s) -> System.out.println(s));
        System.out.println("==========================================");
        System.out.println("==========================================");
        mp.entrySet().stream().forEach((s) -> System.out.println(s));

        }

    }



