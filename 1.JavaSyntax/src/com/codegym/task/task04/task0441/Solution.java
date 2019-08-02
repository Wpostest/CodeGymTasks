package com.codegym.task.task04.task0441;


/* 
Somehow average

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

        if (secondNumber >= firstNumber && firstNumber >= thirdNumber || thirdNumber >= firstNumber && firstNumber >= secondNumber) {
            System.out.println(firstNumber);
        } else if (firstNumber >= secondNumber && secondNumber >= thirdNumber || thirdNumber >= secondNumber && secondNumber >= firstNumber) {
            System.out.println(secondNumber);
        } else if (firstNumber >= thirdNumber && thirdNumber >= secondNumber || secondNumber >= thirdNumber && thirdNumber >= firstNumber) {
            System.out.println(thirdNumber);
        }
    }
}
