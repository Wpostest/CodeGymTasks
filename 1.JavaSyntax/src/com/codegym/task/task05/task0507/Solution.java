package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        double arithmeticAverage = 0;
        int i = 0;

        while(true){
            int number = Integer.parseInt(keyboard.readLine());

            if(number == -1){
                break;
            }

            arithmeticAverage += number;
            i++;
        }

        System.out.println(arithmeticAverage / i);
    }
}

