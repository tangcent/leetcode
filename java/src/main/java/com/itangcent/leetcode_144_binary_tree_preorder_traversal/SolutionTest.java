package com.itangcent.leetcode_144_binary_tree_preorder_traversal;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #144: binary-tree-preorder-traversal
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #144: binary-tree-preorder-traversal");
        
        // Test case 1: Single node tree
        TreeNode test1 = new TreeNode(1);
        testPreorderTraversal(solution, test1, Arrays.asList(1), "Single node tree");
        
        // Test case 2: Example from LeetCode [1,null,2,3]
        TreeNode test2 = new TreeNode(1);
        test2.right = new TreeNode(2);
        test2.right.left = new TreeNode(3);
        testPreorderTraversal(solution, test2, Arrays.asList(1, 2, 3), "LeetCode example [1,null,2,3]");
        
        // Test case 3: Complete binary tree
        TreeNode test3 = new TreeNode(1);
        test3.left = new TreeNode(2);
        test3.right = new TreeNode(3);
        test3.left.left = new TreeNode(4);
        test3.left.right = new TreeNode(5);
        test3.right.left = new TreeNode(6);
        test3.right.right = new TreeNode(7);
        testPreorderTraversal(solution, test3, Arrays.asList(1, 2, 4, 5, 3, 6, 7), "Complete binary tree");
        
        // Test case 4: Left-skewed tree
        TreeNode test4 = new TreeNode(1);
        test4.left = new TreeNode(2);
        test4.left.left = new TreeNode(3);
        test4.left.left.left = new TreeNode(4);
        testPreorderTraversal(solution, test4, Arrays.asList(1, 2, 3, 4), "Left-skewed tree");
        
        // Test case 5: Right-skewed tree
        TreeNode test5 = new TreeNode(1);
        test5.right = new TreeNode(2);
        test5.right.right = new TreeNode(3);
        test5.right.right.right = new TreeNode(4);
        testPreorderTraversal(solution, test5, Arrays.asList(1, 2, 3, 4), "Right-skewed tree");
        
        // Test case 6: Empty tree
        testPreorderTraversal(solution, null, Arrays.asList(), "Empty tree");
    }
    
    private static void testPreorderTraversal(Solution solution, TreeNode root, List<Integer> expected, String testName) {
        try {
            List<Integer> result = solution.preorderTraversal(root);
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
