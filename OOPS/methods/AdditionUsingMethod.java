package OOPS.methods;

public class AdditionUsingMethod {
	int a = 100;
	int b = 200;

	public void addition() {
		System.out.println("Additon of A and B =" + (a + b));
	}

	public void addition(int x, int y) {
		System.out.println("Additon of X and Y =" + (x + y));
	}

	public static void main(String[] args) {
		int a = 10;
		int b = 20;

		int c = a + b;
		System.out.println("Addition of A and B =" + c);

		AdditionUsingMethod ad = new AdditionUsingMethod();
		ad.addition();

		ad.addition(1, 2);
	}

}
