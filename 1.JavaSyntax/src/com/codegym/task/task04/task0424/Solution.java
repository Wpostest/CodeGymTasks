package com.codegym.task.task04.task0424;

/* 
Three numbers

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

        if (firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber == thirdNumber) {
            System.out.println(1);
        } else if (secondNumber != firstNumber && secondNumber != thirdNumber && firstNumber == thirdNumber) {
            System.out.println(2);
        } else if (thirdNumber != firstNumber && thirdNumber != secondNumber && firstNumber == secondNumber) {
            System.out.println(3);
        }
    }
}
