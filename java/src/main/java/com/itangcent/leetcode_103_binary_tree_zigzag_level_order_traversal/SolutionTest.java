package com.itangcent.leetcode_103_binary_tree_zigzag_level_order_traversal;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

/**
 * Test class for the solution to LeetCode problem #103: binary-tree-zigzag-level-order-traversal
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Empty tree
        System.out.println("Test case 1: Empty tree");
        TreeNode emptyTree = null;
        List<List<Integer>> result1 = solution.zigzagLevelOrder(emptyTree);
        System.out.println("Expected: [], Actual: " + result1);

        // Test case 2: Single node tree
        System.out.println("\nTest case 2: Single node tree");
        TreeNode singleNode = new TreeNode(1);
        List<List<Integer>> result2 = solution.zigzagLevelOrder(singleNode);
        System.out.println("Expected: [[1]], Actual: " + result2);

        // Test case 3: Simple tree with two levels
        System.out.println("\nTest case 3: Simple tree with two levels");
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(2);
        root3.right = new TreeNode(3);
        List<List<Integer>> result3 = solution.zigzagLevelOrder(root3);
        System.out.println("Expected: [[1], [3, 2]], Actual: " + result3);

        // Test case 4: Complex tree with multiple levels
        System.out.println("\nTest case 4: Complex tree with multiple levels");
        TreeNode root4 = new TreeNode(3);
        root4.left = new TreeNode(9);
        root4.right = new TreeNode(20);
        root4.right.left = new TreeNode(15);
        root4.right.right = new TreeNode(7);
        List<List<Integer>> result4 = solution.zigzagLevelOrder(root4);
        System.out.println("Expected: [[3], [20, 9], [15, 7]], Actual: " + result4);

        // Test case 5: Unbalanced tree
        System.out.println("\nTest case 5: Unbalanced tree");
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.left.left = new TreeNode(3);
        root5.left.left.left = new TreeNode(4);
        List<List<Integer>> result5 = solution.zigzagLevelOrder(root5);
        System.out.println("Expected: [[1], [2], [3], [4]], Actual: " + result5);

        // Test case 6: Tree [1,2,3,4,null,null,5]
        System.out.println("\nTest case 6: Tree [1,2,3,4,null,null,5]");
        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.right = new TreeNode(3);
        root6.left.left = new TreeNode(4);
        root6.right.right = new TreeNode(5);
        List<List<Integer>> result6 = solution.zigzagLevelOrder(root6);
        System.out.println("Expected: [[1], [3, 2], [4, 5]], Actual: " + result6);
    }
}
