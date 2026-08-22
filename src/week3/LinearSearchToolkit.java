/*64. TASK 2 - LINEAR SEARCH TOOLKIT
---------------------------------
Required filename: LinearSearchToolkit.java
Implement:
    static boolean contains(int[] values, int target)
    static int firstIndexOf(int[] values, int target)
    static int lastIndexOf(int[] values, int target)
    static int countOccurrences(int[] values, int target)
Test empty, absent, first-position, last-position, and duplicate cases. State
the best and worst behavior of each search where appropriate.
 */
public class LinearSearchToolkit 
{
    static boolean contains(int[] values, int target) 
    {
        for (int value : values) 
        {
            if (value == target) 
            {
                return true;
            }
        }
        return false;
    }
    static int firstIndexOf(int[] values, int target) 
    {
        for (int i = 0; i < values.length; i++) 
        {
            if (values[i] == target) 
            {
                return i;
            }
        }
        return -1;
    }
    static int lastIndexOf(int[] values, int target) 
    {
        for (int i = values.length - 1; i >= 0; i--) 
        {
            if (values[i] == target) 
            {
                return i;
            }
        }
        return -1;
    }
    static int countOccurrences(int[] values, int target) 
    {
        int count = 0;
        for (int value : values) 
        {
            if (value == target) 
            {
                count++;
            }
        }
        return count;
    }
}