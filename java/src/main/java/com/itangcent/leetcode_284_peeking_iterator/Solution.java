package com.itangcent.leetcode_284_peeking_iterator;


/*
 * @lc app=leetcode id=284 lang=java
 *
 * [284] Peeking Iterator
 */

// @lc code=start
// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

import java.util.Iterator;

class PeekingIterator implements Iterator<Integer> {
    private Iterator<Integer> iterator;

    private Integer peekedValue = null;

    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        if (peekedValue != null) {
            return peekedValue;
        }
        if (iterator.hasNext()) {
            peekedValue = iterator.next();
        }
        return peekedValue;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        if (peekedValue != null) {
            Integer res = peekedValue;
            this.peekedValue = null;
            return res;
        }
        return iterator.next();
    }

    @Override
    public boolean hasNext() {
        return peekedValue != null || iterator.hasNext();
    }
}
// @lc code=end

