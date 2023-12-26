package com.Decorator2;

public class DressDecoratorTest {
    public static void main(String[] args) {
        Dress casualDress = new CasualDress(new BasicDress());
        casualDress.assemble();
    }
}
