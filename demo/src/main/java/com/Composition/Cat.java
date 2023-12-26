package com.Composition;

public class Cat implements Pet{
    public String name;
    public String sound;
    public Cat(String name, String sound) {
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
