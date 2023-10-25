package inheritance;

class A{
	public void displayA() {
		System.out.println("A class Method");
	}
}

class B extends A{
	public  void displayB() {
		System.out.println("B class Method");
	}
}



public class _02_SingleInheri {

	public static void main(String[] args) {
		A a = new A();
		a.displayA();
//		a.displayB();//The method displayB() is undefined for the type A
		
		System.out.println("===================");
		B b = new B();
		b.displayA();
		b.displayB();
		
		
		
	}

}
