package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

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
        String fourthNumberS = input.nextLine();
        int firstNumber = Integer.parseInt(firstNumberS);
        int secondNumber = Integer.parseInt(secondNumberS);
        int thirdNumber = Integer.parseInt(thirdNumberS);
        int fourthNumber = Integer.parseInt(fourthNumberS);

        System.out.println(maxOfTwoNumber(maxOfTwoNumber(firstNumber, secondNumber), maxOfTwoNumber(thirdNumber, fourthNumber)));
    }

    public static int maxOfTwoNumber(int numberOne, int numberTwo){
        if(numberOne >= numberTwo){
            return numberOne;
        }
        else{
            return numberTwo;
        }
    }
}
