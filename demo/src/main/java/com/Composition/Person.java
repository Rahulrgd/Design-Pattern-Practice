package com.Composition;

public class Person {
    public String name;
    public Pet pet;
    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }
    public String getName() {
        return name;
    }
    public Pet getPet() {
        return pet;
    }
}
