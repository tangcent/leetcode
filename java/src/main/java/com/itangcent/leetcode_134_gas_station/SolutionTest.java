package com.itangcent.leetcode_134_gas_station;

/**
 * Test class for the solution to LeetCode problem #134: gas-station
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Valid starting point exists
        int[] gas1 = {1, 2, 3, 4, 5};
        int[] cost1 = {3, 4, 5, 1, 2};
        int expected1 = 3;
        int result1 = solution.canCompleteCircuit(gas1, cost1);
        System.out.println("Test case 1: " + (result1 == expected1 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected1 + ", Actual: " + result1 + ")");

        // Test case 2: No valid starting point
        int[] gas2 = {2, 3, 4};
        int[] cost2 = {3, 4, 3};
        int expected2 = -1;
        int result2 = solution.canCompleteCircuit(gas2, cost2);
        System.out.println("Test case 2: " + (result2 == expected2 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected2 + ", Actual: " + result2 + ")");

        // Test case 3: Single station
        int[] gas3 = {4};
        int[] cost3 = {4};
        int expected3 = 0;
        int result3 = solution.canCompleteCircuit(gas3, cost3);
        System.out.println("Test case 3: " + (result3 == expected3 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected3 + ", Actual: " + result3 + ")");

        // Test case 4: Multiple valid starting points (should return the first one)
        int[] gas4 = {5, 1, 2, 3, 4};
        int[] cost4 = {4, 4, 1, 5, 1};
        int expected4 = 4;
        int result4 = solution.canCompleteCircuit(gas4, cost4);
        System.out.println("Test case 4: " + (result4 == expected4 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected4 + ", Actual: " + result4 + ")");

        // Test case 5: All stations have equal gas and cost
        int[] gas5 = {2, 2, 2, 2, 2};
        int[] cost5 = {2, 2, 2, 2, 2};
        int expected5 = 0;
        int result5 = solution.canCompleteCircuit(gas5, cost5);
        System.out.println("Test case 5: " + (result5 == expected5 ? "PASSED" : "FAILED") + 
            " (Expected: " + expected5 + ", Actual: " + result5 + ")");
    }
}
