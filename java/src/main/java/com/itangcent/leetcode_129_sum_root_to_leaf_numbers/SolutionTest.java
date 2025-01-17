package com.itangcent.leetcode_129_sum_root_to_leaf_numbers;

/**
 * Test class for the solution to LeetCode problem #129: sum-root-to-leaf-numbers
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Simple tree [1,2,3]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        int result1 = solution.sumNumbers(root1);
        System.out.println("Test case for [1,2,3]: " + (result1 == 25 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 25, Actual: " + result1);

        // Test case 2: Single node tree [1]
        TreeNode root2 = new TreeNode(1);
        int result2 = solution.sumNumbers(root2);
        System.out.println("Test case for [1]: " + (result2 == 1 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 1, Actual: " + result2);

        // Test case 3: Multi-level tree [4,9,0,5,1]
        TreeNode root3 = new TreeNode(4);
        root3.left = new TreeNode(9);
        root3.right = new TreeNode(0);
        root3.left.left = new TreeNode(5);
        root3.left.right = new TreeNode(1);
        int result3 = solution.sumNumbers(root3);
        System.out.println("Test case for [4,9,0,5,1]: " + (result3 == 1026 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 1026, Actual: " + result3);

        // Test case 4: Empty tree
        TreeNode root4 = null;
        int result4 = solution.sumNumbers(root4);
        System.out.println("Test case for empty tree: " + (result4 == 0 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 0, Actual: " + result4);
    }
}
