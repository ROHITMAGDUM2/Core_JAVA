
// WAP To find Sum Of Two Numbers
package programs;

import java.util.Scanner;

public class AdditionOfTwoNumbers {
	public static void main(String[] args) {
		int sum, num1, num2;
		System.out.println("Enter Any To Numbers:");
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter First Number= ");
		num1= sc.nextInt();
		
		System.out.println("Enter Secound Number= ");
		num2= sc.nextInt();
		
		sum= num1 + num2;
		
		System.out.println("Additon of "+num1+" + "+num2+" = "+sum);
	}
}
