package com.example;

public class CompositTest {
    Component hd = new Leaf(4000, "HDD");
    Component mouse = new Leaf(4000, "mouse");
    Component cpu = new Leaf(4000, "CPU");
    Component ram = new Leaf(4000, "RAM");
    Component monitor = new Leaf(4000, "monitor");

    Composite ph = new Composite("Peripheral");
    Composite cabinate = new Composite("Cabinate");
    Composite MB = new Composite("Motherboard");
    Composite computer = new Composite("Computer");

    

}
