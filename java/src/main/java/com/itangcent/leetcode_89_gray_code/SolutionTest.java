package com.itangcent.leetcode_89_gray_code;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #89: gray-code
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #89: gray-code");

        // Test case 1: n = 1
        System.out.println("\nTest case 1: n = 1");
        List<Integer> result1 = solution.grayCode(1);
        System.out.println("Expected: [0, 1]");
        System.out.println("Actual: " + result1);
        System.out.println("Test passed: " + result1.equals(Arrays.asList(0, 1)));

        // Test case 2: n = 2
        System.out.println("\nTest case 2: n = 2");
        List<Integer> result2 = solution.grayCode(2);
        System.out.println("Expected: [0, 1, 3, 2]");
        System.out.println("Actual: " + result2);
        System.out.println("Test passed: " + result2.equals(Arrays.asList(0, 1, 3, 2)));

        // Test case 3: n = 3
        System.out.println("\nTest case 3: n = 3");
        List<Integer> result3 = solution.grayCode(3);
        System.out.println("Expected: [0, 1, 3, 2, 6, 7, 5, 4]");
        System.out.println("Actual: " + result3);
        System.out.println("Test passed: " + result3.equals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4)));

        // Test case 4: n = 4
        System.out.println("\nTest case 4: n = 4");
        List<Integer> result4 = solution.grayCode(4);
        System.out.println("Expected: [0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8]");
        System.out.println("Actual: " + result4);
        System.out.println("Test passed: " + result4.equals(Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8)));

        // Verify Gray Code properties for n = 4
        System.out.println("\nVerifying Gray Code properties for n = 4:");
        boolean isValid = true;
        for (int i = 0; i < result4.size() - 1; i++) {
            int diff = result4.get(i) ^ result4.get(i + 1);
            int bitCount = Integer.bitCount(diff);
            if (bitCount != 1) {
                System.out.println("Error: Numbers " + result4.get(i) + " and " + result4.get(i + 1) +
                        " differ by " + bitCount + " bits");
                isValid = false;
            }
        }
        System.out.println("All consecutive numbers differ by exactly one bit: " + isValid);

        // Verify sequence starts with 0
        System.out.println("Sequence starts with 0: " + (result4.get(0) == 0));

        // Verify all numbers are unique
        boolean allUnique = result4.stream().distinct().count() == result4.size();
        System.out.println("All numbers are unique: " + allUnique);

        // Verify sequence contains all possible n-bit numbers
        boolean containsAll = result4.size() == (1 << 4);
        System.out.println("Contains all possible 4-bit numbers: " + containsAll);
    }
}
