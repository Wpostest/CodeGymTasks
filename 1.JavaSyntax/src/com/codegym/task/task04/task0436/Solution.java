package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String nS = keyboard.readLine();
        String mS = keyboard.readLine();
        int n = Integer.parseInt(nS);
        int m = Integer.parseInt(mS);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
