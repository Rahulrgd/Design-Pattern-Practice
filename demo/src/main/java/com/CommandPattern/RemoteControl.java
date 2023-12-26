package com.CommandPattern;

public class RemoteControl {
    Command button;
    public void setCommand(Command command){
        button=command;
    }
    public void pressButton(){
        button.execute();

    }
}
