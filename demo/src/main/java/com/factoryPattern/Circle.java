package com.factoryPattern;

public class Circle implements Shape{

    @Override
    public int area(int num) {
        // TODO Auto-generated method stub
        return 3*(num*num);
    }

    @Override
    public int parameter(int num) {
        // TODO Auto-generated method stub
        return 2*3*num;
    }
    
}
