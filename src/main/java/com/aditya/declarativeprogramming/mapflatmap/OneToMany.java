package com.aditya.declarativeprogramming.mapflatmap;

public class OneToMany {

    public static void main(String[] args) {

        //here one result list is returned of all the numbers
        Ekart.getCustomers().stream().
                flatMap(customer -> customer.getPhoneNumbers().
                stream()).
                forEach(System.out::println);
    }
}
