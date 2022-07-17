package com.practice.functionalInterface.inbuiltfunctions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

/*
Consumer is an inbuilt functional interface in Java8.
Consumer can be used in all contexts where an object needs to be consumed i.e. taken as an input and some operations is to be performed on the object without returning qny result.

void accept(T t);

default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }

Business Use Case : do some operations

Roger
Nadal
Dokovich
Andy
Pete
====================================
====================================
Roger Player
roger
Nadal Player
nadal
Dokovich Player
dokovich
Andy Player
andy
Pete Player
pete

Process finished with exit code 0


 */
public class ConsumerDemo {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Roger", "Nadal", "Dokovich","Andy", "Pete" );
        printNames(names);
    }

    static void printNames( List<String> names){
        for(String name :  names){
            System.out.println(name);
        }

        System.out.println("====================================");
        System.out.println("====================================");

        Consumer<String> consumerName = (cName) -> System.out.println(cName + " Player");

        Consumer<String> consumerNameAndeThen = consumerName.andThen((cName) -> System.out.println(cName.toLowerCase()));

        for(String name :  names){
            consumerNameAndeThen.accept(name);
        }


        }
}
