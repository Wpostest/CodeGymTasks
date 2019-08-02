package com.codegym.task.task04.task0428;

/* 
Positive number

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
        boolean numberOne = (firstNumber > 0);
        boolean numberTwo = (secondNumber > 0);
        boolean numberThree = (thirdNumber > 0);

        if (numberOne && numberTwo && numberThree) {
            System.out.println(3);
        } else if (numberOne && numberTwo && numberThree == false || numberTwo && numberThree && numberOne == false || numberOne && numberThree && numberTwo == false) {
            System.out.println(2);
        } else if (numberOne & numberTwo == false && numberThree == false || numberTwo && numberOne == false && numberThree == false || numberThree && numberOne == false && numberTwo == false) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
