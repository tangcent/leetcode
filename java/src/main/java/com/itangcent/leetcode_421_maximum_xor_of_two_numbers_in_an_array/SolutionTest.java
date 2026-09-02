package com.itangcent.leetcode_421_maximum_xor_of_two_numbers_in_an_array;

/**
 * Test class for the solution to LeetCode problem #421: maximum-xor-of-two-numbers-in-an-array
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #421: maximum-xor-of-two-numbers-in-an-array");

        // Test case 1: Example from problem description
        int[] nums1 = {3, 10, 5, 25, 2, 8};
        int result1 = solution.findMaximumXOR(nums1);
        System.out.println("Test case for example input: " +
                (result1 == 28 ? "PASSED" : "FAILED") +
                " (Expected: 28, Actual: " + result1 + ")");

        // Test case 2: Small array
        int[] nums2 = {0, 1};
        int result2 = solution.findMaximumXOR(nums2);
        System.out.println("Test case for small array: " +
                (result2 == 1 ? "PASSED" : "FAILED") +
                " (Expected: 1, Actual: " + result2 + ")");

        // Test case 3: All same numbers
        int[] nums3 = {5, 5, 5, 5};
        int result3 = solution.findMaximumXOR(nums3);
        System.out.println("Test case for all same numbers: " +
                (result3 == 0 ? "PASSED" : "FAILED") +
                " (Expected: 0, Actual: " + result3 + ")");

        // Test case 4: Test large array
        int[] nums4 = {10821, 6050, 496, 28672, 19835, 1567, 22346, 9996, 8028, 15882, 24693, 328, 20711, 1623,
                4563, 13078, 25470, 9536, 14167, 29134, 24587, 27257, 1855, 23769, 6939, 25531, 31485, 27429,
                18341, 27286, 8511, 32139, 31683, 16009, 13859, 27814, 28582, 29919, 17256, 25675, 23862, 26126,
                16430, 31139, 8646, 9503, 3009, 22969, 19929, 22066, 3385, 10740, 10302, 25979, 24242, 3543, 15664,
                17755, 820, 31666, 9982, 1358, 5188, 1449, 25537, 2658, 31377, 22002, 13865, 5324, 4740, 23831, 4837, 22476,
                9624, 17146, 16677, 3416, 6831, 18582, 31780, 10886, 19463, 15530, 16146, 11878, 31284, 7208, 26284, 28664,
                16875, 19154, 11378, 14023, 28654, 27544, 19109, 28782, 5556, 19849, 26557, 31140, 11172, 4659, 24070, 14287,
                10985, 17101, 23323, 13618, 4850, 1049, 17670, 25871, 32242, 22711, 19859, 20313, 30653, 31828, 24194, 30746};
        int result4 = solution.findMaximumXOR(nums4);
        System.out.println("Test case for large array: " +
                (result4 == 32765 ? "PASSED" : "FAILED") +
                " (Expected: 32765, Actual: " + result4 + ")");

        // Test case 5: Array [8,10,2]
        int[] nums5 = {8, 10, 2};
        int result5 = solution.findMaximumXOR(nums5);
        System.out.println("Test case for array [8,10,2]: " +
                (result5 == 10 ? "PASSED" : "FAILED") +
                " (Expected: 10, Actual: " + result5 + ")");
    }
}
