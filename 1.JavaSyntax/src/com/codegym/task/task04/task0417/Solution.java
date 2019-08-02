package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumberOne = reader.readLine();
        String sNumberTwo = reader.readLine();
        String sNumberThree = reader.readLine();
        int numberOne = Integer.parseInt(sNumberOne);
        int numberTwo = Integer.parseInt(sNumberTwo);
        int numberThree = Integer.parseInt(sNumberThree);

        if (numberOne == numberTwo && numberOne == numberThree) {
            System.out.print(numberOne + " " + numberTwo + " " + numberThree);
        } else if (numberOne == numberTwo) {
            System.out.println(numberOne + " " + numberTwo);
        } else if (numberTwo == numberThree) {
            System.out.println(numberTwo + " " + numberThree);
        } else if (numberThree == numberOne) {
            System.out.println(numberOne + " " + numberThree);
        }
    }
}