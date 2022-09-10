package com.aditya.declarativeprogramming.sort;

import java.util.*;
import java.util.stream.Collectors;

public class MapSort {

    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("aditya",1);
        map.put("zsolt",2);

        //Way one
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        //list.stream().sorted((o1, o2) -> o2.getKey().compareTo(o1.getKey())).forEach(Entry-> System.out.println(Entry.getKey()+" "+Entry.getValue()));

        //Way Two
        //map.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(Entry-> System.out.println(Entry.getKey()+" "+Entry.getValue()));

        //Way three
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(Entry-> System.out.println(Entry.getKey()+" "+Entry.getValue()));

        //Tree Map
        //TRee maps are always sorted on basis of key
        Map<String,Integer> map2=new TreeMap<>((a,b)->a.compareTo(b));
        map2.put("aditya",1);
        map2.put("zsolt",2);

        //System.out.println(map2);

        //
    }
}
