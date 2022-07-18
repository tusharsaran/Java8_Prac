package com.practice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamCreatingObject {

    public static<T> void main(String args[]) {

        //create Stream from Collections
        Stream<String> stringList =  Collections.unmodifiableList(Arrays.asList("murrit", "john", "peter", "marek")).stream();
        stringList.forEach(System.out::println);

        //Create a stream from specified values
        Stream<String> alphaList = Stream.of("a", "b");
        alphaList.forEach(System.out::println);


        //Create a stream from Arrays
        Stream<T> arrays = (Stream<T>) Arrays.stream(new String[] {"Array a", " Array b"});
        Iterator itr  = arrays.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //empty stream
        Stream<T> empStream = Stream.of();
        System.out.println("empty stream");
        System.out.println(empStream.count());
        empStream.forEach(System.out::println);

    }
}
