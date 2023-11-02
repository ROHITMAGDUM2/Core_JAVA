package OOPS.Abstraction;

public class TestInterface implements _02_IntroInterface{

	public void m1() {
		System.out.println("Calling m1 method ");
	}
	
	public static void main(String[] args) {
		TestInterface t= new TestInterface();
		t.m1();
		_02_IntroInterface.m3();
		t.m2();
		System.out.println(_02_IntroInterface.a);
	}
}
