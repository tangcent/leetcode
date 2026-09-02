package com.itangcent.leetcode_112_path_sum;

/**
 * Test class for the solution to LeetCode problem #112: path-sum
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #112: path-sum");
        
        // Test case 1: Empty tree
        TreeNode emptyTree = null;
        System.out.println("Test 1 - Empty tree:");
        System.out.println("Expected: true, Actual: " + solution.hasPathSum(emptyTree, 0));
        
        // Test case 2: Single node tree
        TreeNode singleNode = new TreeNode(5);
        System.out.println("Test 2 - Single node tree:");
        System.out.println("Expected: true, Actual: " + solution.hasPathSum(singleNode, 5));
        System.out.println("Expected: false, Actual: " + solution.hasPathSum(singleNode, 6));
        
        // Test case 3: Simple path sum
        TreeNode simpleTree = createSimpleTree();
        System.out.println("Test 3 - Simple path sum:");
        System.out.println("Expected: true, Actual: " + solution.hasPathSum(simpleTree, 17));
        System.out.println("Expected: false, Actual: " + solution.hasPathSum(simpleTree, 23));
        
        // Test case 4: Complex tree with multiple paths
        TreeNode complexTree = createComplexTree();
        System.out.println("Test 4 - Complex tree:");
        System.out.println("Expected: true, Actual: " + solution.hasPathSum(complexTree, 19));
        System.out.println("Expected: false, Actual: " + solution.hasPathSum(complexTree, 20));
        System.out.println("Expected: false, Actual: " + solution.hasPathSum(complexTree, 25));
    }
    
    // Helper method to create a simple tree:
    //     5
    //    / \
    //   4   8
    //  /   / \
    // 11  13  4
    //  \
    //   7
    private static TreeNode createSimpleTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.right = new TreeNode(7);
        return root;
    }
    
    // Helper method to create a complex tree:
    //     5
    //    / \
    //   4   8
    //  /   / \
    // 11  13  4
    //  \      /
    //   7    2
    private static TreeNode createComplexTree() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.right = new TreeNode(8);
        root.left.left = new TreeNode(11);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.left.left.right = new TreeNode(7);
        root.right.right.left = new TreeNode(2);
        return root;
    }
}
