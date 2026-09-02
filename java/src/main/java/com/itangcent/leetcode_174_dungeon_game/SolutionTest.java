package com.itangcent.leetcode_174_dungeon_game;

import java.util.Arrays;

/**
 * Test class for the solution to LeetCode problem #174: dungeon-game
 */
public class SolutionTest {

    private static int passed = 0;
    private static int failed = 0;

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println("Running tests for LeetCode problem #174: dungeon-game");
        System.out.println();

        // Test case 1: official example, the rescue room sits behind a big loss
        check(solution, "official example 1",
                new int[][]{{-2, -3, 3}, {-5, -10, 1}, {10, 30, -5}}, 7);

        // Test case 2: official example, one neutral cell
        check(solution, "official example 2 -> single zero cell",
                new int[][]{{0}}, 1);

        // Test case 3: single cell, heal on entry -> 1 HP is enough
        check(solution, "single positive cell",
                new int[][]{{100}}, 1);

        // Test case 4: single cell, damage on entry -> must enter with 2 HP
        check(solution, "single negative cell",
                new int[][]{{-1}}, 2);

        // Test case 5: single row, no damage anywhere
        check(solution, "single row, all zero",
                new int[][]{{0, 0, 0}}, 1);

        // Test case 6: single row, damage accumulates -> 1 + 6 HP
        check(solution, "single row, all negative",
                new int[][]{{-3, -2, -1}}, 7);

        // Test case 7: single column, no route choice at all
        check(solution, "single column, all negative",
                new int[][]{{-3}, {-2}, {-1}}, 7);

        // Test case 8: mixed grid, the cheapest route is not the shortest-looking one
        check(solution, "mixed 3x3",
                new int[][]{{1, -3, 3}, {0, -2, 0}, {-3, -3, -3}}, 3);

        // Test case 9: every route stays above zero the whole way
        check(solution, "all paths stay positive",
                new int[][]{{2, 1}, {1, -1}}, 1);

        // Test case 10: must bank HP early for the final -50 hit
        check(solution, "big loss at the end",
                new int[][]{{10, 20}, {30, -50}}, 11);

        // Test case 11: no healing at all, take the least damaging route
        check(solution, "all negative 2x2",
                new int[][]{{-2, -3}, {-5, -10}}, 16);

        System.out.println();
        System.out.println("Summary: " + passed + " passed, " + failed + " failed");
    }

    private static void check(Solution solution, String name, int[][] dungeon, int expected) {
        int actual = solution.calculateMinimumHP(dungeon);
        boolean ok = actual == expected;
        if (ok) {
            passed++;
        } else {
            failed++;
        }
        System.out.println("Test case: " + name + " -> " + (ok ? "PASSED" : "FAILED"));
        System.out.println("  Input:    " + render(dungeon));
        System.out.println("  Expected: " + expected + ", Actual: " + actual);
        System.out.println();
    }

    private static String render(int[][] dungeon) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < dungeon.length; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(Arrays.toString(dungeon[i]));
        }
        return sb.append(']').toString();
    }
}
