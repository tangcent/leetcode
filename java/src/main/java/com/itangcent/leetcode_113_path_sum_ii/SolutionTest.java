package com.itangcent.leetcode_113_path_sum_ii;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Test class for the solution to LeetCode problem #113: path-sum-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Simple tree with one valid path
        TreeNode root1 = createTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});
        List<List<Integer>> result1 = solution.pathSum(root1, 22);
        System.out.println("Test case 1:");
        System.out.println("Expected: [[5,4,11,2], [5,8,4,5]]");
        System.out.println("Actual: " + result1);
        
        // Test case 2: Empty tree
        TreeNode root2 = null;
        List<List<Integer>> result2 = solution.pathSum(root2, 0);
        System.out.println("\nTest case 2:");
        System.out.println("Expected: []");
        System.out.println("Actual: " + result2);
        
        // Test case 3: Single node tree
        TreeNode root3 = new TreeNode(1);
        List<List<Integer>> result3 = solution.pathSum(root3, 1);
        System.out.println("\nTest case 3:");
        System.out.println("Expected: [[1]]");
        System.out.println("Actual: " + result3);
        
        // Test case 4: Tree with no valid paths
        TreeNode root4 = createTree(new Integer[]{1, 2, 3});
        List<List<Integer>> result4 = solution.pathSum(root4, 5);
        System.out.println("\nTest case 4:");
        System.out.println("Expected: []");
        System.out.println("Actual: " + result4);
    }
    
    private static TreeNode createTree(Integer[] values) {
        if (values == null || values.length == 0) return null;
        
        TreeNode root = new TreeNode(values[0]);
        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        
        for (int i = 1; i < values.length; i += 2) {
            TreeNode current = queue.remove(0);
            
            if (i < values.length && values[i] != null) {
                current.left = new TreeNode(values[i]);
                queue.add(current.left);
            }
            
            if (i + 1 < values.length && values[i + 1] != null) {
                current.right = new TreeNode(values[i + 1]);
                queue.add(current.right);
            }
        }
        
        return root;
    }
}
