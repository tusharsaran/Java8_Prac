package com.practice.functionalInterface.inbuiltfunctions;

import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;

/*

Function is an inbuilt functional interface in Java8.
Represents a function that accepts one argument and return one output

 R apply(T);
 */
public class FunctionDemo {

    public static void main(String[] args) {

        List<String> numbersList = Arrays.asList("num1","num2", "num3", "num4");

        Function<List<String>, Map<Integer, String>> func =  (num) ->  {
            Map<Integer, String> mp = new HashMap<>();

            for(int i=0; i < num.size();  i++){
                mp.put(i, num.get(i));
            }

            return mp;
        };

        Map<Integer, String> response =   func.apply(numbersList);
        Iterator itr  = response.keySet().iterator();
        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println(key + " " + response.get(key));
        }
    }
}
