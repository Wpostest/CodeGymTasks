package com.codegym.task.task05.task0528;

/* 
Display today's date

*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        TimeZone tz1 = TimeZone.getTimeZone("CEST"); //Gets the time zone.
        Locale locale1 = new Locale("pl", "PL"); //My locate
        //Constructs a Calendar with the default time zone and locale.
        Calendar calendar = Calendar.getInstance(tz1, locale1); //Gets a calendar using the default time zone and locale. Dostajemy dostep do objektu
        //w ktorym zainicjowana jest biezaca data i godzina.
        //Returns the value of the given calendar field.
        int year = calendar.get(calendar.YEAR); //Field number for get and set indicating the year.
        int month = calendar.get(calendar.MONTH) + 1; //Field number for get and set indicating the month.
        int day = calendar.get(calendar.DAY_OF_MONTH); //Field number for get and set indicating the day of the month.
        System.out.println(month + " " + day + " " + year);
    }
}
