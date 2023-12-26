package com.Composition;

public class Main {
    public static void main(String[] args) {
        Pet myDog = new Dog("Lucy", "Bark");
        System.out.println(myDog.getName()+" " + myDog.getSound());
        Person p1 = new Person("Rahul", myDog);
        System.out.println(p1.getName() +" has a pet "+ p1.getPet().getName());
    }
}
