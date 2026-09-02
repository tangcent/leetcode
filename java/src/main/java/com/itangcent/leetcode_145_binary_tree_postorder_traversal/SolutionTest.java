package com.itangcent.leetcode_145_binary_tree_postorder_traversal;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #145: binary-tree-postorder-traversal
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #145: binary-tree-postorder-traversal");
        
        // Test case 1: Empty tree
        TreeNode emptyTree = null;
        testPostorderTraversal(solution, emptyTree, Arrays.asList(), "Empty tree");
        
        // Test case 2: Single node tree
        TreeNode singleNode = new TreeNode(1);
        testPostorderTraversal(solution, singleNode, Arrays.asList(1), "Single node tree");
        
        // Test case 3: Example from LeetCode [1,null,2,3] (tree with right child having left child)
        TreeNode example = new TreeNode(1);
        example.right = new TreeNode(2);
        example.right.left = new TreeNode(3);
        testPostorderTraversal(solution, example, Arrays.asList(3, 2, 1), "LeetCode example [1,null,2,3]");
        
        // Test case 4: Balanced binary tree
        //     1
        //    / \
        //   2   3
        TreeNode balancedTree = new TreeNode(1);
        balancedTree.left = new TreeNode(2);
        balancedTree.right = new TreeNode(3);
        testPostorderTraversal(solution, balancedTree, Arrays.asList(2, 3, 1), "Balanced binary tree");
        
        // Test case 5: Complete binary tree
        //      1
        //     / \
        //    2   3
        //   / \ / \
        //  4  5 6  7
        TreeNode completeTree = new TreeNode(1);
        completeTree.left = new TreeNode(2);
        completeTree.right = new TreeNode(3);
        completeTree.left.left = new TreeNode(4);
        completeTree.left.right = new TreeNode(5);
        completeTree.right.left = new TreeNode(6);
        completeTree.right.right = new TreeNode(7);
        testPostorderTraversal(solution, completeTree, Arrays.asList(4, 5, 2, 6, 7, 3, 1), "Complete binary tree");
        
        // Test case 6: Left-skewed tree
        //   1
        //  /
        // 2
        // /
        //3
        TreeNode leftSkewed = new TreeNode(1);
        leftSkewed.left = new TreeNode(2);
        leftSkewed.left.left = new TreeNode(3);
        testPostorderTraversal(solution, leftSkewed, Arrays.asList(3, 2, 1), "Left-skewed tree");
        
        // Test case 7: Right-skewed tree
        // 1
        //  \
        //   2
        //    \
        //     3
        TreeNode rightSkewed = new TreeNode(1);
        rightSkewed.right = new TreeNode(2);
        rightSkewed.right.right = new TreeNode(3);
        testPostorderTraversal(solution, rightSkewed, Arrays.asList(3, 2, 1), "Right-skewed tree");
    }
    
    private static void testPostorderTraversal(Solution solution, TreeNode root, List<Integer> expected, String testName) {
        try {
            List<Integer> result = solution.postorderTraversal(root);
            boolean passed = result.equals(expected);
            System.out.println("Test case for " + testName + ": " + (passed ? "PASSED" : "FAILED"));
            
            if (!passed) {
                System.out.println("  Expected: " + expected);
                System.out.println("  Actual: " + result);
            }
        } catch (Exception e) {
            System.out.println("Test case for " + testName + ": FAILED (Exception occurred)");
            System.out.println("  Exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
