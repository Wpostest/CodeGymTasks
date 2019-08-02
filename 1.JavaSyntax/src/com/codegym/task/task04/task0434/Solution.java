package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int i = 0;
        int j = 0;

        while (i < 10) {
            i++;

            while (j < 10) {
                j++;
                System.out.print(i * j + " ");
            }

            j = 0;
            System.out.println("");
        }
    }
}
