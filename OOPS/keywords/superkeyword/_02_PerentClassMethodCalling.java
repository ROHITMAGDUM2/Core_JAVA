package OOPS.keywords.superkeyword;

// 2. "super" keyword can be used to invoke immidiate parent class method

class ParentClass{
	void m1() {
		System.out.println("I am in Parent Class Method M1");
	}
}
class ChildClass extends ParentClass{
	void m1() {
		
		System.out.println("I am in Child Class Method M1");
	}
	
	void m2() {
		this.m1();
		super.m1();
	}
}

class _02_PerentClassMethodCalling {

	public static void main(String[] args) {
		ChildClass ch = new ChildClass();
		ch.m2();
	}

}
