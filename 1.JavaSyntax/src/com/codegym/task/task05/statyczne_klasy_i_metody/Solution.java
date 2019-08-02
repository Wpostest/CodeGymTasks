package com.codegym.task.task05.statyczne_klasy_i_metody;

public class Solution{
    int counter;
    static int counter_stat;

    public static void main(String []args){
        int counter = 77;
        int counter_stat = 88;

        Solution exc1 = new Solution();

        //operations on variable class instances
        exc1.count(5);
        count_stat(10);
        System.out.println("Licznik /from method/ = " + exc1.counter); //5
        System.out.println("Licznik stat /from method/ = " + Solution.counter_stat); //10

        //no static variable inside in method main
        counter = 105;
        counter_stat = 110;
        System.out.println("Licznik /inside main method/ = " + counter); //105
        System.out.println("Licznik stat /inside main method/ = " + counter_stat); //110

    }

    private void count(int in_counter){
        int counter;
        this.counter = in_counter;
        counter = 777;
        System.out.println("Licznik local /inside method count/ = " + counter); //777

    }

    private static void count_stat(int in_counter_stat){
        int counter_stat;
        Solution.counter_stat = in_counter_stat;
        counter_stat = 888;
        System.out.println("Licznik stat local /inside method count_stat/ = " + counter_stat); //888
    }

}
