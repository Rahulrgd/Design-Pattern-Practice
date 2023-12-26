package com.CommandPattern;

public class RadioOffCommand implements Command{
    Radio radio;

    public RadioOffCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        radio.radioOff();
    }
    
}
