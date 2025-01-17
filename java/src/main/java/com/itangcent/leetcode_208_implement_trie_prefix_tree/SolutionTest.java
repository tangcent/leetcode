package com.itangcent.leetcode_208_implement_trie_prefix_tree;

/**
 * Test class for the solution to LeetCode problem #208: implement-trie-prefix-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("Running tests for LeetCode problem #208: implement-trie-prefix-tree");
        
        // Test Case 1: Basic operations
        System.out.println("\nTest case for basic operations:");
        Trie trie1 = new Trie();
        trie1.insert("apple");
        boolean result1 = trie1.search("apple");
        System.out.println("Test case for search existing word: " + (result1 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result1);
        
        boolean result2 = trie1.search("app");
        System.out.println("Test case for search non-existing word: " + (!result2 ? "PASSED" : "FAILED"));
        System.out.println("Expected: false, Actual: " + result2);
        
        boolean result3 = trie1.startsWith("app");
        System.out.println("Test case for startsWith valid prefix: " + (result3 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result3);
        
        // Test Case 2: Insert more words
        System.out.println("\nTest case for multiple insertions:");
        Trie trie2 = new Trie();
        trie2.insert("apple");
        trie2.insert("banana");
        trie2.insert("application");
        
        boolean result4 = trie2.search("banana");
        System.out.println("Test case for search second word: " + (result4 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result4);
        
        boolean result5 = trie2.search("app");
        System.out.println("Test case for search common prefix: " + (!result5 ? "PASSED" : "FAILED"));
        System.out.println("Expected: false, Actual: " + result5);
        
        boolean result6 = trie2.startsWith("app");
        System.out.println("Test case for common prefix: " + (result6 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result6);
        
        // Test Case 3: Edge cases
        System.out.println("\nTest case for edge cases:");
        Trie trie3 = new Trie();
        
        boolean result7 = trie3.search("");
        System.out.println("Test case for empty string search: " + (!result7 ? "PASSED" : "FAILED"));
        System.out.println("Expected: false, Actual: " + result7);
        
        boolean result8 = trie3.startsWith("");
        System.out.println("Test case for empty prefix: " + (result8 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result8);
        
        trie3.insert("");
        boolean result9 = trie3.search("");
        System.out.println("Test case for empty string insert and search: " + (result9 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result9);
        
        // Test Case 4: More complex patterns
        System.out.println("\nTest case for more complex patterns:");
        Trie trie4 = new Trie();
        trie4.insert("zebra");
        trie4.insert("dog");
        trie4.insert("duck");
        trie4.insert("dove");
        
        boolean result10 = trie4.search("dog");
        System.out.println("Test case for exact word match: " + (result10 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result10);
        
        boolean result11 = trie4.startsWith("do");
        System.out.println("Test case for common prefix search: " + (result11 ? "PASSED" : "FAILED"));
        System.out.println("Expected: true, Actual: " + result11);
        
        boolean result12 = trie4.startsWith("cat");
        System.out.println("Test case for non-existing prefix: " + (!result12 ? "PASSED" : "FAILED"));
        System.out.println("Expected: false, Actual: " + result12);
    }
}
