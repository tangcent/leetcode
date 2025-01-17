package com.itangcent.leetcode_162_find_peak_element;

/**
 * Test class for the solution to LeetCode problem #162: find-peak-element
 * 
 * Problem: Find a peak element in the array. A peak element is an element that is strictly
 * greater than its neighbors. You may return any valid peak index.
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #162: find-peak-element");
        
        // Test case 1: [1,2,3,1]
        // Expected answer: 2 (index of element 3)
        testFindPeakElement(solution, new int[]{1, 2, 3, 1}, 2);
        
        // Test case 2: [1,2,1,3,5,6,4]
        // Expected answers can be 1 or 5 (indices of elements 2 or 6)
        int result = solution.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        boolean isPeakIndex = result == 1 || result == 5;
        System.out.println("Test case for [1,2,1,3,5,6,4]: " + (isPeakIndex ? "PASSED" : "FAILED"));
        if (!isPeakIndex) {
            System.out.println("  Expected: 1 or 5, Actual: " + result);
        }
        
        // Test case 3: [1]
        // Expected answer: 0 (only one element is always a peak)
        testFindPeakElement(solution, new int[]{1}, 0);
        
        // Test case 4: [1,2]
        // Expected answer: 1 (index of element 2)
        testFindPeakElement(solution, new int[]{1, 2}, 1);
        
        // Test case 5: [3,2,1]
        // Expected answer: 0 (index of element 3)
        testFindPeakElement(solution, new int[]{3, 2, 1}, 0);
        
        // Test case 6: [1,2,3,4,5]
        // Expected answer: 4 (index of element 5)
        testFindPeakElement(solution, new int[]{1, 2, 3, 4, 5}, 4);
        
        // Test case 7: [6,5,4,3,2,1]
        // Expected answer: 0 (index of element 6)
        testFindPeakElement(solution, new int[]{6, 5, 4, 3, 2, 1}, 0);
        
        // Edge case: array with two identical peak elements
        int[] twoIdenticalPeaks = {1, 3, 2, 3, 1};
        int peakIndex = solution.findPeakElement(twoIdenticalPeaks);
        boolean isValid = peakIndex == 1 || peakIndex == 3;
        System.out.println("Test case for [1,3,2,3,1]: " + (isValid ? "PASSED" : "FAILED"));
        if (!isValid) {
            System.out.println("  Expected: 1 or 3, Actual: " + peakIndex);
        }
    }
    
    private static void testFindPeakElement(Solution solution, int[] nums, int expected) {
        int result = solution.findPeakElement(nums);
        boolean passed = result == expected;
        
        // Format array as string for display
        StringBuilder arrStr = new StringBuilder("[");
        for (int i = 0; i < nums.length; i++) {
            arrStr.append(nums[i]);
            if (i < nums.length - 1) {
                arrStr.append(", ");
            }
        }
        arrStr.append("]");
        
        System.out.println("Test case for " + arrStr.toString() + ": " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + expected + ", Actual: " + result);
        }
    }
}
