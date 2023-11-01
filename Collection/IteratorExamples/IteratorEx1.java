package IteratorExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorEx1{
    public static void main(String[] args) {
        // Create a list of numbers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

        // Create an iterator for the list
        Iterator<Integer> iterator = numbers.iterator();

        // Initialize variables for statistics
        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;

        // Iterate through the list using the iterator
        while (iterator.hasNext()) {
            int num = iterator.next();
            
            // Calculate sum
            sum += num;

            // Find maximum and minimum values
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }

            // Count the total number of elements
            count++;
        }

        // Print the sum of all numbers
        System.out.println("Sum of all numbers: " + sum);

        // Print the maximum and minimum values
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);

        // Print the total number of elements
        System.out.println("Total number of elements: " + count);
    }
}
