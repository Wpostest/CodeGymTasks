package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        String numberS = input.nextLine();
        int number = Integer.parseInt(numberS);

        if (number < 0 && number % 2 == 0) {
            System.out.println("Negative even number");
        } else if (number == 0) {
            System.out.println("Zero");
        } else if (number < 0 && number % 2 == -1) {
            System.out.println("Negative odd number");
        } else if (number > 0 && number % 2 == 0) {
            System.out.println("Positive even number");
        } else if (number > 0 && number % 2 == 1) {
            System.out.println("Positive odd number");
        }
    }
}

