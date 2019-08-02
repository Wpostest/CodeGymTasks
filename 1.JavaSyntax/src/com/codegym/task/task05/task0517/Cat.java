package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {
    //write your code here
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 3;
        this.color = "blue";

    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "blue";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.weight = 3;
        this.age = age;
        this.color = "blue";
    }

    public Cat(int weight, String color) {
        this.weight = weight;
        this.age = 1;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.weight = weight;
        this.age = 1;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
