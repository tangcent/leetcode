package com.itangcent.leetcode_105_construct_binary_tree_from_preorder_and_inorder_traversal;

/**
 * Test class for the solution to LeetCode problem #105: construct-binary-tree-from-preorder-and-inorder-traversal
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Simple tree
        //     3
        //    / \
        //   9  20
        //      / \
        //     15  7
        int[] preorder1 = {3, 9, 20, 15, 7};
        int[] inorder1 = {9, 3, 15, 20, 7};
        TreeNode result1 = solution.buildTree(preorder1, inorder1);
        System.out.println("Test case 1: " + (isValidTree(result1, preorder1, inorder1) ? "PASSED" : "FAILED"));

        // Test case 2: Empty tree
        int[] preorder2 = {};
        int[] inorder2 = {};
        TreeNode result2 = solution.buildTree(preorder2, inorder2);
        System.out.println("Test case 2: " + (result2 == null ? "PASSED" : "FAILED"));

        // Test case 3: Single node
        int[] preorder3 = {1};
        int[] inorder3 = {1};
        TreeNode result3 = solution.buildTree(preorder3, inorder3);
        System.out.println("Test case 3: " + (isValidTree(result3, preorder3, inorder3) ? "PASSED" : "FAILED"));

        // Test case 4: Left skewed tree
        //     1
        //    /
        //   2
        //  /
        // 3
        int[] preorder4 = {1, 2, 3};
        int[] inorder4 = {3, 2, 1};
        TreeNode result4 = solution.buildTree(preorder4, inorder4);
        System.out.println("Test case 4: " + (isValidTree(result4, preorder4, inorder4) ? "PASSED" : "FAILED"));
    }

    private static boolean isValidTree(TreeNode root, int[] preorder, int[] inorder) {
        if (root == null) return preorder.length == 0 && inorder.length == 0;
        
        // Verify preorder traversal
        int[] actualPreorder = new int[preorder.length];
        preorderTraversal(root, actualPreorder, new int[]{0});
        for (int i = 0; i < preorder.length; i++) {
            if (actualPreorder[i] != preorder[i]) return false;
        }

        // Verify inorder traversal
        int[] actualInorder = new int[inorder.length];
        inorderTraversal(root, actualInorder, new int[]{0});
        for (int i = 0; i < inorder.length; i++) {
            if (actualInorder[i] != inorder[i]) return false;
        }

        return true;
    }

    private static void preorderTraversal(TreeNode root, int[] result, int[] index) {
        if (root == null) return;
        result[index[0]++] = root.val;
        preorderTraversal(root.left, result, index);
        preorderTraversal(root.right, result, index);
    }

    private static void inorderTraversal(TreeNode root, int[] result, int[] index) {
        if (root == null) return;
        inorderTraversal(root.left, result, index);
        result[index[0]++] = root.val;
        inorderTraversal(root.right, result, index);
    }
}
