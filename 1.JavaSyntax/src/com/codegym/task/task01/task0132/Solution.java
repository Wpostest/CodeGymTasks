package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        int hundreds = number / 100;
        int tens = (number % 100) / 10;
        int units = number % 10;
        return hundreds + tens + units;
    }
}
