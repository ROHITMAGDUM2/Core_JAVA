package DSA90dayschalange;

/**
 * Challenge 01
 * Given an array of integers nums and an integer target, you need to find two numbers in the array such that they add up to the target. The program should return the indices of these two numbers. You can assume that each input has exactly one solution, and you may not use the same element twice. You can return the answer in any order.
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numIndices = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numIndices.containsKey(complement)) {
                return new int[] {numIndices.get(complement), i};
            }
            numIndices.put(nums[i], i);
        }
        
        // If no solution is found, you can return null or throw an exception, depending on your preference
        return null;
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 9, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        if (result != null) {
            System.out.println("Indices: " + result[0] + ", " + result[1]); // Output: Indices: 0, 1
        } else {
            System.out.println("No solution found.");
        }
    }
}
