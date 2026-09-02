package com.itangcent.leetcode_124_binary_tree_maximum_path_sum;

/**
 * Test class for the solution to LeetCode problem #124: binary-tree-maximum-path-sum
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
//
//        // Test case 1: Simple binary tree
//        TreeNode root1 = new TreeNode(1,
//            new TreeNode(2),
//            new TreeNode(3)
//        );
//        int result1 = solution.maxPathSum(root1);
//        System.out.println("Test case for simple binary tree: " + (result1 == 6 ? "PASSED" : "FAILED"));
//        System.out.println("Expected: 6, Actual: " + result1);
//
//        // Test case 2: Tree with negative values
//        TreeNode root2 = new TreeNode(-10,
//            new TreeNode(9),
//            new TreeNode(20,
//                new TreeNode(15),
//                new TreeNode(7)
//            )
//        );
//        int result2 = solution.maxPathSum(root2);
//        System.out.println("Test case for tree with negative values: " + (result2 == 42 ? "PASSED" : "FAILED"));
//        System.out.println("Expected: 42, Actual: " + result2);
//
//        // Test case 3: Single node tree
//        TreeNode root3 = new TreeNode(1);
//        int result3 = solution.maxPathSum(root3);
//        System.out.println("Test case for single node tree: " + (result3 == 1 ? "PASSED" : "FAILED"));
//        System.out.println("Expected: 1, Actual: " + result3);
//
//        // Test case 4: All negative values
//        TreeNode root4 = new TreeNode(-1,
//            new TreeNode(-2),
//            new TreeNode(-3)
//        );
//        int result4 = solution.maxPathSum(root4);
//        System.out.println("Test case for all negative values: " + (result4 == -1 ? "PASSED" : "FAILED"));
//        System.out.println("Expected: -1, Actual: " + result4);
//
//        // Test case 5: Complex tree with mixed values
//        TreeNode root5 = new TreeNode(10,
//            new TreeNode(2,
//                new TreeNode(20),
//                new TreeNode(1)
//            ),
//            new TreeNode(10,
//                new TreeNode(-25,
//                    new TreeNode(3),
//                    new TreeNode(4)
//                ),
//                new TreeNode(0)
//            )
//        );
//        int result5 = solution.maxPathSum(root5);
//        System.out.println("Test case for complex tree: " + (result5 == 42 ? "PASSED" : "FAILED"));
//        System.out.println("Expected: 42, Actual: " + result5);
//
//        // Test case 6: Tree with specific values [-1,-2,10,-6,null,-3,-6]
//        TreeNode root6 = new TreeNode(-1,
//            new TreeNode(-2,
//                new TreeNode(-6),
//                null
//            ),
//            new TreeNode(10,
//                new TreeNode(-3),
//                new TreeNode(-6)
//            )
//        );
//        int result6 = solution.maxPathSum(root6);
//        System.out.println("Test case for [-1,-2,10,-6,null,-3,-6]: " + (result6 == 10 ? "PASSED" : "FAILED"));
//        System.out.println("Expected: 10, Actual: " + result6);
        
        // Test case 7: Tree with specific values [-1,null,9,-6,3,null,null,null,-2]
        TreeNode root7 = new TreeNode(-1);
        root7.right = new TreeNode(9);
        root7.right.left = new TreeNode(-6);
        root7.right.right = new TreeNode(3);
        root7.right.left.right = new TreeNode(-2);
        
        int result7 = solution.maxPathSum(root7);
        System.out.println("Test case for [-1,null,9,-6,3,null,null,null,-2]: " + (result7 == 12 ? "PASSED" : "FAILED"));
        System.out.println("Expected: 12, Actual: " + result7);
    }
}
