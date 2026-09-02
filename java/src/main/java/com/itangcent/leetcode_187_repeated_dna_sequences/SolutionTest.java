package com.itangcent.leetcode_187_repeated_dna_sequences;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Test class for the solution to LeetCode problem #187: repeated-dna-sequences
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #187: repeated-dna-sequences");
        
        // Test case 1 - Example from LeetCode
        String s1 = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected1 = Arrays.asList("AAAAACCCCC", "CCCCCAAAAA");
        List<String> result1 = solution.findRepeatedDnaSequences(s1);
        Collections.sort(result1);
        Collections.sort(expected1);
        System.out.println("Test case for example input: " + 
                            (listsEqual(expected1, result1) ? "PASSED" : "FAILED"));
        if (!listsEqual(expected1, result1)) {
            System.out.println("  Expected: " + expected1);
            System.out.println("  Actual: " + result1);
        }
        
        // Test case 2 - Another example from LeetCode
        String s2 = "AAAAAAAAAA";
        List<String> expected2 = new ArrayList<>();
        List<String> result2 = solution.findRepeatedDnaSequences(s2);
        System.out.println("Test case for single sequence: " + 
                            (listsEqual(expected2, result2) ? "PASSED" : "FAILED"));
        if (!listsEqual(expected2, result2)) {
            System.out.println("  Expected: " + expected2);
            System.out.println("  Actual: " + result2);
        }
        
        // Test case 3 - String shorter than 10 characters
        String s3 = "ACGT";
        List<String> expected3 = new ArrayList<>();
        List<String> result3 = solution.findRepeatedDnaSequences(s3);
        System.out.println("Test case for short sequence: " + 
                            (listsEqual(expected3, result3) ? "PASSED" : "FAILED"));
        if (!listsEqual(expected3, result3)) {
            System.out.println("  Expected: " + expected3);
            System.out.println("  Actual: " + result3);
        }
        
        // Test case 4 - Multiple repetitions
        String s4 = "AAAAAAAAAACAAAAAAAAAA";
        List<String> expected4 = Arrays.asList("AAAAAAAAAA");
        List<String> result4 = solution.findRepeatedDnaSequences(s4);
        System.out.println("Test case for multiple repetitions: " + 
                            (listsEqual(expected4, result4) ? "PASSED" : "FAILED"));
        if (!listsEqual(expected4, result4)) {
            System.out.println("  Expected: " + expected4);
            System.out.println("  Actual: " + result4);
        }
    }
    
    /**
     * Helper method to check if two lists contain the same elements
     */
    private static <T> boolean listsEqual(List<T> list1, List<T> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        return list1.containsAll(list2) && list2.containsAll(list1);
    }
}
