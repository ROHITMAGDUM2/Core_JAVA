package assignments.array;

//Write a Java program to test if 10 appears as either the first or last element of an array of integers. The length of the array must be greater than or equal to 2.Test Data: array = 10, -20, 0, 30, 40, 60, 10

public class Ex01_10AppearOnLength {

	public static void main(String[] args) {
		int[] array = { 10, -20, 0, 30, 40, 60, 10 };

		boolean firstIs10 = (array[0] == 10);
		boolean lastIs10 = (array[array.length - 1] == 10);

		// here checking if 10 appears on first or last index
		if (firstIs10 || lastIs10) {
			System.out.println("10 appears as either the first or last element of the array.");
		} else {
			System.out.println("10 does not appear as either the first or last element of the array.");
		}
	}
}
