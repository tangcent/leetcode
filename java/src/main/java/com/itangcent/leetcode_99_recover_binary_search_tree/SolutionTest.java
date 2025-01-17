package com.itangcent.leetcode_99_recover_binary_search_tree;

/**
 * Test class for the solution to LeetCode problem #99: recover-binary-search-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #99: recover-binary-search-tree");
        
        // Test Case 1: [1,3,null,null,2]
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(3);
        root1.left.right = new TreeNode(2);
        System.out.println("\nTest Case 1: [1,3,null,null,2]");
        System.out.println("Before recovery:");
        printTree(root1);
        System.out.println("Swapped nodes: 1 and 2");
        solution.recoverTree(root1);
        System.out.println("After recovery:");
        printTree(root1);
        System.out.println("Test Case 1: " + (isValidBST(root1) ? "PASSED" : "FAILED"));
        
        // Test Case 2: [3,1,4,null,null,2]
        TreeNode root2 = new TreeNode(3);
        root2.left = new TreeNode(1);
        root2.right = new TreeNode(4);
        root2.right.left = new TreeNode(2);
        System.out.println("\nTest Case 2: [3,1,4,null,null,2]");
        System.out.println("Before recovery:");
        printTree(root2);
        System.out.println("Swapped nodes: 2 and 4");
        solution.recoverTree(root2);
        System.out.println("After recovery:");
        printTree(root2);
        System.out.println("Test Case 2: " + (isValidBST(root2) ? "PASSED" : "FAILED"));
    }
    
    private static void printTree(TreeNode root) {
        if (root == null) {
            System.out.print("null ");
            return;
        }
        System.out.print(root.val + " ");
        printTree(root.left);
        printTree(root.right);
    }
    
    private static boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private static boolean isValidBSTHelper(TreeNode root, int min, int max) {
        if (root == null) return true;
        
        if (root.val <= min || root.val >= max) return false;
        
        return isValidBSTHelper(root.left, min, root.val) && 
               isValidBSTHelper(root.right, root.val, max);
    }
}
