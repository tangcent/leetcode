package com.itangcent.leetcode_437_path_sum_iii;

/**
 * Test class for the solution to LeetCode problem #437: path-sum-iii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #437: path-sum-iii");
//
//        // Test case 1: Example from LeetCode - [10,5,-3,3,2,null,11,3,-2,null,1] with targetSum = 8
//        TreeNode root1 = new TreeNode(10);
//        root1.left = new TreeNode(5);
//        root1.right = new TreeNode(-3);
//        root1.left.left = new TreeNode(3);
//        root1.left.right = new TreeNode(2);
//        root1.right.right = new TreeNode(11);
//        root1.left.left.left = new TreeNode(3);
//        root1.left.left.right = new TreeNode(-2);
//        root1.left.right.right = new TreeNode(1);
//
//        int expected1 = 3;
//        int result1 = solution.pathSum(root1, 8);
//        System.out.println("Test case for Example 1: " + (result1 == expected1 ? "PASSED" : "FAILED"));
//        if (result1 != expected1) {
//            System.out.println("Expected: " + expected1 + ", Actual: " + result1);
//        }
//
//        // Test case 2: [5,4,8,11,null,13,4,7,2,null,null,5,1] with targetSum = 22
//        TreeNode root2 = new TreeNode(5);
//        root2.left = new TreeNode(4);
//        root2.right = new TreeNode(8);
//        root2.left.left = new TreeNode(11);
//        root2.right.left = new TreeNode(13);
//        root2.right.right = new TreeNode(4);
//        root2.left.left.left = new TreeNode(7);
//        root2.left.left.right = new TreeNode(2);
//        root2.right.right.left = new TreeNode(5);
//        root2.right.right.right = new TreeNode(1);
//
//        int expected2 = 3;
//        int result2 = solution.pathSum(root2, 22);
//        System.out.println("Test case for Example 2: " + (result2 == expected2 ? "PASSED" : "FAILED"));
//        if (result2 != expected2) {
//            System.out.println("Expected: " + expected2 + ", Actual: " + result2);
//        }
//
//        // Test case 3: Empty tree
//        TreeNode root3 = null;
//        int expected3 = 0;
//        int result3 = solution.pathSum(root3, 1);
//        System.out.println("Test case for Empty Tree: " + (result3 == expected3 ? "PASSED" : "FAILED"));
//        if (result3 != expected3) {
//            System.out.println("Expected: " + expected3 + ", Actual: " + result3);
//        }
//
//        // Test case 4: Single node tree with matching value
//        TreeNode root4 = new TreeNode(1);
//        int expected4 = 1;
//        int result4 = solution.pathSum(root4, 1);
//        System.out.println("Test case for Single Node (Match): " + (result4 == expected4 ? "PASSED" : "FAILED"));
//        if (result4 != expected4) {
//            System.out.println("Expected: " + expected4 + ", Actual: " + result4);
//        }
//
//        // Test case 5: Single node tree with non-matching value
//        TreeNode root5 = new TreeNode(1);
//        int expected5 = 0;
//        int result5 = solution.pathSum(root5, 2);
//        System.out.println("Test case for Single Node (No Match): " + (result5 == expected5 ? "PASSED" : "FAILED"));
//        if (result5 != expected5) {
//            System.out.println("Expected: " + expected5 + ", Actual: " + result5);
//        }

        // Test case 6: Right-skewed tree with targetSum = 3
        // Tree structure: [1,null,2,null,3,null,4,null,5]
        TreeNode root6 = new TreeNode(1);
        root6.right = new TreeNode(2);
        root6.right.right = new TreeNode(3);
        root6.right.right.right = new TreeNode(4);
        root6.right.right.right.right = new TreeNode(5);

        int expected6 = 2;
        int result6 = solution.pathSum(root6, 3);
        System.out.println("Test case for Right-skewed Tree: " + (result6 == expected6 ? "PASSED" : "FAILED"));
        if (result6 != expected6) {
            System.out.println("Expected: " + expected6 + ", Actual: " + result6);
        }
    }
}
