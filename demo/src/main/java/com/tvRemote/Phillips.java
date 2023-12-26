package com.tvRemote;

public class Phillips extends TV{
    Remote remoteType;

    public Phillips(Remote r) {
        super(r);
        this.remoteType = r;
    }

    @Override
    void off() {
        // TODO Auto-generated method stub
        System.out.println("Phillips TV on: ");
        remoteType.on();
    }

    @Override
    void on() {
        // TODO Auto-generated method stub
        System.out.println("Phillips TV off: ");
        remoteType.off();
    }
    
}
