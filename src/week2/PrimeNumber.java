
/* 51. TASK 4 - PRIME NUMBER
-------------------------

Required filename: PrimeNumber.java

Write static boolean isPrime(int number), then use it to display whether an
entered integer is prime.

Requirements:

- Values less than 2 are not prime.
- Test possible divisors only while divisor * divisor <= number.
- Test -5, 0, 1, 2, 3, 4, 17, 25, and 97.
- Explain the loop condition.
*/
package week2;
public class PrimeNumber {
    static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] numbers = {-5, 0, 1, 2, 3, 4, 17, 25, 97};
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.println(num + " is Prime");
            } else {
                System.out.println(num + " is Not Prime");
            }
        }
    }
}
