package com.SingletonPattern;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton(){

    }
    private static ThreadSafeSingleton object;
    public static synchronized ThreadSafeSingleton getInstace(){
        if(object==null){
            return object = new ThreadSafeSingleton();
        }
        System.out.println("Bro you have successefully created ThreadSafeSingleton Class, smile :)");
        return object;
    }
    public static void main(String[] args) {
        ThreadSafeSingleton object = ThreadSafeSingleton.getInstace();
    }
}
