package com.practice.streams;

/*
Java parallel stream is a stream API introduced in Java 8 that aims to make use of multiple cores for task execution.
This is a very useful feature as it significantly reduces the time taken for the completion of a task but not in every case


Normally, any Java code has a single stream of processing, where processes are executed one after another.
In the case of using parallel streams, the code is now divided into multiple streams that will be executed simultaneously on separate cores.

way to create parallel stream
    -  1. use parallel() in stream
    2. Use parallelStream() of collections

 */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamParallelProcessing {

        public static<T> void main(String[] args) throws IOException {

            // A File object is created

            File textFile = new File("C:\\Users\\suruc\\Documents\\SampleTextFile.txt");

            // A Stream of String type is created here
            Stream<String> textLine = Files.lines(textFile.toPath());
            textLine.forEach(System.out:: println);
            textLine.close();

            System.out.println("==========================================");
            System.out.println("==========================================");

            // using parallel Stream to read file
            Stream<String> parallelTextLine = Files.lines(textFile.toPath());
            parallelTextLine.parallel().forEach(System.out:: println);
            parallelTextLine.close();

            System.out.println("==========================================");
            System.out.println("==========================================");

            Stream<T> stringlist =  (Stream<T>)Stream.of("pant", "pandaya","rohit", "virat");
            stringlist.parallel().forEach(System.out::println);
            stringlist.close();

            System.out.println("==========================================");
            System.out.println("==========================================");

            List<String> wordList = Collections.unmodifiableList(Arrays.asList("hello", "bye", "good", "hi"));
            wordList.parallelStream().forEach(System.out::println);

        }

}
