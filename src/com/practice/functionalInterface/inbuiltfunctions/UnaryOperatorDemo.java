package com.practice.functionalInterface.inbuiltfunctions;
/*

Represents an operation on a single operand that produces a result of the same type as its operand.
This is a specialization of Function for the case where the operand and result are of the same type.

 static <T> UnaryOperator<T> identity() {
        return t -> t;
    }

    consumer void accept(T t)
    biconsumer void accept(T t, U u)
    supplier  T get()
    predicate boolean test(T t)
    function R apply(T t)
    bifunction R apply(T t, U u)
    unaryoperator  T identify(T t)
    binary operator



 */


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {

    public static void main(String[] args ){

       // List<String> wordlist = Arrays.asList("hello","hi");  //Arrays.asList is an unmodifiable list that returns a fixed size list backed by the specifies array.You cannot modify by adding
        //but you can still modify by setting the particular field in the list using "set" method

        //UnsupportedOperationException coz we cannot add any value in the list
        //wordlist.add("hiiii");

        //still modify by using set
       // wordlist.set(1, "hiiii");

        List<String> wordList = Collections.unmodifiableList(Arrays.asList("hello","hi", "word" , "car"));

        UnaryOperator<String> uo =  UnaryOperator.identity();


        for(String word :  wordList){
            System.out.println(uo.apply(word));

        }
    }

}
