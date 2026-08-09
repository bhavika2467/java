/*
54. TASK 7 - NESTED LOOPS AND PRINT PATTERNS
--------------------------
Required filename: LoopPatterns.java
Use nested loops to produce the following patterns for a user-entered size.
Pattern A for size 4:
    * * * *
    * * * *
    * * * *
    * * * *
Pattern B for size 4:
    *
    * *
    * * *
    * * * *
Pattern C for size 4:
    1
    1 2
    1 2 3
    1 2 3 4
Pattern D for size 4:
        * * * *
        * * *
        * *
        *
Pattern E for size 4:
        1
        2 2
        3 3 3
        4 4 4 4
Requirements:
- Complete at least two patterns: one rectangular or triangular star pattern
    and one number pattern.
- Create a separate static method for every completed pattern.
- Each method must receive size as a parameter.
- Reject a size less than 1 in main.
- For each completed pattern, identify the outer-loop responsibility and the
    inner-loop responsibility.
- State the time complexity in terms of size and justify it.
*/
package week2;
import java.util.Scanner;
public class LoopPattern
{
static void patternA(int size)
{
for(int i=0;i<size;i++)
{
    for(int j=0;j<size;j++)
{
System.out.print(" * ");
}
System.out.println();
}
}
static void patternB(int size)
{
for(int i=0;i<size;i++)
{
    for(int j=0;j<=i;j++)
{
System.out.print(" * ");
}
System.out.println();
}
}
static void patternC(int size)
{
for(int i=0;i<size;i++)
{
    for(int j=1;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}
}
static void patternD(int size)
{
for(int i=size;i>0;i--)
{
    for(int j=1;j<=i;j++)
{
System.out.print(" * ");
}
System.out.println();
}
}
static void patternE(int size)
{
for(int i=0;i<size;i++)
{
    for(int j=0;j<=i;j++)
{
System.out.print(i);
}
System.out.println();
}
}
public static void main(String[] args)
 {
     Scanner input = new Scanner(System.in);
      System.out.println("enter size :"); 
     int size = input.nextInt();
     if(size<1)
    {
        System.out.println("invalid"); 
    }
    patternA(size);
    System.out.println();
    patternB(size);
    System.out.println();
    patternC(size);
    System.out.println();
    patternD(size);
    System.out.println();
    patternE(size);
  }
}
