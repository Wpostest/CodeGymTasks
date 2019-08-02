package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int positiveNumbers = 0;
        int negativeNumbers = 0;

        for (int i = 1; i <= 3; i++) {
            Scanner input = new Scanner(System.in);
            String numberS = input.nextLine();
            int number = Integer.parseInt(numberS);

            if (number > 0) {
                positiveNumbers += 1;
            } else if (number < 0) {
                negativeNumbers += 1;
            }
        }

        System.out.println("Number of negative numbers: " + negativeNumbers);
        System.out.println("Number of positive numbers: " + positiveNumbers);
    }
}
