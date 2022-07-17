package com.practice.functionalInterface;

//@FunctionalInterface // this is not mandatory
/*
consumer  - accept (T t)

 biconsumer  - accept (T t, U u)

 function - R r apply(T t)
 bifunction -  R r apply(T t, U u)

supplier -  T get()

predicate -  boolean test(T t)
unaryoperator - T t identify(Tt )

*/



public interface FuncInterface {

 void setup();

 default void m1(){
     System.out.println("inside m1");
 }

 default void m2(){
        System.out.println("inside m2");
    }

}
