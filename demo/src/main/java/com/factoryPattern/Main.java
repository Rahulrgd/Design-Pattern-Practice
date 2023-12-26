package com.factoryPattern;

public class Main {
    public static void main(String[] args) {
        Shape circle = new shapeFactory().generatShape("circle");
        System.out.println(circle.area(4));
        Shape square = new shapeFactory().generatShape("square");
        System.out.println(square.parameter(3));
    }
}
