package com.aditya.declarativeprogramming.mapflatmap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ekart {

    public static List<Customer> getCustomers()
    {
        return Stream.of(
                new Customer(1,"aditya",List.of(1,2)),
                new Customer(2,"zsolt",List.of(3,4))
        ).collect(Collectors.toList());
    }
}

class Customer
{
    int id;
    String emailId;
    List<Integer> phoneNumbers;

    public Customer(int id, String emailId, List<Integer> phoneNumbers) {
        this.id = id;
        this.emailId = emailId;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(ArrayList<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }
}
