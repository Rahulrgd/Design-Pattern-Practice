package com.observer;

public class Subscriber {
    private String name;
    private Channel channel = new Channel();
    public Subscriber(String name) {
        this.name = name;
    }
    public void update(){
        System.out.println(name+": new vedio uploaded- "+channel.title);
    }
    public void subscribedChannel(Channel ch){
        this.channel = ch;
    }
}
