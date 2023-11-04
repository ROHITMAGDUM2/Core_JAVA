package p2;

public class A {
	public void display() {
		System.out.println("Display");
	}
	public static void main(String[] args) {
		p1.A a1 = new p1.A();
		A a2 = new A();
		
		a1.show();
		a2.display();
	}
}
