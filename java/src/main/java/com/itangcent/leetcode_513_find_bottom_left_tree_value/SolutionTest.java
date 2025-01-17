package com.itangcent.leetcode_513_find_bottom_left_tree_value;

/**
 * Test class for the solution to LeetCode problem #513: find-bottom-left-tree-value
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test Case 1: Simple balanced tree
        //     1
        //    / \
        //   2   3
        TreeNode tree1 = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        System.out.println("Test case 1 (balanced tree): Expected: 2, Actual: " + solution.findBottomLeftValue(tree1));

        // Test Case 2: Left-heavy tree
        //        1
        //       /
        //      2
        //     /
        //    3
        TreeNode tree2 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        null),
                null);
        System.out.println("Test case 2 (left-heavy tree): Expected: 3, Actual: " + solution.findBottomLeftValue(tree2));

        // Test Case 3: Right-heavy tree with bottom left value
        //     1
        //      \
        //       2
        //      /
        //     3
        TreeNode tree3 = new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3),
                        null));
        System.out.println("Test case 3 (right-heavy tree): Expected: 3, Actual: " + solution.findBottomLeftValue(tree3));

        // Test Case 4: Single node tree
        TreeNode tree4 = new TreeNode(1);
        System.out.println("Test case 4 (single node): Expected: 1, Actual: " + solution.findBottomLeftValue(tree4));

        // Test Case 5: Complex tree
        //         1
        //        / \
        //       2   3
        //      /   / \
        //     4   5   6
        //    /
        //   7
        TreeNode tree5 = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4,
                                new TreeNode(7),
                                null),
                        new TreeNode(3,
                                new TreeNode(5),
                                new TreeNode(6))), null);
        System.out.println("Test case 5 (complex tree): Expected: 7, Actual: " + solution.findBottomLeftValue(tree5));
    }
}
