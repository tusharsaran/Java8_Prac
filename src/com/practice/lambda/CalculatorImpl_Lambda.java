package com.practice.lambda;

/**
 * contains Single abstract method and multiple static and default methods
 * examples :
 * - Runnable -> run()
 * - Callable -> call()
 * - Comparable -> compareTo()
 * - Comparator - compare()
 */

interface CalculatorLam{
    void switchOn();
}

interface Calc{
    int sum(int a , int b);
}

interface CalculatorSub{
    int subtract(int a , int b);
}

public class CalculatorImpl_Lambda{

    //tradition
    public static void main(String[] args) {

       //lambda syntax
            //    () parameter             -> expression          {body}  method body
        CalculatorLam cal = () -> System.out.println("switching on the calculator lambda");
       cal.switchOn();


        Calc sumNumbers = (a, b) ->  a + b;
        System.out.println(sumNumbers.sum(4, 5));

        CalculatorSub subNumbers = (a, b) -> {
          if(a > b){
              throw new RuntimeException("a is greater than  b");
          }
          return b - a ;
        };
        System.out.println(subNumbers.subtract(14, 25));
    }

}
