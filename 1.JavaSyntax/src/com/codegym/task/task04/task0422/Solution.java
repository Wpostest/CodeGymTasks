package com.codegym.task.task04.task0422;

/* 
18+

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner input = new Scanner(System.in);
        String firstName = input.nextLine();
        String ageS = input.nextLine();
        int age = Integer.parseInt(ageS);

        if (age < 18) {
            System.out.println("Grow up a little more");
        }
    }
}
