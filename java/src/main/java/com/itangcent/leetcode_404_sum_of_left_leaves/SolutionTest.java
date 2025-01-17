package com.itangcent.leetcode_404_sum_of_left_leaves;

/**
 * Test class for the solution to LeetCode problem #404: sum-of-left-leaves
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #404: sum-of-left-leaves");
        
        // Test case 1: Example from LeetCode
        //     3
        //    / \
        //   9  20
        //     /  \
        //    15   7
        // Sum of left leaves is 9 + 15 = 24
        TreeNode root1 = new TreeNode(3);
        root1.left = new TreeNode(9);
        root1.right = new TreeNode(20);
        root1.right.left = new TreeNode(15);
        root1.right.right = new TreeNode(7);
        testCase(solution, root1, 24, "Example tree from LeetCode");
        
        // Test case 2: Empty tree
        testCase(solution, null, 0, "Empty tree");
        
        // Test case 3: Single node tree
        TreeNode root3 = new TreeNode(1);
        testCase(solution, root3, 0, "Single node tree");
        
        // Test case 4: Only right nodes
        TreeNode root4 = new TreeNode(1);
        root4.right = new TreeNode(2);
        root4.right.right = new TreeNode(3);
        testCase(solution, root4, 0, "Only right nodes");
        
        // Test case 5: Only left nodes
        TreeNode root5 = new TreeNode(1);
        root5.left = new TreeNode(2);
        root5.left.left = new TreeNode(3);
        testCase(solution, root5, 3, "Only left nodes");
        
        // Test case 6: Balanced tree with multiple left leaves
        TreeNode root6 = new TreeNode(5);
        root6.left = new TreeNode(3);
        root6.right = new TreeNode(8);
        root6.left.left = new TreeNode(2);
        root6.left.right = new TreeNode(4);
        root6.right.left = new TreeNode(7);
        root6.right.right = new TreeNode(9);
        testCase(solution, root6, 9, "Balanced tree with multiple left leaves"); // 2 + 7 = 9
    }
    
    private static void testCase(Solution solution, TreeNode root, int expected, String caseName) {
        int actual = solution.sumOfLeftLeaves(root);
        boolean passed = actual == expected;
        System.out.println("Test case for " + caseName + ": " + (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("  Expected: " + expected + ", Actual: " + actual);
        }
    }
}
