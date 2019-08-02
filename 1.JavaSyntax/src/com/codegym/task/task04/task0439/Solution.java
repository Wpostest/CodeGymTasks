package com.codegym.task.task04.task0439;

/* 
Chain letter

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String firstName = keyboard.readLine();

        for (int i = 0; i < 10; i++) {
            System.out.println(firstName + " loves me.");
        }
    }
}
