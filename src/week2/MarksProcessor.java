/* 
56. TASK 9 - SENTINEL-CONTROLLED MARKS PROCESSOR
------------------------------------------------
Required filename: MarksProcessor.java
Write a program that repeatedly reads marks. Enter -1 to end input. The
sentinel must stop the loop and must not be included as a mark.
After input ends, display:
- number of valid marks entered
- sum of the marks
- average mark
- highest mark
- number of passes (mark >= 50)
- number of failures (mark < 50)
Requirements:
- Use -1 as the sentinel.
- Accept ordinary marks only from 0 through 100.
- Reject an invalid value and continue without including it in any result.
- Avoid division by zero when the first input is -1.
- Use static boolean isValidMark(int mark).
- Use at least two additional methods to print or calculate results.
- Dry-run this input sequence:
            70, 45, 105, 80, -1
Explain which values are processed, which value is rejected, and which value
terminates the loop.
*/
package week2;
import java.util.Scanner;
public class MarksProcessor 
{
    static boolean isValidMark(int mark) 
    {
        return mark >= 0 && mark <= 100;
    }
    static double calculateAverage(int sum, int count) 
    {
        if (count == 0) 
        {
            return 0;
        }
        return (double) sum / count;
    }
    static void printResults(int count, int sum, double average, int highest, int passes, int failures) 
    {
        System.out.println("Number of valid marks : " + count);
        System.out.println("Sum of marks : " + sum);
        System.out.println("Average mark : " + average);
        if (count > 0) 
        {
            System.out.println("Highest mark : " + highest);
        } else 
        {
            System.out.println("Highest mark : No marks entered");
        }
        System.out.println("Passes : " + passes);
        System.out.println("Failures : " + failures);
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int mark;
        int count = 0;
        int sum = 0;
        int highest = -1;
        int passes = 0;
        int failures = 0;
        System.out.println("Enter marks (-1 to stop):");
       int i = input.nextInt();
        while (i != -1) 
            {
            if (isValidMark(i)) 
            {
                count++;
                sum += i;
                if (i > highest) 
                {
                    highest = i;
                }

                if (i >= 50)
                {
                    passes++;
                } 
                else 
                {
                    failures++;
                }

            }
             else 
            {
                System.out.println("Invalid mark! ");
            }
            i = input.nextInt();
        }
        double average = calculateAverage(sum, count);
        printResults(count, sum, average, highest, passes, failures);
    }
}
