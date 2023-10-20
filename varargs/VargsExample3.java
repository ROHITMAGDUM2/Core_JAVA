package varargs;

public class VargsExample3 {

	public static void m1(int... k) {

		System.out.println("M1 with int");

		for (int i : k) {
			System.out.println(i);
		}

	}

	public static void m1(double... k) {
		System.out.println("M1 with double");

		for (double i : k) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {

		m1(1, 2, 3);

		System.out.println("=====================");

		System.out.println("=====================");
		m1(1.1, 2.2, 3.3);
		System.out.println("=====================");
		m1();

	}

}