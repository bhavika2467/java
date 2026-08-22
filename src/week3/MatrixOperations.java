/*
66. TASK 4 - MATRIX OPERATIONS
-----------------------------
Required filename: MatrixOperations.java
Implement:
    static int[] rowSums(int[][] matrix)
    static int[] columnSums(int[][] matrix)
    static int[][] add(int[][] first, int[][] second)
    static int[][] transpose(int[][] matrix)
    static int[][] multiply(int[][] first, int[][] second)
    static void printMatrix(int[][] matrix)
Requirements:
- Validate dimensions before addition and multiplication.
- Test a non-square transpose.
- Explain all three loops in multiplication. 
- State complexity for each operation. */
public class MatrixOperations 
{
    static int[] rowSums(int[][] matrix) 
    {
        int[] sums = new int[matrix.length];
        for (int row = 0; row < matrix.length; row++) 
        {
            for (int value : matrix[row])
            {
                sums[row] += value;
            }
        }
        return sums;
    }
    static int[] columnSums(int[][] matrix)
    {
        if (matrix.length == 0) 
        {
            return new int[0];
        }
        int[] sums = new int[matrix[0].length];
        for (int row = 0; row < matrix.length; row++)
        {
            for (int column = 0; column < matrix[row].length; column++) 
            {
                sums[column] += matrix[row][column];
            }
        }
        return sums;
    }
   
    static int[][] add(int[][] first, int[][] second) 
    {
        int[][] result = new int[first.length][first[0].length];
        for (int row = 0; row < first.length; row++) 
        {
            for (int column = 0; column < first[row].length; column++) 
            {
                result[row][column] = first[row][column] + second[row][column];
            }
        }
        return result;
    }
      static int[][] transpose(int[][] matrix) 
    {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];
        for (int row = 0; row < rows; row++)
        {
            for (int column = 0; column < columns; column++) 
            {
                result[column][row] = matrix[row][column];
            }
        }
        return result;
    }
     static int[][] multiply(int[][] first, int[][] second) 
     {
        int resultRows = first.length;
        int sharedLength = second.length;
        int resultColumns = second[0].length;
        int[][] result = new int[resultRows][resultColumns];
        for (int row = 0; row < resultRows; row++) 
        {
            for (int column = 0; column < resultColumns; column++)
            {
                for (int index = 0; index < sharedLength; index++)
                 {
                    result[row][column] += first[row][index] * second[index][column];
                }
            }
        }
        return result;
    }
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}