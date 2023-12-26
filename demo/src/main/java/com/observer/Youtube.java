package com.observer;

public class Youtube {
    public static void main(String[] args) {
    Channel telusko = new Channel();
    Subscriber s1 = new Subscriber("Rahul");
    Subscriber s2 = new Subscriber("Rahi");
    Subscriber s3 = new Subscriber("Satendra");
    Subscriber s4 = new Subscriber("Shubham");
    Subscriber s5 = new Subscriber("Saurabh");

    telusko.subscribe(s1);
    telusko.subscribe(s2);
    telusko.subscribe(s3);
    telusko.subscribe(s4);
    telusko.subscribe(s5);

    telusko.Unsubscribe(s3);

    s1.subscribedChannel(telusko);
    s2.subscribedChannel(telusko);
    s3.subscribedChannel(telusko);
    s4.subscribedChannel(telusko);
    s5.subscribedChannel(telusko);

    telusko.upload("Observer Design Pattern Tutorial");
    }

}
