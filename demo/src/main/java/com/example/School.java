package com.example;

public class School {
    public static void main(String[] args) {
        AssignmentWork aw = new AssignmentWork();
        Pen p = new PenAdapter();
        aw.setP(p);
        aw.writeAssignment("I am bit tired to write assignment today");
    }
    
}
