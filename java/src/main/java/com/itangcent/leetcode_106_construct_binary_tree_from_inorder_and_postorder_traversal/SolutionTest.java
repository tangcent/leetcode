package com.itangcent.leetcode_106_construct_binary_tree_from_inorder_and_postorder_traversal;

/**
 * Test class for the solution to LeetCode problem #106: construct-binary-tree-from-inorder-and-postorder-traversal
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #106: construct-binary-tree-from-inorder-and-postorder-traversal");
        
        // Test case 1: Simple tree
        //     3
        //    / \
        //   9  20
        //      / \
        //     15  7
        int[] inorder1 = {9, 3, 15, 20, 7};
        int[] postorder1 = {9, 15, 7, 20, 3};
        TreeNode result1 = solution.buildTree(inorder1, postorder1);
        System.out.println("Test case 1: " + (isValidTree(result1, inorder1, postorder1) ? "PASSED" : "FAILED"));
        
        // Test case 2: Empty tree
        int[] inorder2 = {};
        int[] postorder2 = {};
        TreeNode result2 = solution.buildTree(inorder2, postorder2);
        System.out.println("Test case 2: " + (result2 == null ? "PASSED" : "FAILED"));
        
        // Test case 3: Single node
        int[] inorder3 = {1};
        int[] postorder3 = {1};
        TreeNode result3 = solution.buildTree(inorder3, postorder3);
        System.out.println("Test case 3: " + (isValidTree(result3, inorder3, postorder3) ? "PASSED" : "FAILED"));
        
        // Test case 4: Left skewed tree
        //     1
        //    /
        //   2
        //  /
        // 3
        int[] inorder4 = {3, 2, 1};
        int[] postorder4 = {3, 2, 1};
        TreeNode result4 = solution.buildTree(inorder4, postorder4);
        System.out.println("Test case 4: " + (isValidTree(result4, inorder4, postorder4) ? "PASSED" : "FAILED"));
        
        // Test case 5: Right skewed tree
        //   1
        //    \
        //     2
        //      \
        //       3
        int[] inorder5 = {1, 2, 3};
        int[] postorder5 = {3, 2, 1};
        TreeNode result5 = solution.buildTree(inorder5, postorder5);
        System.out.println("Test case 5: " + (isValidTree(result5, inorder5, postorder5) ? "PASSED" : "FAILED"));
    }
    
    private static boolean isValidTree(TreeNode root, int[] inorder, int[] postorder) {
        if (root == null) return inorder.length == 0 && postorder.length == 0;
        
        // Verify inorder traversal
        int[] actualInorder = new int[inorder.length];
        inorderTraversal(root, actualInorder, new int[]{0});
        for (int i = 0; i < inorder.length; i++) {
            if (actualInorder[i] != inorder[i]) return false;
        }
        
        // Verify postorder traversal
        int[] actualPostorder = new int[postorder.length];
        postorderTraversal(root, actualPostorder, new int[]{0});
        for (int i = 0; i < postorder.length; i++) {
            if (actualPostorder[i] != postorder[i]) return false;
        }
        
        return true;
    }
    
    private static void inorderTraversal(TreeNode root, int[] result, int[] index) {
        if (root == null) return;
        inorderTraversal(root.left, result, index);
        result[index[0]++] = root.val;
        inorderTraversal(root.right, result, index);
    }
    
    private static void postorderTraversal(TreeNode root, int[] result, int[] index) {
        if (root == null) return;
        postorderTraversal(root.left, result, index);
        postorderTraversal(root.right, result, index);
        result[index[0]++] = root.val;
    }
}
