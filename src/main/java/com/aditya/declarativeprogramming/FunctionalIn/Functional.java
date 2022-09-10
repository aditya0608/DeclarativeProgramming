package com.aditya.declarativeprogramming.FunctionalIn;

@FunctionalInterface
public interface Functional {

    Integer anonymous(Integer a, Integer b);

    public static void main(String[] args) {
        Functional functional = (a, b) -> a + b;
        System.out.println(functional.anonymous(4, 5));
    }
}
