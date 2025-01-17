package com.itangcent.leetcode_71_simplify_path;

public class SolutionTest {
    static Solution solution = new Solution();

    public static void main(String[] args) {
        // Test basic path
        test("/home/", "/home");
        
        // Test path with double dots
        test("/a/./b/../../c/", "/c");
        
        // Test path with single dots and empty components
        test("/home//foo/", "/home/foo");
        
        // Test path that reduces to root
        test("/../", "/");
        
        // Test complex path
        test("/home/./foo/./.", "/home/foo");
        
        // Test path with multiple double dots
        test("/a/../../", "/");
        
        // Test absolute path
        test("////home//foo/", "/home/foo");
        
        System.out.println("All tests passed!");
    }
    
    private static void test(String input, String expected) {
        String result = solution.simplifyPath(input);
        if (!result.equals(expected)) {
            System.err.println("Test failed!");
            System.err.println("Input: " + input);
            System.err.println("Expected: " + expected);
            System.err.println("Got: " + result);
            System.exit(1);
        }
    }
} 