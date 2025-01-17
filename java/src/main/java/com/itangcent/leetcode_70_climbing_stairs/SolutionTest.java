package com.itangcent.leetcode_70_climbing_stairs;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1
        test(1, solution.climbStairs(1), 1);
        
        // Test case 2
        test(2, solution.climbStairs(2), 2);
        
        // Test case 3
        test(3, solution.climbStairs(3), 3);
        
        // Test case 4
        test(4, solution.climbStairs(4), 5);
        
        System.out.println("All test cases passed!");
    }
    
    private static void test(int input, int actual, int expected) {
        if (actual != expected) {
            throw new AssertionError(String.format(
                "Test failed for n = %d: expected %d but got %d", 
                input, expected, actual
            ));
        }
        System.out.println("Test passed for n = " + input);
    }
} 