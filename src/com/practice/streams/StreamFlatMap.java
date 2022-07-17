package com.practice.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Returns a stream consisting of the results of replacing each element of this stream with the contents of a mapped stream produced by applying the provided mapping function to each element. Each mapped stream is closed after its contents have been placed into this stream. (If a mapped stream is null an empty stream is used, instead.)
This is an intermediate operation.
Params:
mapper – a non-interfering, stateless function to apply to each element which produces a stream of new values
Returns:
the new stream
API Note:
The flatMap() operation has the effect of applying a one-to-many transformation to the elements of the stream, and then flattening the resulting elements into a new stream.
Examples.
If orders is a stream of purchase orders, and each purchase order contains a collection of line items, then the following produces a stream containing all the line items in all the orders:
 orders.flatMap(order -> order.getLineItems().stream())...
If path is the path to a file, then the following produces a stream of the words contained in that file:
 Stream<String> lines = Files.lines(path, StandardCharsets.UTF_8);  Stream<String> words = lines.flatMap(line -> Stream.of(line.split(" +")));
The mapper function passed to flatMap splits a line, using a simple regular expression, into an array of words, and then creates a stream of words from that array.
 */
public class StreamFlatMap {

    public static void main(String args[]) {

        List<List<String>> namelist = Collections.unmodifiableList(Arrays.asList(Arrays.asList("murrit", "john", "peter", "marek"),
                Arrays.asList("ram", "shyam"), Arrays.asList("shweta", "kim", "susan", "sonam")));

        namelist.stream().forEach(n ->  System.out.println(n));

        System.out.println("==========================================");
        System.out.println("==========================================");


        //using stream for each
        namelist.stream().flatMap(nList -> nList.stream()).collect(Collectors.toList()).forEach(n ->  System.out.println(n));

        System.out.println("==========================================");
        System.out.println("==========================================");

    }
}
