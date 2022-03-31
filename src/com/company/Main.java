package com.company;

public class Main {

    public static void main(String[] args) {
    Huntable huntable = new Lion("Arstan",120);
    Huntable huntable1 = new Bear("Aiu",160);
    Huntable huntable2 = new Volf("karyshkyr",50);
        System.out.println(huntable);
        huntable.hunt();
        System.out.println(huntable2);
        huntable2.hunt();
        System.out.println(huntable1);
        huntable1.hunt();




    }
}
