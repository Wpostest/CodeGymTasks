package com.codegym.task.task02.task0216;

/* 
Minimum of three numbers

*/
public class Solution {
    public static int min(int a, int b, int c) {
        //write your code here
        
        int m2;
        
        if(a <= b & a <= c){
            m2=a;
        }
        else if(b <= a & b <= c){
            m2=b;
        }
        else{
            m2=c;
        }
        
        
        return m2;
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}