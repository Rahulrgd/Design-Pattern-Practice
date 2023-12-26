package com.factoryPattern;

public class Square implements Shape{

    @Override
    public int area(int num) {
        // TODO Auto-generated method stub

        return num*num;
    }

    @Override
    public int parameter(int num) {
        // TODO Auto-generated method stub
        return 4*num;
    }
    
}
