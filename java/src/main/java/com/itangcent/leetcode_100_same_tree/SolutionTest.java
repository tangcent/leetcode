package com.itangcent.leetcode_100_same_tree;

/**
 * Test class for the solution to LeetCode problem #100: same-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #100: same-tree");
        
        // Test case 1: Both trees are null
        TreeNode p1 = null;
        TreeNode q1 = null;
        System.out.println("Test case 1 - Both null: " + solution.isSameTree(p1, q1));
        
        // Test case 2: One tree is null, other is not
        TreeNode p2 = null;
        TreeNode q2 = new TreeNode(1);
        System.out.println("Test case 2 - One null: " + solution.isSameTree(p2, q2));
        
        // Test case 3: Identical trees
        TreeNode p3 = createTree(new Integer[]{1, 2, 3});
        TreeNode q3 = createTree(new Integer[]{1, 2, 3});
        System.out.println("Test case 3 - Identical trees: " + solution.isSameTree(p3, q3));
        
        // Test case 4: Different trees with same structure
        TreeNode p4 = createTree(new Integer[]{1, 2, 3});
        TreeNode q4 = createTree(new Integer[]{1, 2, 4});
        System.out.println("Test case 4 - Different values: " + solution.isSameTree(p4, q4));
        
        // Test case 5: Different structure
        TreeNode p5 = createTree(new Integer[]{1, 2});
        TreeNode q5 = createTree(new Integer[]{1, null, 2});
        System.out.println("Test case 5 - Different structure: " + solution.isSameTree(p5, q5));
    }
    
    private static TreeNode createTree(Integer[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(values[0]);
        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.offer(root);
        
        for (int i = 1; i < values.length; i += 2) {
            TreeNode current = queue.poll();
            if (current != null) {
                if (i < values.length && values[i] != null) {
                    current.left = new TreeNode(values[i]);
                    queue.offer(current.left);
                }
                if (i + 1 < values.length && values[i + 1] != null) {
                    current.right = new TreeNode(values[i + 1]);
                    queue.offer(current.right);
                }
            }
        }
        return root;
    }
}
