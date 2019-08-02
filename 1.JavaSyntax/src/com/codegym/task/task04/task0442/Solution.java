package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        while (true) {
            String numberS = keyboard.readLine();
            int number = Integer.parseInt(numberS);
            sum += number;

            if (number == -1) {
                break;
            }
        }

        System.out.println(sum);
    }
}
