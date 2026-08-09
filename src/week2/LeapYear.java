/*
49. TASK 2 - LEAP YEAR
----------------------

Required filename: LeapYear.java

Write a program that determines whether an entered year is a Gregorian leap
year.

Requirements:

- Create static boolean isLeapYear(int year).
- Test 2024, 1900, 2000, and 2023.
- Explain why checking only divisibility by 4 is insufficient.
*/ 
package week2;
public class LeapYear
{
    static boolean isLeapYear(int year)
    {
        if (year % 400 == 0)
        {
            return true;
        }
        else if (year % 100 == 0)
        {
            return false;
        }
        else if (year % 4 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        int[] leapYear = {2024, 1900, 2000, 2023};
        for (int year : leapYear)
        {
            System.out.println(year + " : " + isLeapYear(year));
        }
    }
}
 
