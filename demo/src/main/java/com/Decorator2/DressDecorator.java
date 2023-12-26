package com.Decorator2;

public class DressDecorator implements Dress{
    Dress dress;

    public DressDecorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void assemble() {
        // TODO Auto-generated method stub
        dress.assemble();
    }



}
