package com.practice.functionalInterface.inbuiltfunctions;


import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*
Supplier is an inbuilt functional interface in Java8.
Represents a supplier of results.

T get();

 */
public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<List<String>> sup = () -> Arrays.asList("one", "two", "three", "four", "five");

       List<String> strList  = sup.get();
       for(String num : strList){
           System.out.println(num);
       }

    }
}
