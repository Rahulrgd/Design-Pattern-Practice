package com.CommandPattern;

public class TubeLightOffCommand implements Command{
    Tubelight tubeLight;

    public TubeLightOffCommand(Tubelight tubeLight) {
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        tubeLight.lightOff();
    }
    
}
