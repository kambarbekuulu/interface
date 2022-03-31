package com.company;

public class Bear extends Animal{

    public Bear(String name, int salmak) {
        super(name, salmak);
    }

    @Override
    public void hunt() {
        System.out.println("Bear is attaking");
    }

    @Override
    public String toString() {
        return "Bear " + super.toString();
    }
}
