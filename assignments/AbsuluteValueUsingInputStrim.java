package assignments;

import java.util.Scanner;

public class AbsuluteValueUsingInputStrim {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number: ");
		double number = input.nextDouble();

		// Calculate the absolute value without Math.abs()
		double absoluteValue;
		if (number < 0) {
			absoluteValue = -number;
		} else {
			absoluteValue = number;
		}

		System.out.println("The absolute value of " + number + " is " + absoluteValue);

		input.close();
	}
}
