package com.codegym.task.task01.task0132;

/*
Sum of the digits of a three-digit number

*/

public class Solution1 {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int a, b, c;
        String s = String.valueOf(number);
        a = Integer.parseInt(s.substring(0, 1));
        b = Integer.parseInt(s.substring(1, 2));
        c = Integer.parseInt(s.substring(2, 3));
        return a + b + c;
    }
}
