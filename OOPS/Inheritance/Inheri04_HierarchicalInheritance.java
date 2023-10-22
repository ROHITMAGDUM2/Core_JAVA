package OOPS.Inheritance;

class Aa {
	void showA() {
		System.out.println("A1 class Method");
	}
}

class Bb extends Aa {
	void showB() {
		System.out.println("B1 class Method");
	}
}

class Cc extends Aa {
	void showC() {
		System.out.println("C1 class Method");
	}
}

public class Inheri04_HierarchicalInheritance {

	public static void main(String[] args) {
		System.out.println("Hierarchical Inheritance");

		Aa obj1 = new Aa();
		obj1.showA();
//		obj1.showB(); //Ucp: The method showB() is undefined for the type Aa
//		obj1.showC(); //Ucp: The method showC() is undefined for the type Aa

		System.out.println("--------------");
		Bb obj2 = new Bb();
		obj2.showA();
		obj2.showB();
//		obj2.showC(); //Ucp: The method showB() is undefined for the type Bb

		System.out.println("--------------");
		Cc obj3 = new Cc();
		obj3.showA();
//		obj3.showB(); //Ucp: The method showB() is undefined for the type Cc
		obj3.showC();

	}

}
