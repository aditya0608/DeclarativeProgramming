package com.aditya.declarativeprogramming.SupplierEx;

import java.util.List;
import java.util.function.Supplier;

public class SupplierEx {

//    @Override
//    public Integer get() {
//        return Integer.MAX_VALUE;
//    }

    public static void main(String[] args) {
//        SupplierEx supplierEx=new SupplierEx();
        Supplier<Integer> supplier=()->Integer.MAX_VALUE;
        System.out.println(supplier.get());
        List<String> numbers=List.of();
        System.out.println(numbers.stream().findAny().orElseGet(()-> ("Nothing here ")));
    }
}
