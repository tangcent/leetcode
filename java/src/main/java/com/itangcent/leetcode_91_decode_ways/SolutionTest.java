package com.itangcent.leetcode_91_decode_ways;

/**
 * Test class for the solution to LeetCode problem #91: decode-ways
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: "12" -> 2 (can be decoded as "AB" or "L")
        String s1 = "12";
        System.out.println("Test case 1: " + s1);
        System.out.println("Expected: 2, Actual: " + solution.numDecodings(s1));

        // Test case 2: "226" -> 3 (can be decoded as "BZ", "VF", or "BBF")
        String s2 = "226";
        System.out.println("\nTest case 2: " + s2);
        System.out.println("Expected: 3, Actual: " + solution.numDecodings(s2));

        // Test case 3: "06" -> 0 (invalid because '0' cannot be decoded alone)
        String s3 = "06";
        System.out.println("\nTest case 3: " + s3);
        System.out.println("Expected: 0, Actual: " + solution.numDecodings(s3));

        // Test case 4: "10" -> 1 (can only be decoded as "J")
        String s4 = "10";
        System.out.println("\nTest case 4: " + s4);
        System.out.println("Expected: 1, Actual: " + solution.numDecodings(s4));

        // Test case 5: "27" -> 1 (can only be decoded as "BG")
        String s5 = "27";
        System.out.println("\nTest case 5: " + s5);
        System.out.println("Expected: 1, Actual: " + solution.numDecodings(s5));

        // Test case 6: "11106" -> 2 (can be decoded as "AAJF" or "KJF")
        String s6 = "11106";
        System.out.println("\nTest case 6: " + s6);
        System.out.println("Expected: 2, Actual: " + solution.numDecodings(s6));

        // Test case 7: "12345" -> 3 (can be decoded as "ABCDE", "LCDE", or "AWDE")
        String s7 = "12345";
        System.out.println("\nTest case 7: " + s7);
        System.out.println("Expected: 3, Actual: " + solution.numDecodings(s7));
    }
}
