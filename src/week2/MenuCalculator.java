/*
 TASK 3 - MENU-DRIVEN CALCULATOR
-----------------------------------
Required filename: MenuCalculator.java
Create a calculator with these menu choices:
    1. Add
    2. Subtract
    3. Multiply
    4. Divide
    0. Exit
Requirements:
- Use do-while so the menu appears at least once.
- Use switch to select the operation.
- Reject invalid menu choices.
- Prevent division by zero.
- Use at least one void method and one value-returning method.
- Use this modular flow in main: printMenu, read/validate choice, read operands,
  call calculate, and display the returned result.
- Continue until the user selects 0.
This is a high-value self-directed exercise because it combines conditions,
switch, a repetition loop, input validation, division-by-zero handling, void
methods, value-returning methods, parameters, and repeated method calls.
*/
import java.util.Scanner;
public class MenuCalculator 
{
    static void printMenu() 
    {
        System.out.println("1.Add");
        System.out.println("2.Subtract");
        System.out.println("3.Multiply");
        System.out.println("4.Divide");
        System.out.println("0.Exit");
    }
    static double calculate(double n1, double n2, int choice) 
    {
        switch (choice) 
        {
            case 1:
                return n1 + n2;
            case 2:
                return n1 - n2;
            case 3:
                return n1 * n2;
            case 4:
                return n1 / n2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int choice;
        do 
        {
            printMenu();
            System.out.print("Enter your choice: ");
            choice = input.nextInt();   
            if (choice < 0 || choice > 4) 
                {
                System.out.println("Invalid choice! Please enter 0 to 4.");
                continue;
                }
            if (choice == 0) 
                {
                System.out.println("Calculator exited.");
                break;
                }
            System.out.print("Enter first number: ");
            double n1 = input.nextDouble();
            System.out.print("Enter second number: ");
            double n2 = input.nextDouble();
            if (choice == 4 && n2 == 0) {
                System.out.println("Cannot divide by zero!");
            }
            double result = calculate(n1, n2, choice);
            System.out.println("Result = " + result);
        } 
        while (choice != 0);
    }
}
