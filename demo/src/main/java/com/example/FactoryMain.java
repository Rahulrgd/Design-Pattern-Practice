package com.example;

public class FactoryMain {
    public static void main(String[] args){
        OperatingSystemFactory ofs = new OperatingSystemFactory();
        OS obj = ofs.getInstance("");
        obj.spec();
    }
}
