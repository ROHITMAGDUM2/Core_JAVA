/*
WAP dividing a number by zero. The code is enclosed into try block and a catch handler is provided to handle the exception.
 */
package interfaces.chakedOrUnchaked;

public class DevidedByZero {

	public static void main(String[] args) {

		int a = 5;
		int b = 0;

		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println("Devided By zero Opration can not be possible");
		}

	}

}
