package com.itangcent.leetcode_440_k_th_smallest_in_lexicographical_order;

/**
 * Test class for the solution to LeetCode problem #440: k-th-smallest-in-lexicographical-order
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Small range
        System.out.println("Test case for small range (n=13, k=2): " +
            (solution.findKthNumber(13, 2) == 10 ? "PASSED" : "FAILED"));

        // Test case 2: First element
        System.out.println("Test case for first element (n=13, k=1): " +
            (solution.findKthNumber(13, 1) == 1 ? "PASSED" : "FAILED"));

        // Test case 3: Last element
        System.out.println("Test case for last element (n=13, k=13): " +
            (solution.findKthNumber(13, 13) == 9 ? "PASSED" : "FAILED"));

        // Test case 4: Larger range
        System.out.println("Test case for larger range (n=100, k=10): " +
            (solution.findKthNumber(100, 10) == 17 ? "PASSED" : "FAILED"));

        // Test case 5: Edge case with single digit
        System.out.println("Test case for single digit (n=1, k=1): " +
            (solution.findKthNumber(1, 1) == 1 ? "PASSED" : "FAILED"));

        // Test case 6: Failing case from feedback (n=100, k=90)
        System.out.println("Test case for failing scenario (n=100, k=90): " +
            (solution.findKthNumber(100, 90) == 9 ? "PASSED" : "FAILED"));

        // Test case 7: Sequential numbers (n=20, k=5)
        System.out.println("Test case for sequential numbers (n=20, k=5): " +
            (solution.findKthNumber(20, 5) == 13 ? "PASSED" : "FAILED"));

        // Test case 8: Larger range (n=1000, k=100)
        System.out.println("Test case for larger range (n=1000, k=100): " +
            (solution.findKthNumber(1000, 100) == 188 ? "PASSED" : "FAILED"));

        // Test case 9: Another edge case (n=10, k=3)
        System.out.println("Test case for edge case (n=10, k=3): " +
            (solution.findKthNumber(10, 3) == 2 ? "PASSED" : "FAILED"));

        // Test case 10: Another edge case (n=681692778, k=351251360)
        System.out.println("Test case for edge case (n=10, k=3): " +
            (solution.findKthNumber(681692778, 351251360) == 416126219 ? "PASSED" : "FAILED"));
    }
}
