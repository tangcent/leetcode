package com.itangcent.leetcode_219_contains_duplicate_ii;

public class SolutionTest {
    private static Solution solution = new Solution();

    public static void main(String[] args) {
        testContainsNearbyDuplicate();
    }

    public static void testContainsNearbyDuplicate() {
        // Test case 1: Duplicates within k distance
        System.out.println("Test case for Duplicates within k distance: " +
            (solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3) ? "PASSED" : "FAILED"));

        System.out.println("Test case for Duplicates but beyond k distance: " +
            (!solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2) ? "PASSED" : "FAILED"));

        System.out.println("Test case for Empty array: " +
            (!solution.containsNearbyDuplicate(new int[]{}, 1) ? "PASSED" : "FAILED"));

        System.out.println("Test case for Single element array: " +
            (!solution.containsNearbyDuplicate(new int[]{1}, 1) ? "PASSED" : "FAILED"));

        System.out.println("Test case for Multiple duplicates within k distance: " + 
            (solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 3) ? "PASSED" : "FAILED"));
        
        System.out.println("Test case for k=0 (should always return false): " + 
            (!solution.containsNearbyDuplicate(new int[]{1, 1}, 0) ? "PASSED" : "FAILED"));
        
        System.out.println("Test case for k >= array length: " + 
            (solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 4) ? "PASSED" : "FAILED"));
        
        System.out.println("Test case for All elements same within k distance: " + 
            (solution.containsNearbyDuplicate(new int[]{1, 1, 1, 1}, 2) ? "PASSED" : "FAILED"));
        
        System.out.println("Test case for No duplicates: " + 
            (!solution.containsNearbyDuplicate(new int[]{1, 2, 3, 4}, 2) ? "PASSED" : "FAILED"));
    }
}
