package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sNumber = reader.readLine();
        int nNumber = Integer.parseInt(sNumber);

        if(nNumber > 0){
            System.out.println(nNumber * 2);
        }
        else if(nNumber < 0){
            System.out.println(nNumber + 1);
        }
        else{
            System.out.println(0);
        }

    }

}