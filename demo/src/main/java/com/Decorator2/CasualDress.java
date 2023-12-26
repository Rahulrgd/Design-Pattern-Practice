package com.Decorator2;

public class CasualDress extends DressDecorator{
    public CasualDress(Dress dress){
        super(dress);
    }

    @Override
    public void assemble() {
        // TODO Auto-generated method stub
        super.assemble();
        System.out.println("Adding features of casual dress to basic dress");
    }
    
}
