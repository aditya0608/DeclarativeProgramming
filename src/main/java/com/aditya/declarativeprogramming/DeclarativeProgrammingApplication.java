package com.aditya.declarativeprogramming;

import com.aditya.declarativeprogramming.models.Person;
import com.aditya.declarativeprogramming.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@SpringBootApplication
public class DeclarativeProgrammingApplication {

    @Autowired
    static PersonService personService;
    public static void main(String[] args) {
        SpringApplication.run(DeclarativeProgrammingApplication.class, args);
        List<Person> persons=List.of(new Person("aditya","89"),
                new Person("sharma","6"),
                new Person("advitya","6"));
        //imperative
        print(new Person("aditya","9582088357"));

        //declarative
        System.out.println(personService.printDeclarative.apply(new Person("aditya","96867676776")));
        Predicate<Person> ad = person -> person.getName().startsWith("ad");
        persons.stream().filter(ad)
                .forEach(System.out::println);



    }

    static void print(Person person)
    {
        System.out.println("Hello my name is "+ person.getName()+" and my phone number is "+ person.getPhoneNumber());
    }

}
