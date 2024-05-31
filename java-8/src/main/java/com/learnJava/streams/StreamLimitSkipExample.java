package com.learnJava.streams;

import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

    public static Optional<Integer> limit(List<Integer> integerList) {
        return integerList.stream()
                .limit(3)
                .reduce((a,b) -> a+b);
    }

    public static Optional<Integer> skip(List<Integer> integerList) {
        return integerList.stream()
                .skip(3)
                .reduce((a,b) -> a+b);
    }

    public static void main(String[] args) {

        List<Integer> integerList = List.of(6, 7, 8, 9, 10);

        Optional<Integer> limitResult = limit(integerList);

        if(limitResult.isPresent()){
            System.out.println("limitResult->" + limitResult.get());
            assert(limitResult.get() == 21);
        } else {
            System.out.println("limit() Input is empty");
        }

        Optional<Integer> skipResult = skip(integerList);

        if(limitResult.isPresent()){
            System.out.println("skipResult->" + skipResult.get());
            assert(skipResult.get() == 19);
        } else {
            System.out.println("skip() Input is empty");
        }
    }
}
