package com.itangcent.leetcode_226_invert_binary_tree;

/**
 * Test class for the solution to LeetCode problem #226: invert-binary-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test Case 1: Empty tree
        TreeNode emptyTree = null;
        TreeNode invertedEmpty = solution.invertTree(emptyTree);
        System.out.println("Test case for empty tree: " + 
            (invertedEmpty == null ? "PASSED" : "FAILED"));
        
        // Test Case 2: Single node tree
        TreeNode singleNode = new TreeNode(1);
        TreeNode invertedSingle = solution.invertTree(copyTree(singleNode));
        System.out.println("Test case for single node: " + 
            (invertedSingle.val == 1 && invertedSingle.left == null && invertedSingle.right == null ? "PASSED" : "FAILED"));
        
        // Test Case 3: Simple binary tree
        TreeNode simpleTree = new TreeNode(4,
            new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3)),
            new TreeNode(7,
                new TreeNode(6),
                new TreeNode(9)));
        TreeNode invertedSimple = solution.invertTree(copyTree(simpleTree));
        boolean simplePass = checkStructure(invertedSimple, 
            new TreeNode(4,
                new TreeNode(7,
                    new TreeNode(9),
                    new TreeNode(6)),
                new TreeNode(2,
                    new TreeNode(3),
                    new TreeNode(1))));
        System.out.println("Test case for simple binary tree: " + (simplePass ? "PASSED" : "FAILED"));
        
        // Test Case 4: Left skewed tree
        TreeNode leftSkewed = new TreeNode(1,
            new TreeNode(2,
                new TreeNode(3),
                null),
            null);
        TreeNode invertedLeftSkewed = solution.invertTree(copyTree(leftSkewed));
        boolean leftSkewedPass = checkStructure(invertedLeftSkewed,
            new TreeNode(1,
                null,
                new TreeNode(2,
                    null,
                    new TreeNode(3))));
        System.out.println("Test case for left skewed tree: " + (leftSkewedPass ? "PASSED" : "FAILED"));
        
        // Test Case 5: Right skewed tree
        TreeNode rightSkewed = new TreeNode(1,
            null,
            new TreeNode(2,
                null,
                new TreeNode(3)));
        TreeNode invertedRightSkewed = solution.invertTree(copyTree(rightSkewed));
        boolean rightSkewedPass = checkStructure(invertedRightSkewed,
            new TreeNode(1,
                new TreeNode(2,
                    new TreeNode(3),
                    null),
                null));
        System.out.println("Test case for right skewed tree: " + (rightSkewedPass ? "PASSED" : "FAILED"));
    }
    
    private static boolean checkStructure(TreeNode actual, TreeNode expected) {
        if (actual == null) return expected == null;
        if (expected == null) return false;
        if (actual.val != expected.val) return false;
        
        return checkStructure(actual.left, expected.left) && 
               checkStructure(actual.right, expected.right);
    }
    
    private static TreeNode copyTree(TreeNode root) {
        if (root == null) return null;
        TreeNode copy = new TreeNode(root.val);
        copy.left = copyTree(root.left);
        copy.right = copyTree(root.right);
        return copy;
    }
}
