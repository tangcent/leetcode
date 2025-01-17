package com.itangcent.leetcode_135_candy;

/**
 * Test class for the solution to LeetCode problem #135: candy
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #135: candy");
        
        // Test Case 1: Example case [1,0,2]
        int[] ratings1 = {1, 0, 2};
        int result1 = solution.candy(ratings1);
        System.out.println("Test case for [1,0,2]: " + (result1 == 5 ? "PASSED" : "FAILED"));
        if (result1 != 5) {
            System.out.println("Expected: 5, Actual: " + result1);
        }
        
        // Test Case 2: Example case [1,2,2]
        int[] ratings2 = {1, 2, 2};
        int result2 = solution.candy(ratings2);
        System.out.println("Test case for [1,2,2]: " + (result2 == 4 ? "PASSED" : "FAILED"));
        if (result2 != 4) {
            System.out.println("Expected: 4, Actual: " + result2);
        }
        
        // Test Case 3: Single element
        int[] ratings3 = {1};
        int result3 = solution.candy(ratings3);
        System.out.println("Test case for [1]: " + (result3 == 1 ? "PASSED" : "FAILED"));
        if (result3 != 1) {
            System.out.println("Expected: 1, Actual: " + result3);
        }
        
        // Test Case 4: All equal ratings
        int[] ratings4 = {1, 1, 1, 1};
        int result4 = solution.candy(ratings4);
        System.out.println("Test case for [1,1,1,1]: " + (result4 == 4 ? "PASSED" : "FAILED"));
        if (result4 != 4) {
            System.out.println("Expected: 4, Actual: " + result4);
        }
        
        // Test Case 5: Strictly increasing ratings
        int[] ratings5 = {1, 2, 3, 4, 5};
        int result5 = solution.candy(ratings5);
        System.out.println("Test case for [1,2,3,4,5]: " + (result5 == 15 ? "PASSED" : "FAILED"));
        if (result5 != 15) {
            System.out.println("Expected: 15, Actual: " + result5);
        }
        
        // Test Case 6: Strictly decreasing ratings
        int[] ratings6 = {5, 4, 3, 2, 1};
        int result6 = solution.candy(ratings6);
        System.out.println("Test case for [5,4,3,2,1]: " + (result6 == 15 ? "PASSED" : "FAILED"));
        if (result6 != 15) {
            System.out.println("Expected: 15, Actual: " + result6);
        }
        
        // Test Case 7: Valley shape
        int[] ratings7 = {5, 4, 1, 4, 5};
        int result7 = solution.candy(ratings7);
        System.out.println("Test case for [5,4,1,4,5]: " + (result7 == 11 ? "PASSED" : "FAILED"));
        if (result7 != 11) {
            System.out.println("Expected: 11, Actual: " + result7);
        }
    }
}
