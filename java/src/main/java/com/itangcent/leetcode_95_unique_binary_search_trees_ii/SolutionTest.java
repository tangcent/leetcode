package com.itangcent.leetcode_95_unique_binary_search_trees_ii;

import java.util.List;

/**
 * Test class for the solution to LeetCode problem #95: unique-binary-search-trees-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #95: unique-binary-search-trees-ii");

        // Test case 1: n = 1
        System.out.println("\nTest case 1: n = 1");
        List<TreeNode> result1 = solution.generateTrees(1);
        System.out.println("Number of trees generated: " + result1.size());
        printTrees(result1);

        // Test case 2: n = 2
        System.out.println("\nTest case 2: n = 2");
        List<TreeNode> result2 = solution.generateTrees(2);
        System.out.println("Number of trees generated: " + result2.size());
        printTrees(result2);

        // Test case 3: n = 3
        System.out.println("\nTest case 3: n = 3");
        List<TreeNode> result3 = solution.generateTrees(3);
        System.out.println("Number of trees generated: " + result3.size());
        printTrees(result3);

        // Test case 4: n = 4
        System.out.println("\nTest case 4: n = 4");
        List<TreeNode> result4 = solution.generateTrees(4);
        System.out.println("Number of trees generated: " + result4.size());
        printTrees(result4);
    }

    private static void printTrees(List<TreeNode> trees) {
        for (int i = 0; i < trees.size(); i++) {
            System.out.println("Tree " + (i + 1) + ":");
            printTree(trees.get(i), "", null);
        }
    }

    private static void printTree(TreeNode node, String prefix, Boolean isLeft) {
        if (node == null) {
            System.out.println(prefix + (isLeft ? "└── " : "┌── ") + "null");
            return;
        }

        if (node.right != null) {
            printTree(node.right, prefix + "     ", false);
        }

        if (isLeft == null) {
            System.out.println(prefix + node.val);
        } else {
            System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.val);
        }

        if (node.left != null) {
            printTree(node.left, prefix + "     ", true);
        }
    }
}
