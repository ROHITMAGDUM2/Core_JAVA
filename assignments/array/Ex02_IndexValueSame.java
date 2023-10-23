package assignments.array;

//Write a Java program to test if the first and the last element of an array of integers are same. The length of the array must be greater than or equal to 2. Test Data: array = 50, -20, 0, 30, 40, 60, 10

public class Ex02_IndexValueSame {

	public static void main(String[] args) {
		int[] array = { 50, -20, 0, 30, 40, 60, 10 };

		if (array.length >= 2 && array[0] == array[array.length - 1]) {
			System.out.println("The first and last elements of the array are the same.");
		} else {
			System.out.println("The first and last elements of the array are not the same.");
		}
	}
}
