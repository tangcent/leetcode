package com.itangcent.leetcode_102_binary_tree_level_order_traversal;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Test class for the solution to LeetCode problem #102: binary-tree-level-order-traversal
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #102: binary-tree-level-order-traversal");
        
        // Test case 1: Empty tree
        TreeNode emptyTree = null;
        List<List<Integer>> result1 = solution.levelOrder(emptyTree);
        System.out.println("Test case 1 - Empty tree:");
        System.out.println("Expected: [], Actual: " + result1);
        
        // Test case 2: Single node tree
        TreeNode singleNode = new TreeNode(1);
        List<List<Integer>> result2 = solution.levelOrder(singleNode);
        System.out.println("\nTest case 2 - Single node tree:");
        System.out.println("Expected: [[1]], Actual: " + result2);
        
        // Test case 3: Simple binary tree
        //     3
        //    / \
        //   9  20
        //      / \
        //     15  7
        TreeNode tree3 = createTestTree3();
        List<List<Integer>> result3 = solution.levelOrder(tree3);
        System.out.println("\nTest case 3 - Simple binary tree:");
        System.out.println("Expected: [[3], [9, 20], [15, 7]], Actual: " + result3);
        
        // Test case 4: Complex binary tree
        //       1
        //      / \
        //     2   3
        //    /     \
        //   4       5
        //  /         \
        // 6           7
        TreeNode tree4 = createTestTree4();
        List<List<Integer>> result4 = solution.levelOrder(tree4);
        System.out.println("\nTest case 4 - Complex binary tree:");
        System.out.println("Expected: [[1], [2, 3], [4, 5], [6, 7]], Actual: " + result4);
    }
    
    private static TreeNode createTestTree3() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }
    
    private static TreeNode createTestTree4() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.left.left.left = new TreeNode(6);
        root.right.right.right = new TreeNode(7);
        return root;
    }
}
