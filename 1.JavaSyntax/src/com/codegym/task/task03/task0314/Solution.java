package com.codegym.task.task03.task0314;

/* 
Multiplication table

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        for (int i = 1; i <= 10; i++) {

            for (int b = 1; b <= 10; b++) {
                System.out.print(i * b + " ");
            }

            System.out.println("");
        }
    }
}
