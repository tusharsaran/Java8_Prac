package com.practice.functionalInterface.inbuiltfunctions;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/*

Predicate is an inbuilt functional interface in Java8.
Predicate a function that accepts an argument and return  boolean output

  boolean test(T t);

 */
public class PredicateDemo {

    public static void main(String[] args) {

        List<String> wordList = Arrays.asList("Hello","HELLO", "Hi", "HI");

        Predicate<String> predicatefunc =  (w) -> w.equals(w.toUpperCase());

        for(String word : wordList){
            System.out.println(predicatefunc.test(word));
        }
    }

}
