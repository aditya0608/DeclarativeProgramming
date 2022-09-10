package com.aditya.declarativeprogramming.ConsumerEx;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {
        List<Children> children=List.of(
                new Children(14,"aditya"),
                new Children(21,"Sharma"),
                new Children(31,"ZoltZiven"),
                new Children(4,"Excited"));

        Consumer<List<Children>> toUpperCase=childrenList->
        {
           for(int i=0;i<childrenList.size();i++)
           {
            childrenList.get(i).setfName(childrenList.get(i).getfName().toUpperCase());
           }
        };
        Consumer<List<Children>> printNames=children1 -> children1.stream().forEach(System.out::println);

        toUpperCase.andThen(printNames).accept(children);

    }
}
