/* 52. TASK 5 - GREATEST COMMON DIVISOR
------------------------------------

Required filename: GreatestCommonDivisor.java

Write static int gcd(int first, int second) using Euclid's algorithm.

Repeatedly apply:

    remainder = first % second
    first = second
    second = remainder

until second becomes zero.

Requirements:

- Handle negative inputs using Math.abs().
- Test (48, 18), (21, 14), (7, 5), and (100, 0).
- Trace the variables for gcd(48, 18) in the notebook.
*/
package week2;
import java.util.Scanner;
public class GreatestCommonDivisor
{
    static int gcd(int first, int second) 
    {
        while (second != 0) 
        {
            int remainder = first % second;
            first = second;
            second = remainder;
        }
        return first;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();
        System.out.println("GCD = " + gcd(first, second));
        System.out.println("gcd(48, 18) = " + gcd(48, 18));
        System.out.println("gcd(21, 14) = " + gcd(21, 14));
        System.out.println("gcd(7, 5) = " + gcd(7, 5));
        System.out.println("gcd(100, 0) = " + gcd(100, 0));
    }
}