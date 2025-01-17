package com.itangcent.leetcode_44_wildcard_matching;

public class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1
        boolean result1 = solution.isMatch("aa", "a*");
        System.out.println("Test case 1: " + result1); // Expected: true

        // Test case 2
        boolean result2 = solution.isMatch("aa", "a");
        System.out.println("Test case 2: " + result2); // Expected: false

        // Test case 3
        boolean result3 = solution.isMatch("cb", "?b");
        System.out.println("Test case 3: " + result3); // Expected: true

        // Test case 4
        boolean result4 = solution.isMatch("cb", "?a");
        System.out.println("Test case 4: " + result4); // Expected: false

        // Test case 5
        boolean result5 = solution.isMatch("adceb", "*a*b");
        System.out.println("Test case 5: " + result5); // Expected: true

        // Test case 6
        boolean result6 = solution.isMatch("acdcb", "a*c?b");
        System.out.println("Test case 6: " + result6); // Expected: false

        // Test case 7
        boolean result7 = solution.isMatch("aa", "*");
        System.out.println("Test case 7: " + result7); // Expected: true

        // Test case 8
        boolean result8 = solution.isMatch("abcdefg", "*******");
        System.out.println("Test case 8: " + result8); // Expected: true

        // Test case 9
        boolean result9 = solution.isMatch("", "*******");
        System.out.println("Test case 9: " + result9); // Expected: true
    }
} 