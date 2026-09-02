package com.itangcent.leetcode_146_lru_cache;

/**
 * Test class for the solution to LeetCode problem #146: lru-cache
 */
public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("Running tests for LeetCode problem #146: lru-cache");
        
        // Test case 1: Basic operations
        System.out.println("\nTest case for basic operations: ");
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        
        boolean testPassed = true;
        int result;
        
        // Test get existing key
        result = lRUCache.get(1);    // return 1
        System.out.println("get(1) - Expected: 1, Actual: " + result);
        testPassed = testPassed && result == 1;
        
        // Test LRU eviction
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        result = lRUCache.get(2);    // returns -1 (not found)
        System.out.println("get(2) - Expected: -1, Actual: " + result);
        testPassed = testPassed && result == -1;
        
        // Test more eviction
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        result = lRUCache.get(1);    // return -1 (not found)
        System.out.println("get(1) - Expected: -1, Actual: " + result);
        testPassed = testPassed && result == -1;
        
        result = lRUCache.get(3);    // return 3
        System.out.println("get(3) - Expected: 3, Actual: " + result);
        testPassed = testPassed && result == 3;
        
        result = lRUCache.get(4);    // return 4
        System.out.println("get(4) - Expected: 4, Actual: " + result);
        testPassed = testPassed && result == 4;
        
        System.out.println("Test case for basic operations: " + (testPassed ? "PASSED" : "FAILED"));
        
        // Test case 2: Update existing key
        System.out.println("\nTest case for updating existing key: ");
        LRUCache cache2 = new LRUCache(2);
        cache2.put(1, 1);
        cache2.put(2, 2);
        
        testPassed = true;
        
        result = cache2.get(1);      // returns 1
        System.out.println("get(1) - Expected: 1, Actual: " + result);
        testPassed = testPassed && result == 1;
        
        cache2.put(1, 10);           // update existing key
        result = cache2.get(1);      // returns 10
        System.out.println("get(1) after update - Expected: 10, Actual: " + result);
        testPassed = testPassed && result == 10;
        
        result = cache2.get(2);      // returns 2
        System.out.println("get(2) - Expected: 2, Actual: " + result);
        testPassed = testPassed && result == 2;
        
        System.out.println("Test case for updating existing key: " + (testPassed ? "PASSED" : "FAILED"));
        
        // Test case 3: Capacity of 1
        System.out.println("\nTest case for capacity of 1: ");
        LRUCache cache3 = new LRUCache(1);
        
        testPassed = true;
        
        cache3.put(1, 1);
        cache3.put(2, 2);            // evicts key 1
        
        result = cache3.get(1);      // returns -1
        System.out.println("get(1) - Expected: -1, Actual: " + result);
        testPassed = testPassed && result == -1;
        
        result = cache3.get(2);      // returns 2
        System.out.println("get(2) - Expected: 2, Actual: " + result);
        testPassed = testPassed && result == 2;
        
        System.out.println("Test case for capacity of 1: " + (testPassed ? "PASSED" : "FAILED"));
        
        // Test case 4: LRU order after get
        System.out.println("\nTest case for LRU order after get: ");
        LRUCache cache4 = new LRUCache(2);
        
        testPassed = true;
        
        cache4.put(1, 1);
        cache4.put(2, 2);
        
        cache4.get(1);               // cache is now {2=2, 1=1} (1 is most recently used)
        cache4.put(3, 3);            // evicts key 2, cache is {1=1, 3=3}
        
        result = cache4.get(2);      // returns -1
        System.out.println("get(2) - Expected: -1, Actual: " + result);
        testPassed = testPassed && result == -1;
        
        result = cache4.get(1);      // returns 1
        System.out.println("get(1) - Expected: 1, Actual: " + result);
        testPassed = testPassed && result == 1;
        
        System.out.println("Test case for LRU order after get: " + (testPassed ? "PASSED" : "FAILED"));
    }
}
