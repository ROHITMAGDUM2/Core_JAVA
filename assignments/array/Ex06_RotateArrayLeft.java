package assignments.array;

//Write a Java program to rotate an array (length 3) of integers in left direction. 
//Sample Output:
//Original Array: [20, 30, 40]     
//Rotated Array: [30, 40, 20]

public class Ex06_RotateArrayLeft {

	public static void main(String[] args) {
		int[] array = { 20, 30, 40 };

		System.out.print("Original Array: ");
		printArray(array);

		rotateLeft(array);

		System.out.print("Rotated Array: ");
		printArray(array);
	}

	public static void rotateLeft(int[] arr) {
		if (arr.length < 2) {
			return; // No rotation needed for arrays with 0 or 1 elements
		}

		int temp = arr[0]; // Store the first element in a temporary variable

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1]; // Shift elements to the left
		}

		arr[arr.length - 1] = temp; // Place the first element at the end
	}

	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}
}
