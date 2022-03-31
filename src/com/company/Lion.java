package com.company;

    public class Lion extends Animal{
        public Lion(String name, int salmak) {
            super(name, salmak);
        }

        @Override
        public void hunt() {
            System.out.println("Lion is attak");
        }

        @Override
        public String toString() {
            return "Lion " + super.toString();
        }
    }
