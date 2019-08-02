package com.codegym.task.task05.task0522;

/* 
Max constructors

*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //write your code here
    public Circle() {
        this(0, 0, 0);
    }

    public Circle(int radius) {
        this(0, 0, radius);
    }

    public Circle(int x, int y) {
        this(x, y, 0);
    }

    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public static void main(String[] args) {

    }
}