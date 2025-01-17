package com.itangcent.leetcode_49_group_anagrams;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Basic case with multiple anagrams
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println("Test case 1: Basic case with multiple anagrams");
        System.out.println("Input: " + Arrays.toString(strs1));
        List<List<String>> result1 = solution.groupAnagrams(strs1);
        System.out.println("Output:");
        printGroups(result1);
        System.out.println();

        // Test case 2: Empty array
        String[] strs2 = {};
        System.out.println("Test case 2: Empty array");
        System.out.println("Input: " + Arrays.toString(strs2));
        List<List<String>> result2 = solution.groupAnagrams(strs2);
        System.out.println("Output:");
        printGroups(result2);
        System.out.println();

        // Test case 3: Single string
        String[] strs3 = {"hello"};
        System.out.println("Test case 3: Single string");
        System.out.println("Input: " + Arrays.toString(strs3));
        List<List<String>> result3 = solution.groupAnagrams(strs3);
        System.out.println("Output:");
        printGroups(result3);
    }

    private static void printGroups(List<List<String>> groups) {
        for (List<String> group : groups) {
            System.out.println(group);
        }
    }
} 