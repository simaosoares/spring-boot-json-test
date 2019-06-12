package com.example;

public class Person {

    private String name;

    public Person() {
        // no args constructor needed for deserialization
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
