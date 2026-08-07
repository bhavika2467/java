/* 30. TASK 3 - TEMPERATURE CONVERSION
----------------------------------

Read a Celsius temperature and calculate Fahrenheit using:

	fahrenheit = celsius * 9.0 / 5.0 + 32.0

Test at least these values:

	0 Celsius    -> 32 Fahrenheit
	25 Celsius   -> 77 Fahrenheit
	100 Celsius  -> 212 Fahrenheit
*/
package week1;
import java.util.Scanner;
public class tempConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = celsius *( 9.0 / 5.0) + 32.0;
        System.out.println("Temp in Fahrenheit = " + fahrenheit);
    }
}