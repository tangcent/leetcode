package com.itangcent.leetcode_165_compare_version_numbers;

/**
 * Test class for the solution to LeetCode problem #165: compare-version-numbers
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #165: compare-version-numbers");
        
        // Test case 1: version1 > version2
        testCompareVersion(solution, "1.01", "1.001", 0);
        
        // Test case 2: version1 < version2
        testCompareVersion(solution, "1.0", "1.0.0", 0);
        
        // Test case 3: version1 > version2
        testCompareVersion(solution, "0.1", "1.1", -1);
        
        // Test case 4: version1 with more revision numbers
        testCompareVersion(solution, "1.0.1", "1", 1);
        
        // Test case 5: version2 with more revision numbers
        testCompareVersion(solution, "7.5.2.4", "7.5.3", -1);
        
        // Test case 6: complex versions
        testCompareVersion(solution, "2.0.0", "2", 0);
        
        // Test case 7: versions with leading zeros
        testCompareVersion(solution, "1.0.000", "1.0", 0);
    }
    
    private static void testCompareVersion(Solution solution, String version1, String version2, int expected) {
        int result = solution.compareVersion(version1, version2);
        boolean passed = result == expected;
        
        System.out.println("Test case for '" + version1 + "' vs '" + version2 + "': " + 
                          (passed ? "PASSED" : "FAILED"));
        
        if (!passed) {
            System.out.println("  Expected: " + expected + ", Actual: " + result);
        }
    }
}
