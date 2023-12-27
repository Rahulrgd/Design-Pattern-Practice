package com.NullObjectPattern;

// Interface representing a simple shape
interface Shape {
    void draw();
}

// Concrete implementation of Shape for a Circle
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Null object implementation for Shape
class NullShape implements Shape {
    @Override
    public void draw() {
        // Do nothing (representing the absence of a shape)
    }
}

// Client code using the Shape interface
public class NullObjectPatternExample {
    public static void main(String[] args){
        // Drawing a Circle
        Shape circle = new Circle();
        circle.draw();

        // Drawing a null object (no actual shape)
        Shape nullShape = new NullShape();
        nullShape.draw();
    }
}
