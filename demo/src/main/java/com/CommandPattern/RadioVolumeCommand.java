package com.CommandPattern;

public class RadioVolumeCommand implements Command{
    Radio radio;

    public RadioVolumeCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        radio.setVolume(20);
    }
    
    
}
