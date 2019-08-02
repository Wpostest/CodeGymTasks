package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

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

        if(firstNumber < secondNumber || firstNumber == secondNumber){
            System.out.println(firstNumber);
        }
        else{
            System.out.println(secondNumber);
        }
    }
}