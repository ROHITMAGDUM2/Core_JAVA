package OOPS.Classes;

public class Test01 {

	public static void main(String[] args) {

		ClassEx01 c1 = new ClassEx01();

		ClassEx01 c2 = new ClassEx01();

		// dot(.) saperater
		c1.a = 100;
		System.out.println(c1.a);

		c2.a = 200;
		System.out.println(c2.a);
		
		c1.m1();

	}

}
