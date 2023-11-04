//value return by Method

package methods;

public class MethodExamples {
	static void m1() {
		System.out.println("This is the method with no return type");
		m2();
	}
	
	static int m2() {
		System.out.println("This is the method with  returm type");
		return 10;
	}
	
	static int m1(int a) {
		System.out.println(a);
		return a;
	}
	public static void main(String[] args) {
		m1();
		int x= m2();
		System.out.println(x);
		m1(500);
		
		System.out.println(m1(200));
	}
}
