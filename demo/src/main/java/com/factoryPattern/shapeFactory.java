package com.factoryPattern;

public class shapeFactory {
    public Shape generatShape(String shape){
        if(shape=="square"){
            return new Square();
        }else if(shape == "circle"){
            return new Circle();
        }else{
            return new Rectangle();
        }
    }
}
