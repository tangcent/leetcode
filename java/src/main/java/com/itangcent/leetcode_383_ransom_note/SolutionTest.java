package com.itangcent.leetcode_383_ransom_note;

/**
 * Test class for the solution to LeetCode problem #383: ransom-note
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #383: ransom-note");
        
        // Test case 1: Ransom note can be constructed
        String ransomNote1 = "aa";
        String magazine1 = "aab";
        boolean expected1 = true;
        boolean result1 = solution.canConstruct(ransomNote1, magazine1);
        System.out.println("Test case for ransomNote=\"" + ransomNote1 + "\", magazine=\"" + magazine1 + "\": " + 
                           (result1 == expected1 ? "PASSED" : "FAILED"));
        if (result1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + result1);
        }
        
        // Test case 2: Ransom note cannot be constructed (not enough characters)
        String ransomNote2 = "a";
        String magazine2 = "b";
        boolean expected2 = false;
        boolean result2 = solution.canConstruct(ransomNote2, magazine2);
        System.out.println("Test case for ransomNote=\"" + ransomNote2 + "\", magazine=\"" + magazine2 + "\": " + 
                           (result2 == expected2 ? "PASSED" : "FAILED"));
        if (result2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + result2);
        }
        
        // Test case 3: Ransom note cannot be constructed (not enough of the same character)
        String ransomNote3 = "aa";
        String magazine3 = "ab";
        boolean expected3 = false;
        boolean result3 = solution.canConstruct(ransomNote3, magazine3);
        System.out.println("Test case for ransomNote=\"" + ransomNote3 + "\", magazine=\"" + magazine3 + "\": " + 
                           (result3 == expected3 ? "PASSED" : "FAILED"));
        if (result3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + result3);
        }
        
        // Test case 4: Empty ransom note can always be constructed
        String ransomNote4 = "";
        String magazine4 = "";
        boolean expected4 = true;
        boolean result4 = solution.canConstruct(ransomNote4, magazine4);
        System.out.println("Test case for ransomNote=\"" + ransomNote4 + "\", magazine=\"" + magazine4 + "\": " + 
                           (result4 == expected4 ? "PASSED" : "FAILED"));
        if (result4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + result4);
        }
        
        // Test case 5: Ransom note with longer magazine
        String ransomNote5 = "fihjjjjei";
        String magazine5 = "hjibagacbhadfaefdjaeaebgi";
        boolean expected5 = false;
        boolean result5 = solution.canConstruct(ransomNote5, magazine5);
        System.out.println("Test case for ransomNote=\"" + ransomNote5 + "\", magazine=\"" + magazine5 + "\": " + 
                           (result5 == expected5 ? "PASSED" : "FAILED"));
        if (result5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + result5);
        }
    }
}
