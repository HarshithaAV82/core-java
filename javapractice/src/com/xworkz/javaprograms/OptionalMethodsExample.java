package com.xworkz.javaprograms;

import java.util.Optional;
import java.util.Scanner;

public class OptionalMethodsExample {

    public static void main(String[] args) {

        String name = "Harshitha";
        Optional<String> optionalName = Optional.of(name);//value must not be null
        System.out.println("1. Optional.of():" + optionalName);

        String city = null;
        Optional<String> optionalCity = Optional.ofNullable(city);//null is allowed
        System.out.println("2. Optional.ofNullable():" + optionalCity);

        Optional<String> emptyValue = Optional.empty();//creates empty Optional
        System.out.println("3. Optional.empty():" + emptyValue);

        if (optionalName.isPresent()){// checks value exists
            System.out.println("4. isPresent(): Name is present");
        }else {
            System.out.println("4. isPresent(): Name is not present");
        }

        String resultName = optionalName.get();// gets value
        System.out.println("5. get():" + resultName);

        String resultCity = optionalCity.orElse("Bangalore");//default value
        System.out.println("6. orElse():" + resultCity);

        String resultCountry = optionalCity.orElseGet( //default value
                () -> "India"
        );

        System.out.println("7. orElseGet():" + resultCountry);

        Optional<String> language = Optional.of("Java");

        try {
            String resultLanguage = language.orElseThrow( //throws exception if empty
                    () -> new Exception("Language not found")
            );
            System.out.println("8. orElseThrow():" + resultLanguage);
        }catch (Exception ex){

            System.out.println(ex.getMessage());
        }

        optionalName.ifPresent( //executes action if value exists
                value -> System.out.println("9. ifPresent():" + value)
        );
        }
}

