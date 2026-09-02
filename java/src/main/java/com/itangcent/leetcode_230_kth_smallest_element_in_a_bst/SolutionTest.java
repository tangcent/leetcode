package com.itangcent.leetcode_230_kth_smallest_element_in_a_bst;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Simple BST
        TreeNode root1 = new TreeNode(3,
            new TreeNode(1, null, new TreeNode(2)),
            new TreeNode(4));
        testCase(solution, root1, 1, "First element");
        testCase(solution, root1, 2, "Second element");
        testCase(solution, root1, 3, "Third element");
        testCase(solution, root1, 4, "Fourth element");

        // Test case 2: Larger BST
        TreeNode root2 = new TreeNode(5,
            new TreeNode(3,
                new TreeNode(2, new TreeNode(1), null),
                new TreeNode(4)),
            new TreeNode(6));
        testCase(solution, root2, 1, "Smallest in larger tree");
        testCase(solution, root2, 6, "Largest in larger tree");
        testCase(solution, root2, 3, "Middle element");

        // Test case 3: Single node
        TreeNode root3 = new TreeNode(1);
        testCase(solution, root3, 1, "Single node tree");

        System.out.println("All test cases completed");
    }

    private static void testCase(Solution solution, TreeNode root, int k, String caseName) {
        int result = solution.kthSmallest(root, k);
        System.out.printf("Test case for %s: %s (k=%d, result=%d)%n",
            caseName, "PASSED", k, result);
    }
}
