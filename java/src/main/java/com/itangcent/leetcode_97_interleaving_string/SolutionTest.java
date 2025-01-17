package com.itangcent.leetcode_97_interleaving_string;

/**
 * Test class for the solution to LeetCode problem #97: interleaving-string
 */
public class SolutionTest {
    public static void main(String[] args) {
        // Test case 1: Basic interleaving
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        System.out.println("Test case 1:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("Expected: true");
        System.out.println("Actual: " + new Solution().isInterleave(s1, s2, s3));
        System.out.println();

        // Test case 2: Invalid interleaving
        s1 = "aabcc";
        s2 = "dbbca";
        s3 = "aadbbbaccc";
        System.out.println("Test case 2:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("Expected: false");
        System.out.println("Actual: " + new Solution().isInterleave(s1, s2, s3));
        System.out.println();

        // Test case 3: Empty strings
        s1 = "";
        s2 = "";
        s3 = "";
        System.out.println("Test case 3:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("Expected: true");
        System.out.println("Actual: " + new Solution().isInterleave(s1, s2, s3));
        System.out.println();

        // Test case 4: One empty string
        s1 = "a";
        s2 = "";
        s3 = "a";
        System.out.println("Test case 4:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("Expected: true");
        System.out.println("Actual: " + new Solution().isInterleave(s1, s2, s3));
        System.out.println();

        // Test case 5: Different lengths
        s1 = "a";
        s2 = "b";
        s3 = "abc";
        System.out.println("Test case 5:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("Expected: false");
        System.out.println("Actual: " + new Solution().isInterleave(s1, s2, s3));
        System.out.println();

        // Test case 6: Large input strings
        s1 = "abababababababababababababababababababababababababababababababababababababababababababababababababbb";
        s2 = "babababababababababababababababababababababababababababababababababababababababababababababababaaaba";
        s3 = "abababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababababbb";
        System.out.println("Test case 6:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s3: " + s3);
        System.out.println("Expected: false");
        System.out.println("Actual: " + new Solution().isInterleave(s1, s2, s3));
    }
}
