package assignments.array;

//Write a Java program to test that a given array of integers of length 2 contains a 4 or a 7.

public class Ex05_ArrayContains4or7 {

	public static void main(String[] args) {
		int[] array = { 3, 7 }; // Replace this with your input array

		if (array.length == 2 && (array[0] == 4 || array[0] == 7 || array[1] == 4 || array[1] == 7)) {
			System.out.println("The array contains a 4 or a 7.");
		} else {
			System.out.println("The array does not contain a 4 or a 7.");
		}
	}
}
