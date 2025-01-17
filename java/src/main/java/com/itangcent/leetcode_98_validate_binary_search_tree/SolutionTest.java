package com.itangcent.leetcode_98_validate_binary_search_tree;

/**
 * Test class for the solution to LeetCode problem #98: validate-binary-search-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #98: validate-binary-search-tree");
        
        // Test Case 1: Valid BST
        //     2
        //    / \
        //   1   3
        TreeNode root1 = new TreeNode(2);
        root1.left = new TreeNode(1);
        root1.right = new TreeNode(3);
        System.out.println("Test Case 1 - Valid BST: " + solution.isValidBST(root1));
        
        // Test Case 2: Invalid BST
        //     5
        //    / \
        //   1   4
        //      / \
        //     3   6
        TreeNode root2 = new TreeNode(5);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(3);
        root2.right.right = new TreeNode(6);
        System.out.println("Test Case 2 - Invalid BST: " + solution.isValidBST(root2));
        
        // Test Case 3: Empty Tree
        System.out.println("Test Case 3 - Empty Tree: " + solution.isValidBST(null));
        
        // Test Case 4: Single Node
        TreeNode root4 = new TreeNode(1);
        System.out.println("Test Case 4 - Single Node: " + solution.isValidBST(root4));
        
        // Test Case 5: Invalid BST with equal values
        //     2
        //    / \
        //   2   2
        TreeNode root5 = new TreeNode(2);
        root5.left = new TreeNode(2);
        root5.right = new TreeNode(2);
        System.out.println("Test Case 5 - Invalid BST with equal values: " + solution.isValidBST(root5));

        // Test Case 6: Invalid BST with value 3 in right subtree less than root
        //     5
        //    / \
        //   4   6
        //      / \
        //     3   7
        TreeNode root6 = new TreeNode(5);
        root6.left = new TreeNode(4);
        root6.right = new TreeNode(6);
        root6.right.left = new TreeNode(3);
        root6.right.right = new TreeNode(7);
        System.out.println("Test Case 6 - Invalid BST with value 3 in right subtree: " + solution.isValidBST(root6));
    }
}
