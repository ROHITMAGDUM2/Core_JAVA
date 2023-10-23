package assignments.array;

//Write a Java program to test if the first or the last element of two array of integers are same. The length of the array must be greater than or equal to 2. Test Data: array1 = 50, -20, 0, 30, 40, 60, 12 array2 = 45, 20, 10, 20, 30, 50, 11

public class Ex03_IndexValueSameOfTwoArrays {
	public static void main(String[] args) {
		int[] array1 = { 50, -20, 0, 30, 40, 60, 12 };
		int[] array2 = { 45, 20, 10, 20, 30, 50, 11 };

		if (array1.length >= 2 && array2.length >= 2) {
			if (array1[0] == array2[0] || array1[array1.length - 1] == array2[array2.length - 1]) {
				System.out.println("The first or last elements of the two arrays are the same.");
			} else {
				System.out.println("The first or last elements of the two arrays are not the same.");
			}
		} else {
			System.out.println("Both arrays must have a length of at least 2.");
		}
	}
}
