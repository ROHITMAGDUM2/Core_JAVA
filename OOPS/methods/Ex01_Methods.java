package OOPS.methods;

public class Ex01_Methods {

	int a = 10; // instance variable

	static int b = 20; // static variable

	void m1() { // instance method
		int c = 30; // local variable
		System.out.println("I am in m1 " + c);
	}

	static void m2() { // static method
		int d = 40;// local variable
		System.out.println("I am In static" + d);
	}

	//
	{// 2nd
		System.out.println("Anonums block");
	}

	static { // 1st
		System.out.println("Static anonumus block");
	}

	public class InnerClass { // inner Class
		public void m3() {
			System.out.println("In InnerClass M3 Method");
		}
	}

	public Ex01_Methods() { // Constructor
		System.out.println("I am in constructor");// 3rd
	}

}
