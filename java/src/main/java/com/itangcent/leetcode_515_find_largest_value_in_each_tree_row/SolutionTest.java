package com.itangcent.leetcode_515_find_largest_value_in_each_tree_row;

import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    public static void main(String[] args) {
        // Test case 1: Empty tree
        testCase("Empty tree", null, new int[]{});

        // Test case 2: Single node tree
        TreeNode singleNode = new TreeNode(5);
        testCase("Single node", singleNode, new int[]{5});

        // Test case 3: Balanced tree
        TreeNode balancedTree = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        new TreeNode(3)),
                new TreeNode(2,
                        null,
                        new TreeNode(9)));
        testCase("Balanced tree", balancedTree, new int[]{1, 3, 9});

        // Test case 4: Unbalanced tree
        TreeNode unbalancedTree = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        null),
                new TreeNode(3));
        testCase("Unbalanced tree", unbalancedTree, new int[]{1, 3, 4});

        // Test case 5: Tree with negative values
        TreeNode negativeTree = new TreeNode(-1,
                new TreeNode(-2),
                new TreeNode(-3,
                        null,
                        new TreeNode(-5)));
        testCase("Negative values", negativeTree, new int[]{-1, -2, -5});

        // Test case 6: Tree with duplicate values
        TreeNode duplicateTree = new TreeNode(2,
                new TreeNode(2),
                new TreeNode(2,
                        new TreeNode(2),
                        new TreeNode(2)));
        testCase("Duplicate values", duplicateTree, new int[]{2, 2, 2});
    }

    private static void testCase(String caseName, TreeNode root, int[] expected) {
        Solution solution = new Solution();
        List<Integer> result = solution.largestValues(root);

        boolean passed = true;
        if (result.size() != expected.length) {
            passed = false;
        } else {
            for (int i = 0; i < expected.length; i++) {
                if (result.get(i) != expected[i]) {
                    passed = false;
                    break;
                }
            }
        }

        System.out.println("Test case for " + caseName + ": " +
                (passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println("Expected: " + Arrays.toString(expected));
            System.out.println("Actual: " + result);
        }
    }
}
