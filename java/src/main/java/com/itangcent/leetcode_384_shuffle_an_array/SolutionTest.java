package com.itangcent.leetcode_384_shuffle_an_array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Test class for the solution to LeetCode problem #384: shuffle-an-array
 */
public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("Running tests for LeetCode problem #384: shuffle-an-array");
        
        // Test case 1: Basic functionality
        testBasicFunctionality();
        
        // Test case 2: Test that reset returns the original array
        testReset();
        
        // Test case 3: Test that shuffle produces different arrangements
        testShuffleRandomness();
        
        // Test case 4: Test with empty array
        testEmptyArray();
        
        // Test case 5: Test with single element array
        testSingleElementArray();
    }
    
    private static void testBasicFunctionality() {
        System.out.println("\nTest case for basic functionality:");
        int[] nums = {1, 2, 3, 4, 5};
        Solution solution = new Solution(nums);
        
        // Original array
        System.out.println("Original array: " + Arrays.toString(nums));
        
        // Shuffle the array
        int[] shuffled = solution.shuffle();
        System.out.println("Shuffled array: " + Arrays.toString(shuffled));
        
        // Check that all elements are still present in the shuffled array
        boolean containsAllElements = containsSameElements(nums, shuffled);
        System.out.println("Test case for all elements present: " + (containsAllElements ? "PASSED" : "FAILED"));
    }
    
    private static void testReset() {
        System.out.println("\nTest case for reset functionality:");
        int[] nums = {1, 2, 3, 4, 5};
        Solution solution = new Solution(nums);
        
        // Get original array reference
        int[] original = nums.clone();
        
        // Shuffle the array
        solution.shuffle();
        
        // Reset the array
        int[] reset = solution.reset();
        
        // Compare reset array with original
        boolean resetSuccessful = Arrays.equals(original, reset);
        System.out.println("Test case for reset: " + (resetSuccessful ? "PASSED" : "FAILED"));
        if (!resetSuccessful) {
            System.out.println("Expected: " + Arrays.toString(original));
            System.out.println("Actual: " + Arrays.toString(reset));
        }
    }
    
    private static void testShuffleRandomness() {
        System.out.println("\nTest case for shuffle randomness:");
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Solution solution = new Solution(nums);
        
        // Run shuffle multiple times and check if we get different arrangements
        int numShuffles = 10;
        String[] shuffles = new String[numShuffles];
        
        for (int i = 0; i < numShuffles; i++) {
            int[] shuffled = solution.shuffle();
            shuffles[i] = Arrays.toString(shuffled);
            // Reset after each shuffle to ensure we start with the original array
            solution.reset();
        }
        
        // Count unique arrangements
        int uniqueArrangements = countUniqueArrangements(shuffles);
        
        System.out.println("Number of unique arrangements (out of " + numShuffles + "): " + uniqueArrangements);
        boolean isRandom = uniqueArrangements > 1; // We expect at least some randomness
        System.out.println("Test case for randomness: " + (isRandom ? "PASSED" : "FAILED"));
    }
    
    private static void testEmptyArray() {
        System.out.println("\nTest case for empty array:");
        int[] nums = {};
        Solution solution = new Solution(nums);
        
        // Test shuffle
        int[] shuffled = solution.shuffle();
        boolean isEmpty = shuffled.length == 0;
        System.out.println("Test case for empty array shuffle: " + (isEmpty ? "PASSED" : "FAILED"));
        
        // Test reset
        int[] reset = solution.reset();
        boolean isEmptyAfterReset = reset.length == 0;
        System.out.println("Test case for empty array reset: " + (isEmptyAfterReset ? "PASSED" : "FAILED"));
    }
    
    private static void testSingleElementArray() {
        System.out.println("\nTest case for single element array:");
        int[] nums = {42};
        Solution solution = new Solution(nums);
        
        // Test shuffle
        int[] shuffled = solution.shuffle();
        boolean hasCorrectValue = shuffled.length == 1 && shuffled[0] == 42;
        System.out.println("Test case for single element array shuffle: " + (hasCorrectValue ? "PASSED" : "FAILED"));
        
        // Test reset
        int[] reset = solution.reset();
        boolean hasCorrectValueAfterReset = reset.length == 1 && reset[0] == 42;
        System.out.println("Test case for single element array reset: " + (hasCorrectValueAfterReset ? "PASSED" : "FAILED"));
    }
    
    private static boolean containsSameElements(int[] original, int[] shuffled) {
        if (original.length != shuffled.length) {
            return false;
        }
        
        Map<Integer, Integer> countMap = new HashMap<>();
        
        // Count elements in original array
        for (int num : original) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        // Count down for elements in shuffled array
        for (int num : shuffled) {
            int count = countMap.getOrDefault(num, 0);
            if (count == 0) {
                return false; // Element in shuffled not in original
            }
            countMap.put(num, count - 1);
        }
        
        // All counts should be 0
        for (int count : countMap.values()) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
    
    private static int countUniqueArrangements(String[] arrangements) {
        Map<String, Boolean> uniqueMap = new HashMap<>();
        for (String arrangement : arrangements) {
            uniqueMap.put(arrangement, true);
        }
        return uniqueMap.size();
    }
}
