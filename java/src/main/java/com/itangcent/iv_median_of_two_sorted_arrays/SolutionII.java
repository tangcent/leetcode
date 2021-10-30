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
public class SolutionII {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length == 0) {
            return findMedianSortedArrays(nums2);
        } else if (nums2.length == 0) {
            return findMedianSortedArrays(nums1);
        }
        int size = nums1.length + nums2.length;
        int midIndex = size >> 1;

        int index1 = (nums1.length >> 1), index2 = (nums2.length >> 1);
        int index = -1;
        int v = (nums1[nums1.length >> 1] + nums2[nums2.length >> 1]) >> 1;

        int min = min(nums1[0], nums2[0]);
        int max = max(nums1[nums1.length - 1], nums2[nums2.length - 1]);

        for (; ; ) {
            index1 = findIndex(nums1, v, index1);
            index2 = findIndex(nums2, v, index2);
            index = index1 + index2;
            if (index == midIndex) {
                break;
            }
            if (index > midIndex) {
                max = v;
            } else {
                min = v;
            }
            if (min == max) break;
            int mid = (min + max) >> 1;
            if (mid == min) {
                ++mid;
                if (v == mid) break;
                v = mid;
            } else if (mid == v) break;
            else {
                v = mid;
            }
        }
        midIndex = ((size + 1) >> 1) - 1;

        index1 = max(0, index1 - 2);
        index2 = max(0, index2 - 2);
        index = index1 + index2 - 1;
        RandomIterator iterator = new TwoArrayIterator(new PeekableArrayIterator(nums1, index1),
                new PeekableArrayIterator(nums2, index2));

        while (index < midIndex) {
            if (iterator.randomAble()) {
                v = iterator.next(midIndex - index);
                break;
            } else if (++index == midIndex) {
                v = iterator.next();
                break;
            } else {
                iterator.next();
            }
        }

        if ((size & 1) == 0) {
            return (v + iterator.next()) / 2.0;
        } else {
            return v;
        }

    }

    private static int min(int a, int b) {
        return (a <= b) ? a : b;
    }

    private static int max(int a, int b) {
        return (a >= b) ? a : b;
    }

    private double findMedianSortedArrays(int[] nums) {
        int size = nums.length;

        if ((size & 1) == 0) {
            int mid = size >> 1;
            return half(nums[mid], nums[mid - 1]);
        } else {
            return nums[size >> 1];
        }

    }

    private int findIndex(int[] nums, int target, int suggest) {
        if (suggest >= nums.length) {
            if (target > nums[nums.length - 1]) {
                return suggest;
            }
            suggest = nums.length - 1;
        } else if (suggest < 0) {
            if (target < nums[0]) {
                return suggest;
            }
            suggest = nums.length - 1;
        }
        int index = findIndex(nums, target, suggest, 0, nums.length);
        if (index < nums.length && nums[index] < target) {
            return index + 1;
        } else {
            return index;
        }
    }

    private int findIndex(int[] nums, int target, int suggest, int start, int end) {
        int suggestNum = nums[suggest];
        if (target == suggestNum) {
            return suggest;
        } else if (target > suggestNum) {
            return findIndex(nums, target, suggest, end);
        } else {
            return findIndex(nums, target, start, suggest);
        }
    }

    private int findIndex(int[] nums, int target, int start, int end) {
        if (start == end) return start;
        int mid = (start + end) / 2;
        if (mid == start) return mid;
        return findIndex(nums, target, mid, start, end);
    }

    private double half(int a, int b) {
        return (a + (long) b) / 2.0;

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

        public ArrayIterator(int[] nums, int index) {
            this.nums = nums;
            this.index = index;
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

        public PeekableArrayIterator(int[] nums, int index) {
            super(nums, index);
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

        public TwoArrayIterator(PeekableArrayIterator first, PeekableArrayIterator second) {
            this.first = first;
            this.second = second;
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
        System.out.println(new SolutionII().findMedianSortedArrays(new int[]{2, 3}, new int[]{}) == 2.5);
        System.out.println(new SolutionII().findMedianSortedArrays(new int[]{}, new int[]{1}) == 1);
        System.out.println(new SolutionII().findMedianSortedArrays(new int[]{1}, new int[]{2, 3}) == 2);
        System.out.println(new SolutionII().findMedianSortedArrays(new int[]{1, 2, 3}, new int[]{}) == 2);
        System.out.println(new SolutionII().findMedianSortedArrays(new int[]{1, 3}, new int[]{2}) == 2);
        System.out.println(new SolutionII().findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}) == 2.5);
        System.out.println(new SolutionII().findMedianSortedArrays(new int[]{7, 8, 9}, new int[]{1, 2, 3, 4}) == 4);
        System.out.println(new SolutionII().findMedianSortedArrays(new int[]{0, 0, 0, 0, 0}, new int[]{-1, 0, 0, 0, 0, 0, 1}) == 0);
    }

}
