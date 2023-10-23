package assignments.array;

//Write a Java program to create a new array of length 2 from two arrays of integers with three elements and the new array will contain the first and last elements from the two arrays.

public class Ex04_CreatingNewArray {

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		if (array1.length == 3 && array2.length == 3) {
			int[] newArray = new int[2];
			newArray[0] = array1[0];
			newArray[1] = array2[2]; // Accessing the last element of array2

			System.out.print("New array: [");
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i]);
				if (i < newArray.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		} else {
			System.out.println("Both arrays must have a length of 3.");
		}
	}
}
