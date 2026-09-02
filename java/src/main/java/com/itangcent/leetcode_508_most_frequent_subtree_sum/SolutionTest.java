package com.itangcent.leetcode_508_most_frequent_subtree_sum;

/**
 * Test class for the solution to LeetCode problem #508: most-frequent-subtree-sum
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test case 1: Empty tree
        testCase(solution, null, new int[]{}, "Empty tree");
        
        // Test case 2: Single node tree
        testCase(solution, new TreeNode(5), new int[]{5}, "Single node tree");
        
        // Test case 3: Simple balanced tree
        testCase(solution, 
            new TreeNode(5,
                new TreeNode(2),
                new TreeNode(-3)),
            new int[]{2, -3, 4}, "Simple balanced tree");
            
        // Test case 4: Tree with negative values
        testCase(solution,
            new TreeNode(5,
                new TreeNode(2),
                new TreeNode(-5)),
            new int[]{2}, "Tree with negative values");

        // Test case 5: Tree with multiple most frequent sums
        //     5
        //    / \
        //   2  -5
        //  / \
        // 1   1
        // Expected sums: 1 (appears twice), 4 (appears twice)
        testCase(solution,
            new TreeNode(5,
                new TreeNode(2,
                    new TreeNode(1),
                    new TreeNode(1)),
                new TreeNode(-5)),
            new int[]{1, 4}, "Tree with multiple most frequent sums");
    }
    
    private static void testCase(Solution solution, TreeNode root, int[] expected, String caseName) {
        int[] result = solution.findFrequentTreeSum(root);
        boolean passed = arraysEqual(expected, result);
        System.out.println(String.format("Test case for %s: %s", caseName, passed ? "PASSED" : "FAILED"));
        if (!passed) {
            System.out.println(String.format("Expected: %s, Actual: %s", 
                arrayToString(expected), arrayToString(result)));
        }
    }
    
    private static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }
    
    private static String arrayToString(int[] arr) {
        if (arr == null) return "null";
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(arr[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
