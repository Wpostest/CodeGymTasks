package com.codegym.task.task05.kolejnosc_wykonywania_konstukrow_klas;

public class Animal {

    String brain = "Initial value of brain in the Animal class";
    String heart = "Initial value of heart in the Animal class";

    public int animalCount = 7700000;

    public Animal(String brain, String heart) {
        System.out.println("Animal base class constructor is running");
        System.out.println("Have the variables of the Animal class already been initialized?");
        System.out.println("Current value of static variable animalCount = " + animalCount);
        System.out.println("Current value of brain in the Animal class = " + this.brain);
        System.out.println("Current value of heart in the Animal class = " + this.heart);
        System.out.println("Have the variables of the Cat class already been initialized?");
        System.out.println("Current value of static variable catCount = " + Cat.catCount);

        this.brain = brain;
        this.heart = heart;
        System.out.println("Animal base class constructor is done!");
        System.out.println("Current value of brain = " + this.brain);
        System.out.println("Current value of heart = " + this.heart);
    }
}


