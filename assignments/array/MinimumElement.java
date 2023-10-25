package arrayprograms;

//   Write a Java program to find the minimum element in an array of integers.

public class MinimumElement {
	
	public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {23, 45, 12, 56, 78, 34, 9, 51, 17};

        // Initialize the minimum element as the first element of the array
        int min = numbers[0];

        // Loop through the array to find the minimum element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // Print the minimum element
        System.out.println("The minimum element in the array is: " + min);
    }
}
