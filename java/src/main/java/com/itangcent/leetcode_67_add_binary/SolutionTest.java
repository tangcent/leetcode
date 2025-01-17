package com.itangcent.leetcode_67_add_binary;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Simple case
        System.out.println("Test case 1: a = \"11\", b = \"1\"");
        System.out.println("Expected: \"100\"");
        System.out.println("Actual: " + solution.addBinary("11", "1"));
        System.out.println();

        // Test case 2: Equal length strings
        System.out.println("Test case 2: a = \"1010\", b = \"1011\"");
        System.out.println("Expected: \"10101\"");
        System.out.println("Actual: " + solution.addBinary("1010", "1011"));
        System.out.println();

        // Test case 3: Different length strings
        System.out.println("Test case 3: a = \"1111\", b = \"1\"");
        System.out.println("Expected: \"10000\"");
        System.out.println("Actual: " + solution.addBinary("1111", "1"));
        System.out.println();

        // Test case 4: One empty string
        System.out.println("Test case 4: a = \"\", b = \"1\"");
        System.out.println("Expected: \"1\"");
        System.out.println("Actual: " + solution.addBinary("", "1"));
        System.out.println();
    }
} 