package com.CommandPattern;

public class Radio {
    public void radioOn(){
        System.out.println("Radio On...");
    }
    public void radioOff(){
        System.out.println("Radio Off...");
    }
    public void setVolume(int volumeLevel){
        System.out.println("Radio volume set to "+ volumeLevel);
    }
}
