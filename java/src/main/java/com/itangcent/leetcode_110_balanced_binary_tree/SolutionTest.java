package com.itangcent.leetcode_110_balanced_binary_tree;

/**
 * Test class for the solution to LeetCode problem #110: balanced-binary-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #110: balanced-binary-tree");
//
//        // Test case 1: Empty tree
//        TreeNode root1 = null;
//        System.out.println("Test case 1 - Empty tree:");
//        System.out.println("Expected: true, Actual: " + solution.isBalanced(root1));
//
//        // Test case 2: Single node tree
//        TreeNode root2 = new TreeNode(1);
//        System.out.println("Test case 2 - Single node tree:");
//        System.out.println("Expected: true, Actual: " + solution.isBalanced(root2));
//
//        // Test case 3: Balanced tree
//        //     1
//        //    / \
//        //   2   3
//        TreeNode root3 = new TreeNode(1);
//        root3.left = new TreeNode(2);
//        root3.right = new TreeNode(3);
//        System.out.println("Test case 3 - Balanced tree:");
//        System.out.println("Expected: true, Actual: " + solution.isBalanced(root3));
//
//        // Test case 4: Unbalanced tree
//        //     1
//        //    /
//        //   2
//        //  /
//        // 3
//        TreeNode root4 = new TreeNode(1);
//        root4.left = new TreeNode(2);
//        root4.left.left = new TreeNode(3);
//        System.out.println("Test case 4 - Unbalanced tree:");
//        System.out.println("Expected: false, Actual: " + solution.isBalanced(root4));
//
        // Test case 5: Complex balanced tree
        //       1
        //      / \
        //     2   3
        //    / \  /
        //   4   5 8
        //  /     \
        // 6       9
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(3);
        root5.left.left = new TreeNode(4);
        root5.left.right = new TreeNode(5);
        root5.left.left.left = new TreeNode(6);
        root5.right.left = new TreeNode(8);
        root5.left.right.right = new TreeNode(9);
        System.out.println("Test case 5 - Complex balanced tree:");
        System.out.println("Expected: true, Actual: " + solution.isBalanced(root5));
        
        // Test case 6: Complex unbalanced tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        //  /
        // 6
        //  \
        //   7
        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.right = new TreeNode(3);
        root6.left.left = new TreeNode(4);
        root6.left.right = new TreeNode(5);
        root6.left.left.left = new TreeNode(6);
        root6.left.left.left.right = new TreeNode(7);
        System.out.println("Test case 6 - Complex unbalanced tree:");
        System.out.println("Expected: false, Actual: " + solution.isBalanced(root6));
    }
}
