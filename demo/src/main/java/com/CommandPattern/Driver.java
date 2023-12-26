package com.CommandPattern;

public class Driver {
    public static void main(String[] args) {
        Tubelight tubeLight = new Tubelight();
        Radio radio = new Radio();
        RemoteControl remote = new RemoteControl();
        remote.setCommand(new TubeLightOnCommand(tubeLight));
        remote.pressButton();
        remote.setCommand(new RadioOnCommand(radio));
        remote.pressButton();
    }
    
}
