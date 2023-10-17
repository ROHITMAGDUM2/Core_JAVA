package datatypesandvariables;

class Primitive{
	/**
	Java defines eight primitive types of data: byte, short, int, long, char, float, double, and boolean. 
	The primitive types are also commonly referred to as simple types, and both terms will be used in this book. These can be put in four
	groups:
	• Integers This group includes byte, short, int, and long, which are for whole-valued signed numbers.
	
	• Floating-point numbers This group includes float and double, which represent numbers with fractional precision.
	
	• Characters This group includes char, which represents symbols in a character set, like letters and numbers.
	
	• Boolean This group includes boolean, which is a special type for representing true/false values.
	
	*/
	
	public void integersDataTypes() {
	 //The smallest integer type is byte. This is a signed 8-bit type that has a range from –128 to 127.
		
	byte byteType = 0;
	
	
	//short is a signed 16-bit type. It has a range from –32,768 to 32,767. It is probably the least-used Java type.
	
	short ShortType;
	
	
	//The most commonly used integer type is int. It is a signed 32-bit type that has a range from –2,147,483,648 to 2,147,483,647.
	
	int intType= 2147483647;
	
	
	//long is a signed 64-bit type and is useful for those occasions where an int type is not large enough to hold the desired value. The range of a long is quite large. This makes it useful when big, whole numbers are needed. 
	
	long longType= 999999999;
	
	System.out.println("Integer Datatypes are byte, short, int, long");
	}
	
	public void floatingPointType() {
		
		//The type float specifies a single-precision value that uses 32 bits of storage
		float f1=11.66f;
		
		
		//Double precision, as denoted by the double keyword, uses 64 bits to store a	value. 
		//When you need to maintain accuracy over many iterative	calculations, or are manipulating large-valued numbers, double is the best choice.
		
		double PI=3.1416;
		
		System.out.println("Foloting-Point Datatypes are float and double");
	}
	
	public void characterDataType() {
		 ///the data type used to store characters is char. A key point to	 understand is that Java uses Unicode to represent characters.
		
		char ch= 'A';
		ch++;
		
		//The range of a char is 0 to 65,536. There are no negative chars.	The standard set of characters known as ASCII still ranges from 0 to 127 as	always, and the extended 8-bit character set, ISO-Latin-1, ranges from 0 to 255.	Since Java is designed to allow programs to be written for worldwide use, it makes sense that it would use Unicode to represent characters.
		
		System.out.println("Character Datatype is char");
	}
	
	public void booleanDataType() {
//		Java has a primitive type, called boolean, for logical values. It can have only one of two possible values, true or false. This is the type returned by all	relational operators, as in the case of a < b. boolean is also the type required by	the conditional expressions that govern the control statements such as if and for.
		
		boolean bool= true;
		
		System.out.println("Boolean Datatype is boolean");
	}
	
}


public class TypesOfStoringData {
	public static void main(String[] args) {
		
		Primitive pdt =new Primitive();
		pdt.integersDataTypes();
//		pdt.floatingPointType();
//		pdt.characterDataType();
//		pdt.booleanDataType();
	}
	
}
