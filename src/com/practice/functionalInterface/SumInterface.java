package com.practice.functionalInterface;

public interface SumInterface {

    int showResponse(int i1, int i2);

    default int showNumbersAfterMultiply(int num1 , int num2){
        return num1 * num2 ;
    }

    static int showNumbersAfterSubtract(int num3 , int num4){
        return num3 - num4 ;
    }
}
