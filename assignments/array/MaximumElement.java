package arrayprograms;
//Write a Java program to find the maximum element in an array of integers.
public class MaximumElement {

    public static void main(String[] args) {
        // Sample array of integers
        int[] numbers = {23, 45, 12, 56, 78, 34, 9, 51, 17};

        // Initialize the maximum element as the first element of the array
        int max = numbers[0];

        // Loop through the array to find the maximum element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Print the maximum element
        System.out.println("The maximum element in the array is: " + max);
    }
}
