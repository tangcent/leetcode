package com.itangcent.leetcode_111_minimum_depth_of_binary_tree;

/**
 * Test class for the solution to LeetCode problem #111: minimum-depth-of-binary-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #111: minimum-depth-of-binary-tree");

        // Test case 1: Empty tree
        TreeNode root1 = null;
        System.out.println("Test case 1 - Empty tree:");
        System.out.println("Expected: 0, Actual: " + solution.minDepth(root1));

        // Test case 2: Single node tree
        TreeNode root2 = new TreeNode(1);
        System.out.println("Test case 2 - Single node tree:");
        System.out.println("Expected: 1, Actual: " + solution.minDepth(root2));

        // Test case 3: Perfect binary tree
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        root3.left.left = new TreeNode(4);
        root3.left.right = new TreeNode(5);
        root3.right.left = new TreeNode(6);
        root3.right.right = new TreeNode(7);
        System.out.println("Test case 3 - Perfect binary tree:");
        System.out.println("Expected: 3, Actual: " + solution.minDepth(root3));

        // Test case 4: Unbalanced tree (left heavy)
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.left.left.left = new TreeNode(4);
        root4.right = new TreeNode(5);
        System.out.println("Test case 4 - Left heavy unbalanced tree:");
        System.out.println("Expected: 2, Actual: " + solution.minDepth(root4));

        // Test case 5: Unbalanced tree (right heavy)
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.right.right = new TreeNode(4);
        root5.right.right.right = new TreeNode(5);
        System.out.println("Test case 5 - Right heavy unbalanced tree:");
        System.out.println("Expected: 2, Actual: " + solution.minDepth(root5));

        // Test case 6: Right-skewed tree [2,null,3,null,4,null,5,null,6]
        TreeNode root6 = new TreeNode(2);
        root6.right = new TreeNode(3);
        root6.right.right = new TreeNode(4);
        root6.right.right.right = new TreeNode(5);
        root6.right.right.right.right = new TreeNode(6);
        System.out.println("Test case 6 - Right-skewed tree [2,null,3,null,4,null,5,null,6]:");
        System.out.println("Expected: 5, Actual: " + solution.minDepth(root6));
    }
}
