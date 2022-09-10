package com.aditya.declarativeprogramming.service;

import com.aditya.declarativeprogramming.models.Person;
import org.springframework.stereotype.Service;

import java.util.function.Function;

@Service
public class PersonService {


    public static Function<Person,String> printDeclarative= person -> {
       return ("Hello my name is "+ person.getName()+" and my phone number is "+ person.getPhoneNumber());
    };


}
