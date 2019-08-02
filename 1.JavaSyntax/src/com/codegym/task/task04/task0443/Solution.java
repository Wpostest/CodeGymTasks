package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
        String firstName = keyboard.readLine();
        String year = keyboard.readLine();
        String month = keyboard.readLine();
        String day = keyboard.readLine();
        
        System.out.println("My name is " + firstName + ".\n" + "I was born on " + month + "/" + day + "/" + year);
    }
}
