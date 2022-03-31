package com.company;

public abstract class Animal implements Huntable {
    private String name;
    private int salmak;

    public Animal(String name, int salmak) {
        this.name = name;
        this.salmak = salmak;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalmak() {
        return salmak;
    }

    public void setSalmak(int salmak) {
        this.salmak = salmak;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", salmak=" + salmak +
                '}';
    }
}
