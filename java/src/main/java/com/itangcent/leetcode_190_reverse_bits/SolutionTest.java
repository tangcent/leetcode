package com.itangcent.leetcode_190_reverse_bits;

/**
 * Test class for the solution to LeetCode problem #190: reverse-bits
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #190: reverse-bits");
        
        // Test case 1: Example from LeetCode
        int input1 = 0b00000010100101000001111010011100; // 43261596 in decimal
        int expected1 = 0b00111001011110000010100101000000; // 964176192 in decimal
        int actual1 = solution.reverseBits(input1);
        System.out.println("Test case for example 1: " + (actual1 == expected1 ? "PASSED" : "FAILED"));
        if (actual1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + actual1);
            System.out.println("  Expected (binary): " + Integer.toBinaryString(expected1));
            System.out.println("  Actual (binary): " + Integer.toBinaryString(actual1));
        }
        
        // Test case 2: Another example from LeetCode
        int input2 = 0b11111111111111111111111111111101; // -3 in decimal (two's complement)
        int expected2 = 0b10111111111111111111111111111111; // -1073741825 in decimal
        int actual2 = solution.reverseBits(input2);
        System.out.println("Test case for example 2: " + (actual2 == expected2 ? "PASSED" : "FAILED"));
        if (actual2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + actual2);
            System.out.println("  Expected (binary): " + Integer.toBinaryString(expected2));
            System.out.println("  Actual (binary): " + Integer.toBinaryString(actual2));
        }
        
        // Test case 3: All zeros
        int input3 = 0;
        int expected3 = 0;
        int actual3 = solution.reverseBits(input3);
        System.out.println("Test case for all zeros: " + (actual3 == expected3 ? "PASSED" : "FAILED"));
        if (actual3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + actual3);
        }
        
        // Test case 4: All ones
        int input4 = -1; // All 32 bits are 1
        int expected4 = -1; // Reversing all 1s gives all 1s
        int actual4 = solution.reverseBits(input4);
        System.out.println("Test case for all ones: " + (actual4 == expected4 ? "PASSED" : "FAILED"));
        if (actual4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + actual4);
        }
        
        // Test case 5: Alternating bits
        int input5 = 0b10101010101010101010101010101010; // -1431655766 in decimal
        int expected5 = 0b01010101010101010101010101010101; // 1431655765 in decimal
        int actual5 = solution.reverseBits(input5);
        System.out.println("Test case for alternating bits: " + (actual5 == expected5 ? "PASSED" : "FAILED"));
        if (actual5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + actual5);
            System.out.println("  Expected (binary): " + Integer.toBinaryString(expected5));
            System.out.println("  Actual (binary): " + Integer.toBinaryString(actual5));
        }
    }
}
