package com.itangcent.leetcode_38_count_and_say;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: n = 1
        int n1 = 1;
        String result1 = solution.countAndSay(n1);
        System.out.println("Test case 1: " + result1); // Expected: "1"

        // Test case 2: n = 4
        int n2 = 4;
        String result2 = solution.countAndSay(n2);
        System.out.println("Test case 2: " + result2); // Expected: "1211"

        // Test case 3: n = 5
        int n3 = 5;
        String result3 = solution.countAndSay(n3);
        System.out.println("Test case 3: " + result3); // Expected: "111221"

        // Test case 4: n = 30
        int n4 = 30;
        String result4 = solution.countAndSay(n4);
        System.out.println("Test case 4: " + result4); // Expected: "..." (too long to display)
    }
} 