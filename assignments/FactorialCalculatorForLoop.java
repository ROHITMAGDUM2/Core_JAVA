package assignments;

import java.util.Scanner;

//Implement a program that calculates and prints  the factorial of a given positive integer using a `for` loop. 
public class FactorialCalculatorForLoop {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a positive integer: ");
		int number = scanner.nextInt();
		scanner.close();

		if (number < 0) {
			System.out.println("Factorial is not defined for negative numbers.");
		} else {
			long factorial = 1;

			for (int i = 1; i <= number; i++) {
				factorial *= i;
			}

			System.out.println("The factorial of " + number + " is: " + factorial);
		}
	}
}
