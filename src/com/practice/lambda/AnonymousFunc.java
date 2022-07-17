package com.practice.lambda;

/**
 * anonymous function is a function that does not have any name or modifier
 * Nameless/Unknown
 */
public class AnonymousFunc {

    public static void main(String args[]){
        new AnonymousFunc().m1();
        m2();
    }
    public void m1(){
        System.out.println("inside m1");
    }

    public static void m2(){
        System.out.println("inside m2");
    }

    /**
     * example of anonymous function but we cannot use this function anywhere like normal function as we dont know the name
     *     or modifier of the function. Anonymous function is part of functional interface
     */

    /*(){
        System.out.println("inside anonymous function");
    }*/
}
