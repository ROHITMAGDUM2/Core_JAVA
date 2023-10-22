package OOPS.Inheritance;

class AClass{
	void showA() {
		System.out.println("A class Method");
	}
}

class BClass extends AClass{
	void showB() {
		System.out.println("B class Method");
	}
}

public class Inheri02_SingleInheritance {

	public static void main(String[] args) {
		System.out.println("Single Inheritance");
		
		AClass obj1 = new AClass();
		obj1.showA();
//		obj2.showB();
		
		System.out.println("--------------");
		BClass obj2 = new BClass();
		obj2.showA();
		obj2.showB();
		
	}

}
