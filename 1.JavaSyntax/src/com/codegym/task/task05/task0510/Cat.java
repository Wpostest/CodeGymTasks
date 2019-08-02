package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {
    //write your code here
    private String name;
    private int age;
    private int weight;
    private String address;
    private String color;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 1;
        this.color = "blue";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 1;
        this.color = "blue";
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "blue";
    }

    public void initialize(int weight, String color){
        this.age = 1;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(int weight, String color, String address){
        this.age = 1;
        this.weight = weight;
        this.color = color;
        this.address = address;

    }

    public void initialize(String name, int age, int weight, String address) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = "blue";
    }

    public void initialize(String name, int age, int weight, String address, String color) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.address = address;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
