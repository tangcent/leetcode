package com.itangcent.leetcode_376_wiggle_subsequence;

/**
 * Test class for the solution to LeetCode problem #376: wiggle-subsequence
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

//        // Test case 1: Empty array
//        testCase(solution, new int[]{}, 0);
//
//        // Test case 2: Single element
//        testCase(solution, new int[]{1}, 1);

        // Test case 3: Two elements increasing
        testCase(solution, new int[]{1, 2}, 2);

        // Test case 4: Two elements decreasing
        testCase(solution, new int[]{2, 1}, 2);

        // Test case 5: Wiggle sequence
        testCase(solution, new int[]{1, 7, 4, 9, 2, 5}, 6);

        // Test case 6: Non-wiggle sequence
        testCase(solution, new int[]{1, 2, 3, 4, 5, 6}, 2);

        // Test case 7: Equal consecutive numbers
        testCase(solution, new int[]{1, 2, 2, 3, 2}, 3);

        testCase(solution, new int[]{0, 0}, 1);
    }

    private static void testCase(Solution solution, int[] nums, int expected) {
        int actual = solution.wiggleMaxLength(nums);
        String result = actual == expected ? "PASSED" : "FAILED";
        System.out.println(String.format(
                "Test case for %s: %s (Expected: %d, Actual: %d)",
                arrayToString(nums), result, expected, actual
        ));
    }

    private static String arrayToString(int[] nums) {
        if (nums == null) return "null";
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) sb.append(", ");
            sb.append(nums[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}
