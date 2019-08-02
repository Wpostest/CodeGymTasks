package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sAge = reader.readLine();
        String firstName = reader.readLine();
        System.out.println(firstName + " will take over the world in " + sAge + " years. Mwa-ha-ha!");
    }
}