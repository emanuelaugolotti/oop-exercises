package com.examples;

public class Cat {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public class Bow {
        String color;

        public Bow(String color) {
            this.color = color;
        }

        public void printColor() {
            System.out.println("Cat " + Cat.this.name + " has a " + this.color + " bow.");
        }
    }

    public static void main(String[] args) {

        Cat cat = new Cat("Bob");
        Cat.Bow bow = cat.new Bow("red");

        bow.printColor();
    }
}


