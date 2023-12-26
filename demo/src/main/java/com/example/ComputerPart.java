package com.example;

import java.util.ArrayList;
import java.util.List;

interface Component{
    void showPrice();
}

class Leaf implements Component{

    int price;
    String name;
    public Leaf(int price, String name) {
        this.price = price;
        this.name = name;
    }
    @Override
    public void showPrice() {
        // TODO Auto-generated method stub
        System.out.println(name + " : " + price);
    }

}

class Composite implements Component{

    String name;
    public Composite(String name) {
        this.name = name;
    }

    List<Component> components = new ArrayList<>();

    public void addComponent(Component comp){
        components.add(comp);
    }

    @Override
    public void showPrice() {
        // TODO Auto-generated method stub
        System.out.println(name);
        for(Component c : components){
            c.showPrice();
        }
    }
    
}
