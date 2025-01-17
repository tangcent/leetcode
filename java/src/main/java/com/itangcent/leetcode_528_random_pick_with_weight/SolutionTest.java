package com.itangcent.leetcode_528_random_pick_with_weight;

/**
 * Test class for the solution to LeetCode problem #528: random-pick-with-weight
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution(new int[]{1, 3});
        
        System.out.println("Running tests for LeetCode problem #528: random-pick-with-weight");
        
        // Test basic weight distribution
        int[] counts = new int[2];
        for (int i = 0; i < 1000; i++) {
            counts[solution.pickIndex()]++;
        }
        System.out.println("Test case for basic weights: " + 
            (counts[1] > counts[0] * 2.5 && counts[1] < counts[0] * 3.5 ? "PASSED" : "FAILED"));
        
        // Test equal weights
        Solution equalWeights = new Solution(new int[]{1, 1});
        counts = new int[2];
        for (int i = 0; i < 1000; i++) {
            counts[equalWeights.pickIndex()]++;
        }
        System.out.println("Test case for equal weights: " + 
            (Math.abs(counts[0] - counts[1]) < 100 ? "PASSED" : "FAILED"));
            
        // Test single dominant weight
        Solution dominantWeight = new Solution(new int[]{1, 0, 0, 0, 99});
        counts = new int[5];
        for (int i = 0; i < 1000; i++) {
            counts[dominantWeight.pickIndex()]++;
        }
        System.out.println("Test case for dominant weight: " + 
            (counts[4] > 950 ? "PASSED" : "FAILED"));
            
        // Test larger weight array
        Solution largeWeights = new Solution(new int[]{10, 20, 30, 40});
        counts = new int[4];
        for (int i = 0; i < 1000; i++) {
            counts[largeWeights.pickIndex()]++;
        }
        boolean largePass = true;
        for (int i = 1; i < 4; i++) {
            if (counts[i] <= counts[i-1]) {
                largePass = false;
                break;
            }
        }
        System.out.println("Test case for larger weights: " + (largePass ? "PASSED" : "FAILED"));
    }
}
