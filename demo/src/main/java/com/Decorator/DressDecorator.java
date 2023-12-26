package com.Decorator;

public class DressDecorator implements Dress{
    protected Dress dress;

    public DressDecorator(Dress dress) {
        this.dress = dress;
    }

    @Override
    public void assemble() {
        // TODO Auto-generated method stub
        dress.assemble();
        
    }

    

}
