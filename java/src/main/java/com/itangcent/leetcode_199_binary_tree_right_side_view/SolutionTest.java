package com.itangcent.leetcode_199_binary_tree_right_side_view;

import java.util.Arrays;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #199: binary-tree-right-side-view
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #199: binary-tree-right-side-view");
        
        // Test case 1: Example from LeetCode
        // [1,2,3,null,5,null,4] -> [1,3,4]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right.right = new TreeNode(4);
        testRightSideView(solution, root1, Arrays.asList(1, 3, 4), "Example with depth 3");
        
        // Test case 2: Single node
        // [1] -> [1]
        TreeNode root2 = new TreeNode(1);
        testRightSideView(solution, root2, Arrays.asList(1), "Single node tree");
        
        // Test case 3: Empty tree
        // [] -> []
        testRightSideView(solution, null, Arrays.asList(), "Empty tree");
        
        // Test case 4: Left-skewed tree
        // [1,2,null,3,null,4,null] -> [1,2,3,4]
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.left.left.left = new TreeNode(4);
        testRightSideView(solution, root4, Arrays.asList(1, 2, 3, 4), "Left-skewed tree");
        
        // Test case 5: Right-skewed tree
        // [1,null,2,null,3,null,4] -> [1,2,3,4]
        TreeNode root5 = new TreeNode(1);
        root5.right = new TreeNode(2);
        root5.right.right = new TreeNode(3);
        root5.right.right.right = new TreeNode(4);
        testRightSideView(solution, root5, Arrays.asList(1, 2, 3, 4), "Right-skewed tree");
        
        // Test case 6: Complete binary tree
        // [1,2,3,4,5,6,7] -> [1,3,7]
        TreeNode root6 = new TreeNode(1);
        root6.left = new TreeNode(2);
        root6.right = new TreeNode(3);
        root6.left.left = new TreeNode(4);
        root6.left.right = new TreeNode(5);
        root6.right.left = new TreeNode(6);
        root6.right.right = new TreeNode(7);
        testRightSideView(solution, root6, Arrays.asList(1, 3, 7), "Complete binary tree");
        
        // Test case 7: Tree with nodes visible from right despite not being rightmost
        // [1,2,3,null,4,null,null,5] -> [1,3,4,5]
        TreeNode root7 = new TreeNode(1);
        root7.left = new TreeNode(2);
        root7.right = new TreeNode(3);
        root7.left.right = new TreeNode(4);
        root7.left.right.left = new TreeNode(5);
        testRightSideView(solution, root7, Arrays.asList(1, 3, 4, 5), "Tree with deep left subtree");
    }
    
    private static void testRightSideView(Solution solution, TreeNode root, List<Integer> expected, String caseName) {
        List<Integer> result = solution.rightSideView(root);
        boolean isCorrect = result.equals(expected);
        
        System.out.println("Test case for " + caseName + ": " + (isCorrect ? "PASSED" : "FAILED"));
        
        if (!isCorrect) {
            System.out.println("  Expected: " + expected);
            System.out.println("  Actual: " + result);
        }
    }
}
