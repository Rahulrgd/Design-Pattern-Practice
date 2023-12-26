package com.tvRemote;

public class Sony extends TV {
    Remote remoteType;
    

    public Sony(Remote r) {
        super(r);
        this.remoteType = r;
    }

    @Override
    void off() {
        // TODO Auto-generated method stub
        System.out.print("Sony TV on: ");
        remoteType.on();
    }

    @Override
    void on() {
        // TODO Auto-generated method stub
        System.out.print("Sony TV off: ");
        remoteType.off();
    }

    
}
