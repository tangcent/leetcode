package com.itangcent.leetcode_56_merge_intervals;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: [[1,3],[2,6],[8,10],[15,18]]
        System.out.println("Test case 1: [[1,3],[2,6],[8,10],[15,18]]");
        int[][] intervals1 = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result1 = solution.merge(intervals1);
        printResult(result1);
        System.out.println();

        // Test case 2: [[1,4],[4,5]]
        System.out.println("Test case 2: [[1,4],[4,5]]");
        int[][] intervals2 = {{1,4},{4,5}};
        int[][] result2 = solution.merge(intervals2);
        printResult(result2);
        System.out.println();

        // Test case 3: [[1,4],[2,3],[3,6]]
        System.out.println("Test case 3: [[1,4],[2,3],[3,6]]");
        int[][] intervals3 = {{1,4},{2,3},{3,6}};
        int[][] result3 = solution.merge(intervals3);
        printResult(result3);
        System.out.println();

        // Test case 4: [[1,4],[0,4]]
        System.out.println("Test case 4: [[1,4],[0,4]]");
        int[][] intervals4 = {{1,4},{0,4}};
        int[][] result4 = solution.merge(intervals4);
        printResult(result4);
        System.out.println();

        // Test case 5: [[1,4],[0,0]]
        System.out.println("Test case 5: [[1,4],[0,0]]");
        int[][] intervals5 = {{1,4},{0,0}};
        int[][] result5 = solution.merge(intervals5);
        printResult(result5);
    }

    private static void printResult(int[][] intervals) {
        System.out.print("Result: [");
        for (int i = 0; i < intervals.length; i++) {
            System.out.print("[" + intervals[i][0] + "," + intervals[i][1] + "]");
            if (i < intervals.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println("]");
    }
} 