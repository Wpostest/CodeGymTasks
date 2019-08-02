package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        String firstString = input.nextLine();
        String secondString = input.nextLine();

        if (firstString.equals(secondString)) {
            System.out.println("The names are identical");
        } else if (firstString.length() == secondString.length()) {
            System.out.println("The names are the same length");
        }
    }
}
