package methods;

public class PrintStrimes {

	public static void main(String[] args) {
		
//		The three different print options in the class PrintStream are:
//			print
//			println
//			printf
		
		int a= 10;
		//print
		System.out.print(a);
		System.out.print("this is a print strime example "+a);

//		print method instead prints just the string "this is a print strime example ", but does not move the cursor to a new line. 
//		In this case is the output a string, but the string could also be from the type int and double.
		
		//println
		System.out.println();
		System.out.println(a);
		System.out.println("this is a print strime example "+a);
		
//		The println("this is a print strime example 10") method prints: "This is an example." and moves the cursor to a new line. 
//		In this case is the output a string, but the string could also be from the type int and double.
//		
//		println()/print is efficient for simply printing a line of text. 
//		If the line of text needs to be formatted (ex: alignment (left/right/etc..-justified) ), then printf would be used.
		
		
//		PRINTF(” … “)
//		printf gives you the option to print a variable in a piece of text. For example:
		
		
		//%d	Integer
		System.out.printf("this is a integer number %d.\n",a);
		
		// A Summary of PRINTF Format Specifier
		//%c	Character
		//%f	floating-point number
		//%s	a string of characters
		//%%	print a percent sign
		//%e	exponential floating-point number
		//lets try
		char ch= 'J';
		System.out.printf("this is a Character: %c.\n",ch);
		
		float f=19.0f;
		System.out.printf("This a floating point: %f.\n",f);
		
		String s="Java";
		System.out.printf("This is a String: %s. \n", s);
		System.out.printf("This is a String: %10S. \n", s);
		
		//tab, backspace
		System.out.printf("This is a String: %s.\t\t", s);
		System.out.printf("This is a String: %S.\\", s);
		
	}

}


//Output:
//	10this is a print strime example 10
//	10
//	this is a print strime example 10
//	this is a integer number 10.
//	this is a Character: J.
//	This a floating point: 19.000000.
//	This is a String: Java. 
//	This is a String:       JAVA. 
//	This is a String: Java.		This is a String: JAVA.\
