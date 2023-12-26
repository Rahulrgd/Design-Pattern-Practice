package com.CommandPattern;

public class TubeLightOnCommand implements Command{
    Tubelight tubeLight;
    
    public TubeLightOnCommand(Tubelight tubeLight) {
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        tubeLight.lightOn();
    }
    
}
