package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sDay = reader.readLine();
        int nDay = Integer.parseInt(sDay);

        if (nDay == 1) {
            System.out.println("Monday");
        } else if (nDay == 2) {
            System.out.println("Tuesday");
        } else if (nDay == 3) {
            System.out.println("Wednesday");
        } else if (nDay == 4) {
            System.out.println("Thursday");
        } else if (nDay == 5) {
            System.out.println("Friday");
        } else if (nDay == 6) {
            System.out.println("Saturday");
        } else if (nDay == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("No such day of the week");
        }
    }
}