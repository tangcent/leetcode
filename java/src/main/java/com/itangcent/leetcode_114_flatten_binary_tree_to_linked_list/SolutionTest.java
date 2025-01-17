package com.itangcent.leetcode_114_flatten_binary_tree_to_linked_list;

/**
 * Test class for the solution to LeetCode problem #114: flatten-binary-tree-to-linked-list
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #114: flatten-binary-tree-to-linked-list");
        
        // Test case 1: Empty tree
        TreeNode emptyTree = null;
        solution.flatten(emptyTree);
        System.out.println("Test case 1 (Empty tree): " + (verifyFlattened(emptyTree, 0) ? "Passed" : "Failed"));
        
        // Test case 2: Single node tree
        TreeNode singleNode = new TreeNode(1);
        solution.flatten(singleNode);
        System.out.println("Test case 2 (Single node): " + (verifyFlattened(singleNode, 1) ? "Passed" : "Failed"));
        
        // Test case 3: Simple tree with left and right children
        TreeNode simpleTree = new TreeNode(1);
        simpleTree.left = new TreeNode(2);
        simpleTree.right = new TreeNode(5);
        simpleTree.left.left = new TreeNode(3);
        simpleTree.left.right = new TreeNode(4);
        simpleTree.right.right = new TreeNode(6);
        solution.flatten(simpleTree);
        System.out.println("Test case 3 (Simple tree): " + (verifyFlattened(simpleTree, 6) ? "Passed" : "Failed"));
        
        // Test case 4: Complex tree with multiple levels
        TreeNode complexTree = new TreeNode(1);
        complexTree.left = new TreeNode(2);
        complexTree.right = new TreeNode(5);
        complexTree.left.left = new TreeNode(3);
        complexTree.left.right = new TreeNode(4);
        complexTree.right.left = new TreeNode(6);
        complexTree.right.right = new TreeNode(7);
        complexTree.left.left.left = new TreeNode(8);
        complexTree.left.left.right = new TreeNode(9);
        solution.flatten(complexTree);
        System.out.println("Test case 4 (Complex tree): " + (verifyFlattened(complexTree, 9) ? "Passed" : "Failed"));
        
        // Test case 5: Tree with only left children
        TreeNode leftOnlyTree = new TreeNode(1);
        leftOnlyTree.left = new TreeNode(2);
        leftOnlyTree.left.left = new TreeNode(3);
        leftOnlyTree.left.left.left = new TreeNode(4);
        solution.flatten(leftOnlyTree);
        System.out.println("Test case 5 (Left-only tree): " + (verifyFlattened(leftOnlyTree, 4) ? "Passed" : "Failed"));
        
        // Test case 6: Tree with only right children
        TreeNode rightOnlyTree = new TreeNode(1);
        rightOnlyTree.right = new TreeNode(2);
        rightOnlyTree.right.right = new TreeNode(3);
        rightOnlyTree.right.right.right = new TreeNode(4);
        solution.flatten(rightOnlyTree);
        System.out.println("Test case 6 (Right-only tree): " + (verifyFlattened(rightOnlyTree, 4) ? "Passed" : "Failed"));
        
        System.out.println("All test cases completed!");
    }
    
    // Helper method to verify the flattened tree structure
    private static boolean verifyFlattened(TreeNode root, int expectedDepth) {
        if (root == null) return expectedDepth == 0;
        
        // Check that all left pointers are null
        TreeNode current = root;
        int actualDepth = 0;
        while (current != null) {
            if (current.left != null) return false;
            current = current.right;
            actualDepth++;
        }
        
        // Verify the depth matches the expected depth
        return actualDepth == expectedDepth;
    }
}
