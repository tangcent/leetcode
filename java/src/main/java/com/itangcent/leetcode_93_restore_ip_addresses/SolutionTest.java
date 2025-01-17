package com.itangcent.leetcode_93_restore_ip_addresses;

import java.util.List;

/**
 * Test class for the solution to LeetCode problem #93: restore-ip-addresses
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: "25525511135"
        // Expected: ["255.255.11.135","255.255.111.35"]
        String input1 = "25525511135";
        System.out.println("Test case 1 - Input: " + input1);
        List<String> result1 = solution.restoreIpAddresses(input1);
        System.out.println("Expected: [255.255.11.135, 255.255.111.35]");
        System.out.println("Actual: " + result1);
        System.out.println();

        // Test case 2: "0000"
        // Expected: ["0.0.0.0"]
        String input2 = "0000";
        System.out.println("Test case 2 - Input: " + input2);
        List<String> result2 = solution.restoreIpAddresses(input2);
        System.out.println("Expected: [0.0.0.0]");
        System.out.println("Actual: " + result2);
        System.out.println();

        // Test case 3: "101023"
        // Expected: ["1.0.10.23","1.0.102.3","10.1.0.23","10.10.2.3","101.0.2.3"]
        String input3 = "101023";
        System.out.println("Test case 3 - Input: " + input3);
        List<String> result3 = solution.restoreIpAddresses(input3);
        System.out.println("Expected: [1.0.10.23, 1.0.102.3, 10.1.0.23, 10.10.2.3, 101.0.2.3]");
        System.out.println("Actual: " + result3);
        System.out.println();

        // Test case 4: "1111"
        // Expected: ["1.1.1.1"]
        String input4 = "1111";
        System.out.println("Test case 4 - Input: " + input4);
        List<String> result4 = solution.restoreIpAddresses(input4);
        System.out.println("Expected: [1.1.1.1]");
        System.out.println("Actual: " + result4);
        System.out.println();

        // Test case 5: "010010"
        // Expected: ["0.10.0.10","0.100.1.0"]
        String input5 = "010010";
        System.out.println("Test case 5 - Input: " + input5);
        List<String> result5 = solution.restoreIpAddresses(input5);
        System.out.println("Expected: [0.10.0.10, 0.100.1.0]");
        System.out.println("Actual: " + result5);
        System.out.println();

        // Test case 6: "2736786374048"
        // Expected: [] (empty list because input is too long - 13 characters)
        String input6 = "2736786374048";
        System.out.println("Test case 6 - Input: " + input6);
        List<String> result6 = solution.restoreIpAddresses(input6);
        System.out.println("Expected: []");
        System.out.println("Actual: " + result6);
    }
}
