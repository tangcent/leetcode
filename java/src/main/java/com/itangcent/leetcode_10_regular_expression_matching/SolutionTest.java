package com.itangcent.leetcode_10_regular_expression_matching;

public class SolutionTest {

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.isMatch("aa", "a*")); // Expected: true
        System.out.println(solution.isMatch("aa", "a")); // Expected: false
        System.out.println(solution.isMatch("ab", ".*")); // Expected: true
        System.out.println(solution.isMatch("aab", "c*a*b")); // Expected: true
        System.out.println(solution.isMatch("mississippi", "mis*is*p*.")); // Expected: false
        System.out.println(solution.isMatch("a", "ab*")); // Expected: true
        System.out.println(solution.isMatch("aaaaaaaaaaaaaaaaaaab", "a*a*a*a*a*a*a*a*a*a*")); // Expected: false
    }
} 