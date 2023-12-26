package com.Composition;

public class Dog implements Pet{
    public String name;
    public String sound;
    public Dog(String name, String sound) {
        this.name = name;
        this.sound = sound;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSound() {
        return sound;
    }
    public void setSound(String sound) {
        this.sound = sound;
    }
}
