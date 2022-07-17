package com.practice.functionalInterface;

public class FunctionalInterfaceDemo {

    public static void main(String [] args){
        FuncInterface demo = () ->  System.out.println("inside setup in class :: Functional interface");
        demo.setup();


        SumInterface si = (i1, i2) -> {
            return i1 + i2;
        };

        System.out.println("value =  " + si.showResponse(1,3));
    }

}
