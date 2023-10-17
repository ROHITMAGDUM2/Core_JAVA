package datatypesandvariables;

class Casting{
	
	/**
	Java Type Casting 
	What is a Casting?
	
	In programming, casting refers to the process of converting a value from one data type to another. It is a fundamental operation in many programming languages, including Java. Casting is necessary when you want to change the data type of a variable or an expression to perform certain operations that are only valid for specific data types or to ensure that data is interpreted correctly.
	
	In Java, there are two main types of casting:
	
	Implicit Casting (Widening Conversion): 
	This type of casting is done automatically by the Java compiler when you convert a value from a smaller data type to a larger one without any loss of data. For example, converting an int to a double is an implicit cast because there's no data loss.
	
	Explicit Casting (Narrowing Conversion):
	This type of casting is done manually by the programmer and is used when you want to convert a value from a larger data type to a smaller one, which could result in data loss. To perform explicit casting, you need to use parentheses and specify the target data type.
	*/
		
	public void implicitCasting() {
		
		// Implicit type casting, also known as implicit type conversion or widening conversion, is the automatic conversion of a value from one data type to another by the programming language without any explicit action from the programmer. It occurs when you assign a value of one data type to a variable of another data type in a way that doesn't result in data loss or a loss of precision.
		
//		byte => short => int => long => float => double
//				char  => int =>

//		In Java, implicit type casting typically happens in the following scenarios:

//		1. Smaller Data Type to Larger Data Type: When you assign a value of a smaller data type to a variable of a larger data type, Java automatically performs implicit casting because there's no risk of data loss. For example:

		   
		   int intValue = 42;
		   double doubleValue = intValue; // Implicit casting from int to double
		   
		   System.out.println("Implicit casting from int to double "+doubleValue);
		   

//		2. Literals: When you use numeric literals in an expression, Java implicitly casts them to the most significant data type present in the expression. For example:

		   
		   int a = 5;
		   double b = 2.5;
		   double result = a + b; // Implicit casting of 'a' from int to double
		   
		   System.out.println("Implicit casting of 'a' from int to double "+result);
		

//		3. Expressions: Implicit casting occurs in expressions when different data types are involved. The result of the expression is automatically cast to the most significant data type present in the expression.

		  
		   int intValue1 = 5;
		   double doubleValue1 = 2.5;
		   double result1 = intValue1 + doubleValue1; // Implicit casting of 'intValue1' from int to double
		   
		   System.out.println("Implicit casting of 'intValue' from int to double "+result1);		  

		   System.out.println("Implicit casting is a feature in Java designed to make the code more flexible and convenient by allowing you to work with different data types without explicit conversions in many common situations. However, you should be aware of the potential issues related to precision and data range when working with different data types, especially when mixing integral and floating-point types.");
	}


	public void explicitCasting() {
//		Explicit type casting, also known as explicit type conversion or narrowing conversion, is the manual process of converting a value from one data type to another in Java. Unlike implicit type casting, which is done automatically by the compiler, explicit type casting requires the programmer to specify the desired data type using parentheses. This type of casting is used when you want to convert a value from a larger data type to a smaller one, which could result in data loss or a loss of precision.

	
//		1.  Syntax:  To explicitly cast a value to a different data type, you use the following syntax:

		  
//		   targetDataType variableName = (targetDataType) sourceValue;
		  

//		2.  Example - Casting from double to int: 

		  
		   double doubleValue = 5.75;
		   int intValue = (int) doubleValue; // Explicit cast from double to int
		   
		   System.out.println("Explicit cast from double to int "+intValue);
		  

//		   In this example, the `(int)` in `(int) doubleValue` explicitly casts the `doubleValue` from a `double` to an `int`. Be aware that this conversion truncates the fractional part, so `intValue` will be `5`.

//		3.  Example - Casting from float to short: 

		  
		   float floatValue = 3.14f;
		   short shortValue = (short) floatValue; // Explicit cast from float to short
		   
		   System.out.println("Explicit cast from float to short "+shortValue);
		  

//		   In this example, the `(short)` in `(short) floatValue` explicitly casts the `floatValue` from a `float` to a `short`. 
		   System.out.println("This might result in data loss and potential overflow or underflow issues if the value is outside the valid range for the `short` data type.");

           System.out.println("It's important to exercise caution when using explicit type casting, as you can lose data or encounter unexpected behavior if the source value cannot be accurately represented in the target data type. Always consider the implications of narrowing conversions, and ensure that the values you're converting are within the valid range of the target data type to avoid runtime errors.");
	}

	
}

public class TypeCasting {

	public static void main(String[] args) {
		
		Casting cast= new Casting();
		cast.implicitCasting();
		cast.explicitCasting();
				
	}

}
