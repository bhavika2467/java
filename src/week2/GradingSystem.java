/*
TASK 1 - GRADING SYSTEM
---------------------------
Required filename: GradingSystem.java
Write a program that reads a mark and displays:
    80-100    Distinction
    70-79     Merit
    50-69     Pass
    0-49      Fail
Values below 0 or above 100 must display Invalid mark.
Requirements:
- Create static String classifyMark(int mark).
- Return the classification instead of printing it inside the method.
- Test -1, 0, 49, 50, 69, 70, 79, 80, 100, and 101. */
package week2;
public class GradingSystem
{
    static String classifyMark(int mark)
    {
        if (mark < 0 || mark > 100)
        {
            return "Invalid mark";
        }
        else if (mark >= 80)
        {
            return "Distinction";
        }
        else if (mark >= 70)
        {
            return "Merit";
        }
        else if (mark >= 50)
        {
            return "Pass";
        }
        else
        {
            return "Fail";
        }
    }   
    public static void main(String[] args)
    {
        int[] testMarks = {-1, 0, 49, 50, 69, 70, 79, 80, 100, 101};
        for (int mark : testMarks)
        {
            System.out.println(mark + " : " + classifyMark(mark));
        }
    }
}
