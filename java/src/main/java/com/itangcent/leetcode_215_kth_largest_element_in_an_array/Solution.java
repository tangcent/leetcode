package com.itangcent.leetcode_215_kth_largest_element_in_an_array;


/*
 * @lc app=leetcode id=215 lang=java
 *
 * [215] Kth Largest Element in an Array
 */

import java.util.PriorityQueue;

// @lc code=start
class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Create a min-heap with initial capacity k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Add elements to the heap
        for (int num : nums) {
            // Add current element
            minHeap.offer(num);

            // If heap size exceeds k, remove the smallest element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // The top of the heap is the kth largest element
        return minHeap.peek();
    }
}
// @lc code=end

