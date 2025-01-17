package com.itangcent.leetcode_337_house_robber_iii;

/**
 * Test class for the solution to LeetCode problem #337: house-robber-iii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #337: house-robber-iii");
        
        // Test Case 1: Example from LeetCode
        // Tree structure:
        //      3
        //     / \
        //    2   3
        //     \   \
        //      3   1
        TreeNode root1 = new TreeNode(3,
                new TreeNode(2, null, new TreeNode(3)),
                new TreeNode(3, null, new TreeNode(1)));
        
        int expected1 = 7; // Max amount: 3 + 3 + 1 = 7
        int result1 = solution.rob(root1);
        System.out.println("Test case for Example 1: " + (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test Case 2: Another example from LeetCode
        // Tree structure:
        //      3
        //     / \
        //    4   5
        //   / \   \
        //  1   3   1
        TreeNode root2 = new TreeNode(3,
                new TreeNode(4, new TreeNode(1), new TreeNode(3)),
                new TreeNode(5, null, new TreeNode(1)));
        
        int expected2 = 9; // Max amount: 4 + 5 = 9
        int result2 = solution.rob(root2);
        System.out.println("Test case for Example 2: " + (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test Case 3: Single node
        TreeNode root3 = new TreeNode(10);
        int expected3 = 10;
        int result3 = solution.rob(root3);
        System.out.println("Test case for Single Node: " + (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test Case 4: Linear tree (right skewed)
        TreeNode root4 = new TreeNode(1, 
                null, 
                new TreeNode(2, 
                        null, 
                        new TreeNode(3, 
                                null, 
                                new TreeNode(4))));
        int expected4 = 6; // Max amount: 1 + 3 = 4 or 2 + 4 = 6, whichever is greater
        int result4 = solution.rob(root4);
        System.out.println("Test case for Linear Tree: " + (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test Case 5: Empty tree
        int expected5 = 0;
        int result5 = solution.rob(null);
        System.out.println("Test case for Empty Tree: " + (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
        
        // Test Case 6: Large tree (Time Limit Exceeded case)
        // This is a large tree from LeetCode that caused Time Limit Exceeded in some solutions
        TreeNode root6 = buildLargeTree();
        int expected6 = 176;
        int result6 = solution.rob(root6);
        System.out.println("Test case for Large Tree (TLE): " + (result6 == expected6 ? "PASSED" : "FAILED"));
        if (result6 != expected6) {
            System.out.println("  Expected: " + expected6 + ", Actual: " + result6);
        }
    }
    
    // Helper method to build the large tree from the Time Limit Exceeded test case
    private static TreeNode buildLargeTree() {
        // Array representation of the tree: [79,99,77,null,null,null,69,null,60,53,null,73,11,null,null,null,62,27,62,null,null,
        // 98,50,null,null,90,48,82,null,null,null,55,64,null,null,73,56,6,47,null,93,null,null,
        // 75,44,30,82,null,null,null,null,null,null,57,36,89,42,null,null,76,10,null,null,null,
        // null,null,32,4,18,null,null,1,7,null,null,42,64,null,null,39,76,null,null,6,null,66,8,
        // 96,91,38,38,null,null,null,null,74,42,null,null,null,10,40,5,null,null,null,null,28,8,
        // 24,47,null,null,null,17,36,50,19,63,33,89,null,null,null,null,null,null,null,null,94,
        // 72,null,null,79,25,null,null,51,null,70,84,43,null,64,35,null,null,null,null,40,78,
        // null,null,35,42,98,96,null,null,82,26,null,null,null,null,48,91,null,null,35,93,86,42,
        // null,null,null,null,0,61,null,null,67,null,53,48,null,null,82,30,null,97,null,null,
        // null,1,null,null]
        Integer[] values = {79,99,77,null,null,null,69,null,60,53,null,73,11,null,null,null,62,27,62,null,null,
                      98,50,null,null,90,48,82,null,null,null,55,64,null,null,73,56,6,47,null,93,null,null,
                      75,44,30,82,null,null,null,null,null,null,57,36,89,42,null,null,76,10,null,null,null,
                      null,null,32,4,18,null,null,1,7,null,null,42,64,null,null,39,76,null,null,6,null,66,8,
                      96,91,38,38,null,null,null,null,74,42,null,null,null,10,40,5,null,null,null,null,28,8,
                      24,47,null,null,null,17,36,50,19,63,33,89,null,null,null,null,null,null,null,null,94,
                      72,null,null,79,25,null,null,51,null,70,84,43,null,64,35,null,null,null,null,40,78,
                      null,null,35,42,98,96,null,null,82,26,null,null,null,null,48,91,null,null,35,93,86,42,
                      null,null,null,null,0,61,null,null,67,null,53,48,null,null,82,30,null,97,null,null,
                      null,1,null,null};
        
        return buildTreeFromArray(values, 0);
    }
    
    // Helper method to build a tree from an array representation
    private static TreeNode buildTreeFromArray(Integer[] arr, int index) {
        if (index >= arr.length || arr[index] == null) {
            return null;
        }
        
        TreeNode node = new TreeNode(arr[index]);
        node.left = buildTreeFromArray(arr, 2 * index + 1);
        node.right = buildTreeFromArray(arr, 2 * index + 2);
        
        return node;
    }
}
