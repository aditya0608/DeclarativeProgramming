package com.aditya.declarativeprogramming.ConsumerEx;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Children {

    public int age;
    public String fName;

    public Children(int age, String fName) {
        this.age = age;
        this.fName = fName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }


    public static Function<List<Children>,List<Children>> ageGreaterThan18= children -> children.stream().filter(children1 ->
            children1.getAge()>=18).collect(Collectors.toList());
    public static Function<List<Children>,List<Children>> ageLesserThan30=children -> children.stream().filter(children1 ->
            children1.getAge()<=30).collect(Collectors.toList());
    public static Function<List<Children>,List<Children>> sortLexicographically=children -> children.stream().sorted((a,b)->{
       return b.getfName().compareTo(a.getfName());
    }).collect(Collectors.toList());
    public static void main(String[] args) {
        List<Children> children=List.of(
                new Children(14,"Aditya"),
                new Children(21,"Sharma"),
                new Children(31,"ZoltZiven"),
                new Children(4,"Excited"));

        //filter takes in a predicate
        //map takes in a function
        List<Integer> plus18=ageGreaterThan18.andThen(ageLesserThan30).apply(children).stream().map(children1 -> children1.getAge()).collect(Collectors.toList());
        plus18.forEach(children1 -> System.out.println(children1.toString()));
        sortLexicographically.apply(children).forEach(System.out::println);

    }

    @Override
    public String toString() {
        return "Children{" +
                "age=" + age +
                ", fName='" + fName + '\'' +
                '}';
    }
}
