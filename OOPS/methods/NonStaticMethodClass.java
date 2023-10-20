package OOPS.methods;

public class NonStaticMethodClass {

	// non static method ==> Instance Method
	void nonStaticMethod() {
		System.out.println("I am in Notn static Method");
	}

	public static void main(String[] args) {
		NonStaticMethodClass nsc = new NonStaticMethodClass();
		nsc.nonStaticMethod();
	}
}
