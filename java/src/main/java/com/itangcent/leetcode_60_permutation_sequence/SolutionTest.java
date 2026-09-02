package com.itangcent.leetcode_60_permutation_sequence;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: n = 3, k = 3
        System.out.println("Test case 1: n = 3, k = 3");
        String result1 = solution.getPermutation(3, 3);
        System.out.println("Result: " + result1);
        System.out.println();

        // Test case 2: n = 4, k = 9
        System.out.println("Test case 2: n = 4, k = 9");
        String result2 = solution.getPermutation(4, 9);
        System.out.println("Result: " + result2);
        System.out.println();

        // Test case 3: n = 3, k = 1
        System.out.println("Test case 3: n = 3, k = 1");
        String result3 = solution.getPermutation(3, 1);
        System.out.println("Result: " + result3);
        System.out.println();

        // Test case 4: n = 3, k = 6 (last permutation)
        System.out.println("Test case 4: n = 3, k = 6");
        String result4 = solution.getPermutation(3, 6);
        System.out.println("Result: " + result4);
        System.out.println();

        // Test case 5: n = 4, k = 1 (first permutation)
        System.out.println("Test case 5: n = 4, k = 1");
        String result5 = solution.getPermutation(4, 1);
        System.out.println("Result: " + result5);
        System.out.println();

        // Test case 6: n = 4, k = 24 (last permutation)
        System.out.println("Test case 6: n = 4, k = 24");
        String result6 = solution.getPermutation(4, 24);
        System.out.println("Result: " + result6);
        System.out.println();

        // Test case 7: n = 2, k = 2 (simple case)
        System.out.println("Test case 7: n = 2, k = 2");
        String result7 = solution.getPermutation(2, 2);
        System.out.println("Result: " + result7);
        System.out.println();

        // Test case 8: n = 5, k = 16 (middle case)
        System.out.println("Test case 8: n = 5, k = 16");
        String result8 = solution.getPermutation(5, 16);
        System.out.println("Result: " + result8);
        System.out.println();
    }
} 