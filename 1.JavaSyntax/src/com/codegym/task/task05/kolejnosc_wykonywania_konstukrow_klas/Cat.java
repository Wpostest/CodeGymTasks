package com.codegym.task.task05.kolejnosc_wykonywania_konstukrow_klas;

public class Cat extends Animal {

    String tail = "Initial value of tail in the Cat class";

    static int catCount = 37;

    public Cat(String brain, String heart, String tail) {
        super(brain, heart);
        System.out.println("The cat class constructor has started (The Animal constructor already finished)");
        System.out.println("Current value of static variable catCount = " + catCount);
        System.out.println("Current value of tail = " + this.tail);
        this.tail = tail;
        System.out.println("Current value of tail = " + this.tail);
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Brain", "Heart", "Tail");
    }
}
