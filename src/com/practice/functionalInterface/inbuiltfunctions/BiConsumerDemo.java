package com.practice.functionalInterface.inbuiltfunctions;
/*
BiConsumer is an inbuilt functional interface in Java8.
Represents an operation that accepts two input arguments and returns no result.
Consumer can be used in all contexts where an object needs to be consumed i.e. taken as an input and some operations is to be performed on the object without returning qny result.

    void accept(T t, U u);

    default BiConsumer<T, U> andThen(BiConsumer<? super T, ? super U> after) {
        Objects.requireNonNull(after);

        return (l, r) -> {
            accept(l, r);
            after.accept(l, r);
        };
    }

*/


import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class BiConsumerDemo {

        private static List<String> nameList = Arrays.asList("Robert", "Alex");
        private static List<String> nameList1 = Arrays.asList("Ram", "Amal");

        public  static void main(String [] args){

               /* Function<List<String>, List<String>> fname = (nameList1) -> nameList1;
                fname.apply(nameList1);
*/

                BiConsumer<List<String>, List<String>> biNames = (nameList, nameList1) -> {

                        List<List<String>> nameCollectionList = Arrays.asList(nameList, nameList1);

                        List<String> finalList = nameCollectionList.stream().flatMap((names) -> names.stream())
                                .collect(Collectors.toList());

                        for(String name :  finalList){
                                System.out.println(name);
                        }
                };

                BiConsumer<List<String>, List<String>> biNamesAndThen = biNames.andThen((nameList, nameList1) -> {
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");

                });
                biNamesAndThen.accept(nameList, nameList1);

        }

}
