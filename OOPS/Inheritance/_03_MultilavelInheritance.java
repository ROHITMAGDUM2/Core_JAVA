package inheritance;

class A1{
	public void displayA1() {
		System.out.println("A class Method");
	}
}

class B1 extends A1{
	public  void displayB1() {
		System.out.println("B class Method");
	}
}
class C1 extends B1{
	public  void displayC1() {
		System.out.println("C class Method");
	}
}


public class _03_MultilavelInheritance {

	public static void main(String[] args) {
		
		A1 a1 = new A1();
		a1.displayA1();
//		a1.displayB1(); //The method displayB1() is undefined for the type A1
//		a1.displayC1(); //The method displayC1() is undefined for the type A1
		
		System.out.println("=====================");
		B1 b1 = new B1();
		b1.displayA1();
		b1.displayB1();
//		b1.displayC1();  //The method displayC1() is undefined for the type B1
		
		
		System.out.println("=====================");
		C1 c1 = new C1();
		c1.displayA1();
		c1.displayB1();
		c1.displayC1();
		
	}

}


/**
 A class Method //A
=====================
A class Method
B class Method
=====================
A class Method
B class Method
C class Method
 */



