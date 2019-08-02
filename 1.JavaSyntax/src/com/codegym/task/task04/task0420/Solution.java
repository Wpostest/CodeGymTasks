package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        String firstNumberS = input.nextLine();
        String secondNumberS = input.nextLine();
        String thirdNumberS = input.nextLine();
        int firstNumber = Integer.parseInt(firstNumberS);
        int secondNumber = Integer.parseInt(secondNumberS);
        int thirdNumber = Integer.parseInt(thirdNumberS);

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            if (secondNumber >= thirdNumber) {
                System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
            } else {
                System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
            }
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            if (firstNumber >= thirdNumber) {
                System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
            } else {
                System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
            }
        } else if (thirdNumber >= firstNumber && thirdNumber >= secondNumber) {
            if (firstNumber >= secondNumber) {
                System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
            } else {
                System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
            }
        }
    }
}
