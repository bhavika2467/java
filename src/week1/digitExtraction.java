/*32. TASK 5 - DIGIT EXTRACTION
-----------------------------

Read a positive three-digit integer. Use integer division and remainder to
display its hundreds, tens, and units digits separately.

Example input:

	572

Expected output:

	Hundreds: 5
	Tens: 7
	Units: 2

Hint: use / 100, % 100, / 10, and % 10 as needed.*/
package week1 ;
import java.util.Scanner;
public class digitExtraction {
     public static void main(String[] args) 
    {
 Scanner num = new Scanner(System.in);
       System.out.println("enter a positive three digit number  : ");
        int n = num.nextInt();
System.out.println("Hundreds : "+(n/100));
System.out.println("Tens : "+((n%100)/10));
System.out.println("Units : "+(n%10));
} }
