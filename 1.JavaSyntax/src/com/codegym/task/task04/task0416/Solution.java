package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sTime = reader.readLine();
        float time = Float.parseFloat(sTime);

        if (time % 5 < 3) {
            System.out.println("green");
        } else if (time % 5 < 4) {
            System.out.println("yellow");
        } else {
            System.out.println("red");
        }
    }
}

