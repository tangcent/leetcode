package com.itangcent.leetcode_101_symmetric_tree;

/**
 * Test class for the solution to LeetCode problem #101: symmetric-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #101: symmetric-tree");
        
        // Test case 1: Empty tree (should be symmetric)
        TreeNode root1 = null;
        System.out.println("Test case 1 - Empty tree:");
        System.out.println("Expected: true, Actual: " + solution.isSymmetric(root1));
        
        // Test case 2: Single node tree (should be symmetric)
        TreeNode root2 = new TreeNode(1);
        System.out.println("\nTest case 2 - Single node:");
        System.out.println("Expected: true, Actual: " + solution.isSymmetric(root2));
        
        // Test case 3: Symmetric tree
        //     1
        //    / \
        //   2   2
        //  / \ / \
        // 3  4 4  3
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(2);
        root3.left.left = new TreeNode(3);
        root3.left.right = new TreeNode(4);
        root3.right.left = new TreeNode(4);
        root3.right.right = new TreeNode(3);
        System.out.println("\nTest case 3 - Symmetric tree:");
        System.out.println("Expected: true, Actual: " + solution.isSymmetric(root3));
        
        // Test case 4: Non-symmetric tree
        //     1
        //    / \
        //   2   2
        //    \   \
        //    3    3
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.right = new TreeNode(2);
        root4.left.right = new TreeNode(3);
        root4.right.right = new TreeNode(3);
        System.out.println("\nTest case 4 - Non-symmetric tree:");
        System.out.println("Expected: false, Actual: " + solution.isSymmetric(root4));
        
        // Test case 5: Non-symmetric tree with different values
        //     1
        //    / \
        //   2   2
        //  / \ / \
        // 3  4 4  5
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(2);
        root5.left.left = new TreeNode(3);
        root5.left.right = new TreeNode(4);
        root5.right.left = new TreeNode(4);
        root5.right.right = new TreeNode(5);
        System.out.println("\nTest case 5 - Non-symmetric tree with different values:");
        System.out.println("Expected: false, Actual: " + solution.isSymmetric(root5));
    }
}
