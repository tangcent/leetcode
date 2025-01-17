package com.itangcent.leetcode_107_binary_tree_level_order_traversal_ii;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Test class for the solution to LeetCode problem #107: binary-tree-level-order-traversal-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #107: binary-tree-level-order-traversal-ii");
        
        // Test case 1: Empty tree
        TreeNode emptyTree = null;
        System.out.println("\nTest case 1: Empty tree");
        System.out.println("Expected: [], Actual: " + solution.levelOrderBottom(emptyTree));
        
        // Test case 2: Single node tree
        TreeNode singleNode = new TreeNode(1);
        System.out.println("\nTest case 2: Single node tree");
        System.out.println("Expected: [[1]], Actual: " + solution.levelOrderBottom(singleNode));
        
        // Test case 3: Simple tree with two levels
        TreeNode simpleTree = new TreeNode(3);
        simpleTree.left = new TreeNode(9);
        simpleTree.right = new TreeNode(20);
        System.out.println("\nTest case 3: Simple tree with two levels");
        System.out.println("Expected: [[9,20],[3]], Actual: " + solution.levelOrderBottom(simpleTree));
        
        // Test case 4: Complex tree with three levels
        TreeNode complexTree = new TreeNode(3);
        complexTree.left = new TreeNode(9);
        complexTree.right = new TreeNode(20);
        complexTree.right.left = new TreeNode(15);
        complexTree.right.right = new TreeNode(7);
        System.out.println("\nTest case 4: Complex tree with three levels");
        System.out.println("Expected: [[15,7],[9,20],[3]], Actual: " + solution.levelOrderBottom(complexTree));
        
        // Test case 5: Unbalanced tree
        TreeNode unbalancedTree = new TreeNode(1);
        unbalancedTree.left = new TreeNode(2);
        unbalancedTree.left.left = new TreeNode(3);
        System.out.println("\nTest case 5: Unbalanced tree");
        System.out.println("Expected: [[3],[2],[1]], Actual: " + solution.levelOrderBottom(unbalancedTree));
    }
    
    // Helper method to create a tree from array representation
    private static TreeNode createTree(Integer[] arr) {
        if (arr == null || arr.length == 0) return null;
        TreeNode root = new TreeNode(arr[0]);
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        
        for (int i = 1; i < arr.length; i += 2) {
            TreeNode parent = queue.remove(0);
            if (i < arr.length && arr[i] != null) {
                parent.left = new TreeNode(arr[i]);
                queue.add(parent.left);
            }
            if (i + 1 < arr.length && arr[i + 1] != null) {
                parent.right = new TreeNode(arr[i + 1]);
                queue.add(parent.right);
            }
        }
        return root;
    }
}
