package operators;

public class AssignmentsOperators {
	public static void main(String[] args) {
		/**Assignment Operators:
			   - `=` (Assignment): Assigns the value on the right to the variable on the left.
			   - `+=`, `-=`, `*=`, `/=`, `%=` (Compound Assignment): Perform the respective operation and assign the result to the left operand.

			   Example:
			   
			   int a = 5;
			   a += 3; // a is now 8 (equivalent to a = a + 3)
			   */
		
		
		/*
		 * int y= 10, a=10;
		 * 
		 * System.out.println(y); System.out.println(a);
		 * 
		 * y=++a; System.out.println(y);
		 */
		
		
//		
//		a= a+1;
//		System.out.println(a);//11
//		
//		a=a-1;
//		System.out.println(a);//10
//		
//	//==================================
//		
//		a++;//a+1
//		System.out.println(a);//11
//		
//		a--;
//		System.out.println(a);//10
//		
//		
		//=========================================
		
		
		int a= 100, b= 200;
		
		a += b; 
		
		System.out.println(a);
		
		
		b *= b; 
		System.out.println(b);
		
		int c =b*b; // b 
		
		
		b %= a;
		System.out.println(b);
		
		
	}
}
