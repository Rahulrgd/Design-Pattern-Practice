package com.CommandPattern;

public class RadioOnCommand implements Command{
    Radio radio;

    public RadioOnCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        radio.radioOn();
    }
    
}
