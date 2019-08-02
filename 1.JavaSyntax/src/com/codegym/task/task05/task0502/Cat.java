package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public double weight;
    public double strength;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        //write your code here

        if (this.strength > anotherCat.strength && !(anotherCat.weight >= this.weight * 2) || this.strength / 2 > anotherCat.strength || this.weight / 2 >= anotherCat.weight && !(anotherCat.strength > this.strength * 2) || anotherCat.age > 18 && anotherCat.age < 40 && this.age < 40 && this.age > 18 && this.age > anotherCat.age && !(anotherCat.strength > this.strength * 2) && !(anotherCat.strength > this.strength)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 20;
        cat1.weight = 65;
        cat1.strength = 19;

        Cat cat2 = new Cat();
        cat2.age = 39;
        cat2.weight = 66;
        cat2.strength = 18;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}
