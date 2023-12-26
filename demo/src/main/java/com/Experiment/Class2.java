package com.Experiment;

public class Class2 extends Class1{
    public void method2(){
        System.out.println("This is method2...");
    }
    public static void main(String[] args) {
        Class2 B = new Class2();
        B.method1();
        B.method2();
        Class1 A = new Class2();
        A.method1();
    }
}
