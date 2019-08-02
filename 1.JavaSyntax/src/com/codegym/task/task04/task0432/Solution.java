package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String text = keyboard.readLine();
        String nS = keyboard.readLine();
        int n = Integer.parseInt(nS);

        int i = 0;
        while (i < n) {
            System.out.println(text);
            i++;
        }
    }
}
