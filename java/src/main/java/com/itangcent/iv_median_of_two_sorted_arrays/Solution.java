package com.itangcent.iv_median_of_two_sorted_arrays;

import java.util.Iterator;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * <p>
 * Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
 * <p>
 * You may assume nums1 and nums2 cannot be both empty.
 * <p>
 * Example 1:
 * <p>
 * nums1 = [1, 3]
 * nums2 = [2]
 * <p>
 * The median is 2.0
 * Example 2:
 * <p>
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * <p>
 * The median is (2 + 3)/2 = 2.5
 */
public class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int midIndex = ((size + 1) >> 1) - 1;
        int i = -1;

        int midNum = 0;
        RandomIterator iterator;
        if (nums1.length == 0) {
            iterator = new ArrayIterator(nums2);
        } else if (nums2.length == 0) {
            iterator = new ArrayIterator(nums1);
        } else {
            iterator = new TwoArrayIterator(nums1, nums2);
        }
        while (i < midIndex) {
            if (iterator.randomAble()) {
                midNum = iterator.next(midIndex - i);
                break;
            } else if (++i == midIndex) {
                midNum = iterator.next();
                break;
            } else {
                iterator.next();
            }
        }

        if ((size & 1) == 0) {
            return (midNum + iterator.next()) / 2.0;
        } else {
            return midNum;
        }
    }

    private interface RandomIterator extends Iterator<Integer> {
        boolean randomAble();

        Integer next(int length);
    }

    private static class ArrayIterator implements RandomIterator {

        int[] nums;

        public ArrayIterator(int[] nums) {
            this.nums = nums;
            length = nums.length;
        }

        int length;
        int index = 0;

        public boolean hasNext() {
            return index < length;
        }

        public Integer next() {
            return nums[index++];
        }

        public void remove() {

        }

        public boolean randomAble() {
            return true;
        }

        public Integer next(int length) {
            index += length;
            return nums[index - 1];
        }
    }

    private class PeekableArrayIterator extends ArrayIterator {

        public PeekableArrayIterator(int[] nums) {
            super(nums);
        }

        Integer peek;

        @Override
        public boolean hasNext() {
            return peek != null || super.hasNext();
        }

        @Override
        public Integer next() {
            if (peek != null) {
                try {
                    return peek;
                } finally {
                    peek = null;
                }
            }
            return super.next();
        }

        public Integer peek() {
            if (peek == null) {
                peek = next();
            }
            return peek;
        }

        @Override
        public Integer next(int length) {
            if (peek == null) {
                return super.next(length);
            }
            try {
                return super.next(length - 1);
            } finally {
                peek = null;
            }
        }
    }

    private class TwoArrayIterator implements RandomIterator {

        PeekableArrayIterator first;
        PeekableArrayIterator second;

        public TwoArrayIterator(int[] first, int[] second) {
            this.first = new PeekableArrayIterator(first);
            this.second = new PeekableArrayIterator(second);
        }

        public boolean hasNext() {
            return first.hasNext() || second.hasNext();
        }

        public Integer next() {
            if (!first.hasNext()) {
                return second.next();
            } else if (!second.hasNext()) {
                return first.next();
            }
            int peekFirst = first.peek();
            int peekSecond = second.peek();
            if (peekFirst > peekSecond) {
                return second.next();
            } else {
                return first.next();
            }
        }

        public void remove() {

        }

        public boolean randomAble() {
            return !first.hasNext() || !second.hasNext();
        }

        public Integer next(int length) {
            if (first.hasNext()) {
                return first.next(length);
            } else {
                return second.next(length);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().findMedianSortedArrays(new int[]{2, 3}, new int[]{}) == 2.5);
        System.out.println(new Solution().findMedianSortedArrays(new int[]{}, new int[]{1}) == 1);
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1}, new int[]{2, 3}) == 2);
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{}) == 2);
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2);
        System.out.println(new Solution().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}) == 2.5);
        System.out.println(new Solution().findMedianSortedArrays(new int[]{7, 8, 9}, new int[]{1, 2, 3, 4}) == 4);
    }
}
