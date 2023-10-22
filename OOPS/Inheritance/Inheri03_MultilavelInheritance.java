package OOPS.Inheritance;

class A1{
	void showA() {
		System.out.println("A1 class Method");
	}
}

class B1 extends A1{
	void showB() {
		System.out.println("B1 class Method");
	}
}
class C1 extends B1{
	void showC() {
		System.out.println("C1 class Method");
	}
}

public class Inheri03_MultilavelInheritance {

	public static void main(String[] args) {
		System.out.println("Multilavel Inheritance");
		
		A1 obj1 = new A1();
		obj1.showA();
//		obj1.showB(); //Ucp: The method showB() is undefined for the type A1
//		obj1.showC(); //Ucp: The method showC() is undefined for the type A1
		
		System.out.println("--------------");
		B1 obj2 = new B1();
		obj2.showA();
		obj2.showB();
//		obj2.showC(); //Ucp: The method showB() is undefined for the type B1
		
		System.out.println("--------------");
		C1 obj3 = new C1();
		obj3.showA();
		obj3.showB();
		obj3.showC();
		
		
	}

}
