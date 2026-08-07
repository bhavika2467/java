/*
31. TASK 4 - SIMPLE INTEREST
----------------------------
Read principal, annual interest rate, and time in years. Calculate:
	simpleInterest = principal * rate * time / 100
	finalAmount = principal + simpleInterest
Use double variables where fractional values are possible. Print both the
interest and final amount.
 */
package week1;
import java.util.Scanner;
public class si 
{ 
public static void main(String[] args) 
{
Scanner input= new Scanner(System.in);
System.out.println("enter principal : ");
double p = input.nextDouble();
System.out.println("enter annual interest : ");
double i =input.nextDouble();
System.out.println("enter time in years : ");
double t = input.nextDouble();
double simpleInterest = (p*i*t)/100;
double finalAmount = p + simpleInterest;
System.out.println("interest :"+simpleInterest);
System.out.println("final amount : "+ finalAmount);
}
}
