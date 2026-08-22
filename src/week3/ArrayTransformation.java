/*
65. TASK 3 - ARRAY TRANSFORMATIONS
---------------------------------
Required filename: ArrayTransformations.java
Implement:
    static void reverseInPlace(int[] values)
    static int[] reversedCopy(int[] values)
    static int removeValue(int[] values, int target)
    static int[] runningSum(int[] values)
Requirements:
- Use two pointers for in-place reversal.
- Do not call a library reverse method.
- Explain original versus logical length after removeValue.
- Compare mutation, returned copy, time, and auxiliary space. */
public class ArrayTransformation 
{
    static void reverseInPlace(int[] values) 
    {
        int left = 0;
        int right = values.length - 1;
        while (left < right) 
        {
            int temporary = values[left];
            values[left] = values[right];
            values[right] = temporary;
            left++;
            right--;
        }
    }
    static int[] reversedCopy(int[] values) 
    {
        int[] result = new int[values.length];
        for (int i = 0; i < values.length; i++) 
        {
            result[i] = values[values.length - 1 - i];
        }
        return result;
    }
     static int removeValue(int[] values, int target) {
        int write = 0;
        for (int read = 0; read < values.length; read++) 
        {
            if (values[read] != target) 
            {
                values[write] = values[read];
                write++;
            }
        }
        return write;
    }
      static int[] runningSum(int[] values)
    {
        int[] result = new int[values.length];
        int total = 0;
        for (int index = 0; index < values.length; index++) 
        {
            total += values[index];
            result[index] = total;
        }
        return result;
    }

}
