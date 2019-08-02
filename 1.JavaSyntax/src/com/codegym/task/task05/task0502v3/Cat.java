package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;
    public int point;

    public Cat() {

    }

    public boolean fight(Cat anotherCat) {
        //write your code here

        if (this.age >= anotherCat.age) {
            this.point++;
        } else {
            anotherCat.point++;
        }

        if (this.weight <= anotherCat.weight) {
            this.point++;
        } else {
            anotherCat.point++;
        }

        if (this.strength >= anotherCat.strength) {
            this.point++;
        } else {
            anotherCat.point++;
        }

        if (this.point >= anotherCat.point) {
            this.point = 0;
            anotherCat.point = 0;
            return true;
        } else{
            this.point = 0;
            anotherCat.point = 0;
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.strength = 10;
        cat1.weight = 15;
        cat1.age = 15;

        Cat cat2 = new Cat();
        cat2.strength = 5;
        cat2.weight = 16;
        cat2.age = 14;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
    }
}