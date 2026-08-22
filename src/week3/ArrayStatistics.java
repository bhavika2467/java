/*
63. TASK 1 - ARRAY STATISTICS
-----------------------------
Required filename: ArrayStatistics.java
Read an array and report:
- sum and average
- minimum and maximum
- even and odd counts
- positive, negative, and zero counts
Required methods:
    static int sum(int[] values)
    static double average(int[] values)
    static int minimum(int[] values)
    static int maximum(int[] values)
    static int countEven(int[] values)
    static void printSignCounts(int[] values)
Requirements:
- Handle an empty array explicitly.
- Test all-negative, one-element, repeated, and mixed arrays.
- Explain why min/max must not be initialized to zero.
 */
public class ArrayStatistics 
{
    static int sum(int[] values) 
    {
        int sum = 0;
        for (int value : values) 
        {
            sum += value;
        }
        return sum;
    }
    static double average(int[] values) 
    {
        if (values.length == 0) 
        {
            return 0.0;
        }
        return (double) sum(values) / values.length;
    }
    static int minimum(int[] values) 
    {
        int minimum = Integer.MAX_VALUE;
        for (int value : values) 
        {
            if (value < minimum) 
            {
                minimum = value;
            }
        }
        return minimum;
    }
    static int maximum(int[] values) 
    {
        int maximum = Integer.MIN_VALUE;
        for (int value : values) 
        {
            if (value > maximum) 
            {
                maximum = value;
            }
        }
        return maximum;
    }
    static int countEven(int[] values) 
    {
        int count = 0;
        for (int value : values) 
        {
            if (value % 2 == 0) 
            {
                count++;
            }
        }
        return count;
    }
    static void printSignCounts(int[] values) 
    {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int value : values) 
            {
            if (value > 0) 
            {
                positive++;
            } else if (value < 0) 
            {
                negative++;
            } else 
            {
                zero++;
            }
        }
        System.out.println("Positive count: " + positive);
        System.out.println("Negative count: " + negative);
        System.out.println("Zero count: " + zero);
    }
}
