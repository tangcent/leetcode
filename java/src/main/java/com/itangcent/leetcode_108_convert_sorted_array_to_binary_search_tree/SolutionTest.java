package com.itangcent.leetcode_108_convert_sorted_array_to_binary_search_tree;

/**
 * Test class for the solution to LeetCode problem #108: convert-sorted-array-to-binary-search-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #108: convert-sorted-array-to-binary-search-tree");
        
        // Test case 1: Empty array
        System.out.println("\nTest case 1: Empty array");
        TreeNode result1 = solution.sortedArrayToBST(new int[]{});
        System.out.println("Expected: null, Actual: " + (result1 == null ? "null" : result1.val));
        
        // Test case 2: Single element array
        System.out.println("\nTest case 2: Single element array");
        TreeNode result2 = solution.sortedArrayToBST(new int[]{1});
        System.out.println("Expected: 1, Actual: " + (result2 == null ? "null" : result2.val));
        
        // Test case 3: Multiple elements array
        System.out.println("\nTest case 3: Multiple elements array [1,2,3]");
        TreeNode result3 = solution.sortedArrayToBST(new int[]{1,2,3});
        printTree(result3);
        
        // Test case 4: Larger array
        System.out.println("\nTest case 4: Larger array [-10,-3,0,5,9]");
        TreeNode result4 = solution.sortedArrayToBST(new int[]{-10,-3,0,5,9});
        printTree(result4);
    }
    
    private static void printTree(TreeNode root) {
        if (root == null) {
            System.out.println("null");
            return;
        }
        System.out.println("Root: " + root.val);
        System.out.print("Left: ");
        printTree(root.left);
        System.out.print("Right: ");
        printTree(root.right);
    }
}
