package com.codegym.task.task04.task0425;

/* 
Target locked!

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        String firstNumberS = input.nextLine();
        String secondNumberS = input.nextLine();
        int firstNumber = Integer.parseInt(firstNumberS);
        int secondNumber = Integer.parseInt(secondNumberS);

        if (firstNumber > 0 && secondNumber > 0) {
            System.out.println(1);
        } else if (firstNumber < 0 && secondNumber > 0) {
            System.out.println(2);
        } else if (firstNumber < 0 && secondNumber < 0) {
            System.out.println(3);
        } else if (firstNumber > 0 && secondNumber < 0) {
            System.out.println(4);
        }
    }
}
