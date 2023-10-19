package OOPS.Classes;

public class Test01 {

	public static void main(String[] args) {
//		Creating object for ClassEx01 using reference variable c1
		ClassEx01 c1 = new ClassEx01();

//		Creating object for ClassEx01 using reference variable c2
		ClassEx01 c2 = new ClassEx01();

//		Initialization and declare value for a variable 
		// dot(.) spreader
		c1.a = 100;
		System.out.println(c1.a);

		c2.a = 200;
		System.out.println(c2.a);
		
		//calling m1 method
		c1.m1();

	}

}
