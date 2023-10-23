package assignments.array;

//Write a Java program to get the larger value between first and last element of an array (length 3) of integers

public class Ex07_LargeValue {
	public static void main(String[] args) {
		int[] array = { 20, 30, 40 }; // Replace this with your input array

		if (array.length == 3) {
			int firstElement = array[0];
			int lastElement = array[array.length - 1]; // Use array.length - 1 to get the last element

			int largerValue = Math.max(firstElement, lastElement);

			System.out.println("Original Array: [" + array[0] + ", " + array[1] + ", " + array[2] + "]");
			System.out.println("Larger Value between the first and last elements: " + largerValue);
		} else {
			System.out.println("The array must have a length of 3.");
		}
	}
}
