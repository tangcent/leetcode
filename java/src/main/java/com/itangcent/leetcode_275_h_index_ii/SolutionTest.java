package com.itangcent.leetcode_275_h_index_ii;

/**
 * Test class for the solution to LeetCode problem #275: h-index-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #275: h-index-ii");
        
        // Test case 1: Example from LeetCode
        int[] citations1 = {0, 1, 3, 5, 6};
        int expected1 = 3;
        int result1 = solution.hIndex(citations1);
        System.out.println("Test case for sorted citations [0,1,3,5,6]: " + 
                (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: Another example
        int[] citations2 = {1, 2, 100};
        int expected2 = 2;
        int result2 = solution.hIndex(citations2);
        System.out.println("Test case for sorted citations [1,2,100]: " + 
                (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: All zeros
        int[] citations3 = {0, 0, 0, 0};
        int expected3 = 0;
        int result3 = solution.hIndex(citations3);
        System.out.println("Test case for sorted citations [0,0,0,0]: " + 
                (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Single element
        int[] citations4 = {5};
        int expected4 = 1;
        int result4 = solution.hIndex(citations4);
        System.out.println("Test case for sorted citations [5]: " + 
                (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: All same values
        int[] citations5 = {3, 3, 3, 3};
        int expected5 = 3;
        int result5 = solution.hIndex(citations5);
        System.out.println("Test case for sorted citations [3,3,3,3]: " + 
                (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
