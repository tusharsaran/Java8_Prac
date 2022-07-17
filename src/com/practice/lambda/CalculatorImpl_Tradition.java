package com.practice.lambda;

/**
 * contains Single abstract method and multiple static and default methods
 * examples :
 * - Runnable -> run()
 * - Callable -> call()
 * - Comparable -> compareTo()
 * - Comparator - compare()
 */

interface Calculator{
    void switchOn();
}


public class CalculatorImpl_Tradition implements Calculator{

    //tradition
    public static void main(String[] args) {
        Calculator cal  = new CalculatorImpl_Tradition();
        cal.switchOn();
    }

    @Override
    public void switchOn() {
        System.out.println("switching on the calculator");
    }
}
