/*
WAP fetch integer value of an Integer object. But due to bad input, it throws number format exception.

*/
package exceptionhandling;

public class NumberFormatExceptionExample {

	
		
		private static final String inputString= "123.33";
		
		public static void main(String[] args) {
			
		try {
		int a =Integer.parseInt(inputString);
		}catch(NumberFormatException ex) {
			System.out.println("Invalid string in arguments");
			//request for well-formatted string 
		}
		
	}

}
