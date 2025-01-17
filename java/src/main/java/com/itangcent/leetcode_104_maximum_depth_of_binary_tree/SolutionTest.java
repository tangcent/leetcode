package com.itangcent.leetcode_104_maximum_depth_of_binary_tree;

/**
 * Test class for the solution to LeetCode problem #104: maximum-depth-of-binary-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Empty tree
        TreeNode root1 = null;
        System.out.println("Test case 1 - Empty tree:");
        System.out.println("Expected: 0, Actual: " + solution.maxDepth(root1));
        
        // Test case 2: Single node
        TreeNode root2 = new TreeNode(1);
        System.out.println("\nTest case 2 - Single node:");
        System.out.println("Expected: 1, Actual: " + solution.maxDepth(root2));
        
        // Test case 3: Balanced tree with depth 3
        TreeNode root3 = new TreeNode(3);
        root3.left = new TreeNode(9);
        root3.right = new TreeNode(20);
        root3.right.left = new TreeNode(15);
        root3.right.right = new TreeNode(7);
        System.out.println("\nTest case 3 - Balanced tree:");
        System.out.println("Expected: 3, Actual: " + solution.maxDepth(root3));
        
        // Test case 4: Unbalanced tree (left heavy)
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.left.left.left = new TreeNode(4);
        System.out.println("\nTest case 4 - Left heavy unbalanced tree:");
        System.out.println("Expected: 4, Actual: " + solution.maxDepth(root4));
        
        // Test case 5: Unbalanced tree (right heavy)
        TreeNode root5 = new TreeNode(1);
        root5.right = new TreeNode(2);
        root5.right.right = new TreeNode(3);
        root5.right.right.right = new TreeNode(4);
        System.out.println("\nTest case 5 - Right heavy unbalanced tree:");
        System.out.println("Expected: 4, Actual: " + solution.maxDepth(root5));
    }
}
