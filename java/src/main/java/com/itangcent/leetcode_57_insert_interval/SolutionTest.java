package com.itangcent.leetcode_57_insert_interval;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: intervals = [[1,3],[6,9]], newInterval = [2,5]
        System.out.println("Test case 1: intervals = [[1,3],[6,9]], newInterval = [2,5]");
        int[][] intervals1 = {{1,3},{6,9}};
        int[] newInterval1 = {2,5};
        int[][] result1 = solution.insert(intervals1, newInterval1);
        printResult(result1);
        System.out.println();

        // Test case 2: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
        System.out.println("Test case 2: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]");
        int[][] intervals2 = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval2 = {4,8};
        int[][] result2 = solution.insert(intervals2, newInterval2);
        printResult(result2);
        System.out.println();

        // Test case 3: intervals = [], newInterval = [5,7]
        System.out.println("Test case 3: intervals = [], newInterval = [5,7]");
        int[][] intervals3 = {};
        int[] newInterval3 = {5,7};
        int[][] result3 = solution.insert(intervals3, newInterval3);
        printResult(result3);
        System.out.println();

        // Test case 4: intervals = [[1,5]], newInterval = [2,3]
        System.out.println("Test case 4: intervals = [[1,5]], newInterval = [2,3]");
        int[][] intervals4 = {{1,5}};
        int[] newInterval4 = {2,3};
        int[][] result4 = solution.insert(intervals4, newInterval4);
        printResult(result4);
        System.out.println();

        // Test case 5: intervals = [[1,5]], newInterval = [6,8]
        System.out.println("Test case 5: intervals = [[1,5]], newInterval = [6,8]");
        int[][] intervals5 = {{1,5}};
        int[] newInterval5 = {6,8};
        int[][] result5 = solution.insert(intervals5, newInterval5);
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