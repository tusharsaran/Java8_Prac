package com.practice.functionalInterface.inbuiltfunctions;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;

/*

Function is an inbuilt functional interface in Java8.
Represents a function that accepts two arguments and return  output

   R apply(T t, U u);
    Params:
    t – the first function argument u – the second function argument
    Returns:
    the function result

 */
public class BiFunctionDemo {

    public static void main(String[] args) {

        List<String> numbersList = Arrays.asList("numb1","numb2", "numb3", "numb4");
        List<Integer> numbersList1 = Arrays.asList(10,20,30,40);

        BiFunction<List<String>,List<Integer>, Map<Integer, String>> bifunc =  (num1, num2) ->  {
            Map<Integer, String> mp = new HashMap<>();

            for(int i=0; i < num1.size();  i++){
                mp.put(num2.get(i), num1.get(i));
            }

            return mp;
        };

        Map<Integer, String> response =   bifunc.apply(numbersList, numbersList1);
        Iterator itr  = response.keySet().iterator();
        while(itr.hasNext()){
            int key = (int)itr.next();
            System.out.println(key + " " + response.get(key));
        }
    }
}
