package assignments;

public class AbsuluteValueEg {
	public static void main(String[] args) {
		
		System.out.println("Before Method");
		m1();
		System.out.println("After Method");

	}

	private static void m1() {
		int number = 20;

		int absuluteValue = 0;

		if (number > 0) {
			absuluteValue = number;
		} else {
			absuluteValue = -number;
		}

		System.out.println(number + "'s absulute value is " + absuluteValue);
	}
}
