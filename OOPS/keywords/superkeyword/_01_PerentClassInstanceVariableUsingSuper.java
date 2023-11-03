package OOPS.keywords.superkeyword;

// 1. "super" keyword can be used to refer immediate parent class instance variable

class Parent{
	int intvalue=10;
}
class Child extends Parent{
	int intValue= 20;
	void show(int intValue) {
		System.out.println(intValue);
		System.out.println(this.intValue);
		System.out.println(super.intvalue);
	}
}

public class _01_PerentClassInstanceVariableUsingSuper {

	public static void main(String[] args) {
		Child c= new Child();
		c.show(30);
	}

}
