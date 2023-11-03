package OOPS.keywords.statickeyword;
/**
 * 
 * @author RM
 * 
 * Static Method:
 *  static method is use to memory management
 *  
 *  Rules of "static" method
 *  1. "static" method belongs to class, not object
 *  2. a "static" method can be accessed directly by class name and does not need any object.
 *  3. a "static" method can access only static data, it can not access non-static data(instance data).
 *  4. a "static" method can call only other static methods and can not call a non-static methods
 *  5. a "static" method can not refer to "this" or super keyword in anyway.
 *
 */
class A{
	int i=5;
	static int a = 10;
	
	static void display() {
		System.out.println(a);
//		System.out.println(this.i);	//Cannot use this in a static context
		B.show();
	}
}
class B{
	static void show() {
		System.out.println("static show method");
	}
}

public class _02_StaticMethod {

	public static void main(String[] args) {
		A.display();
		StaticBlocks.main();
	}

}

/**
 * Static Block:
 *  ststic block executes automaticaly when the class loaded in the memory
 *  before 1.6 version we can invoke static block without main method
 *  
 *  static members invoke by class's top to bottem 
 *  
 *  use of static block 
 *   it is excecuted at call loading, hence at the time of class loading if we want to perform any activity, 
 *   we want to define that inside static block 
 *   for Eg: it is use to invoke Native Methods.
 *    		 it is use to initialize static members
 */

class StaticBlocks{
	static int b;
	static {
//		it is use to call natice methods
//		use to initialize static members
		b=30;
		System.out.println(b);
	}
	public static void main() {
		System.out.println("Hello");
	}
}
