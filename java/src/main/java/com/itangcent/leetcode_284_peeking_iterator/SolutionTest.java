package com.itangcent.leetcode_284_peeking_iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Test class for the solution to LeetCode problem #284: peeking-iterator
 */
public class SolutionTest {
    public static void main(String[] args) {
        System.out.println("Running tests for LeetCode problem #284: peeking-iterator");
        
        // Test case 1: Basic next and peek
        List<Integer> nums1 = Arrays.asList(1, 2, 3);
        PeekingIterator it1 = new PeekingIterator(nums1.iterator());
        testCase("Basic next and peek", 
            it1.next() == 1 && 
            it1.peek() == 2 && 
            it1.next() == 2 && 
            it1.next() == 3 && 
            !it1.hasNext());

        // Test case 2: Multiple peeks without advancing
        List<Integer> nums2 = Arrays.asList(1, 2, 3);
        PeekingIterator it2 = new PeekingIterator(nums2.iterator());
        testCase("Multiple peeks", 
            it2.peek() == 1 && 
            it2.peek() == 1 && 
            it2.next() == 1);

        // Test case 3: Empty iterator
        List<Integer> nums3 = Arrays.asList();
        PeekingIterator it3 = new PeekingIterator(nums3.iterator());
        testCase("Empty iterator", 
            !it3.hasNext());

        // Test case 4: Mixed peek and next
        List<Integer> nums4 = Arrays.asList(1, 2, 3, 4);
        PeekingIterator it4 = new PeekingIterator(nums4.iterator());
        testCase("Mixed peek and next",
            it4.peek() == 1 &&
            it4.next() == 1 &&
            it4.peek() == 2 &&
            it4.next() == 2 &&
            it4.peek() == 3 &&
            it4.peek() == 3 &&
            it4.next() == 3 &&
            it4.next() == 4 &&
            !it4.hasNext());
    }

    private static void testCase(String caseName, boolean condition) {
        String result = condition ? "PASSED" : "FAILED";
        System.out.println(String.format("Test case for %s: %s", caseName, result));
    }
}
