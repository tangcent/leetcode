package com.itangcent.leetcode_85_maximal_rectangle;

public class SolutionTest {
    private static final Solution solution = new Solution();

    public static void main(String[] args) {
        // Test case 1: Example from LeetCode
        test("Example 1", new char[][]{
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        }, 6);

        // Test case 2: Empty matrix
        test("Empty Matrix", new char[][]{}, 0);

        // Test case 3: Matrix with single row
        test("Single Row", new char[][]{
            {'1','1','1','1'}
        }, 4);

        // Test case 4: Matrix with single column
        test("Single Column", new char[][]{
            {'1'},
            {'1'},
            {'1'}
        }, 3);

        // Test case 5: Matrix with all zeros
        test("All Zeros", new char[][]{
            {'0','0','0'},
            {'0','0','0'},
            {'0','0','0'}
        }, 0);

        // Test case 6: Matrix with all ones
        test("All Ones", new char[][]{
            {'1','1','1'},
            {'1','1','1'},
            {'1','1','1'}
        }, 9);

        // Test case 7: Additional test case
        test("Additional Example", new char[][]{
            {'1','0','1','1','1'},
            {'0','1','0','1','0'},
            {'1','1','0','1','1'},
            {'1','1','0','1','1'},
            {'0','1','1','1','1'}
        }, 6);
    }

    private static void test(String testName, char[][] matrix, int expected) {
        int result = solution.maximalRectangle(matrix);
        boolean passed = result == expected;
        System.out.printf("%s: %s%n", testName, passed ? "PASSED" : "FAILED");
        if (!passed) {
            System.out.printf("Expected: %d, Got: %d%n", expected, result);
        }
    }
} 