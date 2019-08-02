package com.codegym.task.task02.task0213;

/* 
Pets need people

*/
public class Solution {
    public static void main(String[] args) {
        //write your code here
         Woman woman = new Woman();
         
         Cat cat = new Cat();
         cat.owner = woman;
         
         Fish fish = new Fish();
         fish.owner = woman;
         
         Dog dog = new Dog();
         dog.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}

