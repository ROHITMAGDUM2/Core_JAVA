package operators;

public class OperatorsInJava {

	public static void main(String[] args) {
		//operators are symbols or special characters that represent actions
		
		//types:
		//1. Arithmatic
		//2. Assignments
		//3 Comparison(Ralational)
		//4. Logical
		//5. Increment and Decrement
		//6. Conditional (Ternary)
		//7. Bitwise
		//8. Instanceof
		
		
		// 1. ARithmatic Operaters
		/*
		 * `+` (Addition): Adds two operands. 
		 * `-` (Subtraction): Subtracts the right operand from the left operand.
		 * `*` (Multiplication): Multiplies two operands.
		 * `/` (Division): Divides the left operand by the right operand. -
		 * `%` (Modulus): Returns the remainder when the left operand is divided by the right operand.
		 */
			
		
		int a= 503, b=20;
		int addition= a + b; //Addition
		int substraction = a-b; 	
		int multiplication = a*b;	
		double division =  a / b;	
		double modulus = a % b;
		
		
		
		
		System.out.println("The addition of A and B = "+addition );
		System.out.println(substraction);
		System.out.println(multiplication);
		System.out.println(division);
		System.out.println(modulus);
		
	}

}
