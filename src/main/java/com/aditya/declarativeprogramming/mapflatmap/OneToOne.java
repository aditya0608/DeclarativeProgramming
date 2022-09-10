package com.aditya.declarativeprogramming.mapflatmap;

public class OneToOne {

    public static void main(String[] args) {
        Ekart.getCustomers().stream().map(customers->customers.getEmailId()).forEach(System.out::println);

        //here we have one to many scenario as one customer has many phoneNumbers
        Ekart.getCustomers().stream().map(customers->customers.getPhoneNumbers()).forEach(System.out::println);
    }
}
