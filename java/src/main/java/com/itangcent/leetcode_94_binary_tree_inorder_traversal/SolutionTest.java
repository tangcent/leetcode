package com.itangcent.leetcode_94_binary_tree_inorder_traversal;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #94: binary-tree-inorder-traversal
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #94: binary-tree-inorder-traversal");
        
        // Test case 1: Empty tree
        TreeNode emptyTree = null;
        List<Integer> result1 = solution.inorderTraversal(emptyTree);
        System.out.println("Test case 1 - Empty tree:");
        System.out.println("Expected: [], Actual: " + result1);
        
        // Test case 2: Single node tree
        TreeNode singleNode = new TreeNode(1);
        List<Integer> result2 = solution.inorderTraversal(singleNode);
        System.out.println("\nTest case 2 - Single node tree:");
        System.out.println("Expected: [1], Actual: " + result2);
        
        // Test case 3: Complex tree
        //     1
        //    / \
        //   2   3
        TreeNode complexTree = new TreeNode(1);
        complexTree.left = new TreeNode(2);
        complexTree.right = new TreeNode(3);
        List<Integer> result3 = solution.inorderTraversal(complexTree);
        System.out.println("\nTest case 3 - Complex tree:");
        System.out.println("Expected: [2, 1, 3], Actual: " + result3);
        
        // Test case 4: More complex tree
        //     1
        //    / \
        //   2   3
        //  /     \
        // 4       5
        TreeNode moreComplexTree = new TreeNode(1);
        moreComplexTree.left = new TreeNode(2);
        moreComplexTree.right = new TreeNode(3);
        moreComplexTree.left.left = new TreeNode(4);
        moreComplexTree.right.right = new TreeNode(5);
        List<Integer> result4 = solution.inorderTraversal(moreComplexTree);
        System.out.println("\nTest case 4 - More complex tree:");
        System.out.println("Expected: [4, 2, 1, 3, 5], Actual: " + result4);
    }
}
