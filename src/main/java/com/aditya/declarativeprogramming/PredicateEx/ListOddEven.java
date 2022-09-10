package com.aditya.declarativeprogramming.PredicateEx;

import java.util.List;
import java.util.function.Predicate;

public class ListOddEven {

    public static void main(String[] args) {
        List<Integer> list= List.of(1,2,3,4,5,6);
        Predicate<Integer> predicateOdd=number->number%2!=0;
        Predicate<Integer> predicateEven=number->number%2==0;
        //odd stream
        System.out.println("---------------ODD---------------------");
        list.stream().filter(predicateOdd).forEach(Integer-> System.out.println(Integer));

        //even stream
        System.out.println("---------------EVEN---------------------");
        list.stream().filter(predicateEven).forEach(Integer-> System.out.println(Integer));
    }
}
