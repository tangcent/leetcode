package com.itangcent.leetcode_84_largest_rectangle_in_histogram;

public class SolutionTest {
    private static final Solution solution = new Solution();

    public static void main(String[] args) {
        // Test case 1: Example from LeetCode
        test("Example 1", new int[]{2, 1, 5, 6, 2, 3}, 10);

        // Test case 2: Another example from LeetCode
        test("Example 2", new int[]{2, 4}, 4);

        // Test case 3: Empty array
        test("Empty Array", new int[]{}, 0);

        // Test case 4: Single element
        test("Single Element", new int[]{1}, 1);

        // Test case 5: All same height
        test("All Same Height", new int[]{2, 2, 2, 2}, 8);

        // Test case 6: Descending order
        test("Descending Order", new int[]{4, 3, 2, 1}, 6);

        // Test case 7: Ascending order
        test("Ascending Order", new int[]{1, 2, 3, 4}, 6);
    }

    private static void test(String testName, int[] heights, int expected) {
        int result = solution.largestRectangleArea(heights);
        boolean passed = result == expected;
        System.out.printf("%s: %s%n", testName, passed ? "PASSED" : "FAILED");
        if (!passed) {
            System.out.printf("Expected: %d, Got: %d%n", expected, result);
        }
    }
} 