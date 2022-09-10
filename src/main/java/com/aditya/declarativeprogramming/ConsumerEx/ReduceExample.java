package com.aditya.declarativeprogramming.ConsumerEx;

import java.util.List;

public class ReduceExample {


    public static void main(String[] args) {
        List<Children> children=List.of(
                new Children(14,"Aditya"),
                new Children(21,"Sharma"),
                new Children(31,"ZoltZiven"),
                new Children(4,"Excited"));

        Integer sum=children.stream().map(children1 -> children1.getAge()).reduce(0,(a,b)->a+b);
        Double avgAge=((double)sum/(double)children.size());
        System.out.println("Average = "+ avgAge);
    }
}
