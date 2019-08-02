package com.codegym.task.task05.task0532;

import java.io.*;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(reader.readLine());

            if(number > 0){
                maximum = number;
            }
        }

        System.out.println(maximum);
    }
}
