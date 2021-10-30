package com.itangcent.vii_reverse_integer;


import java.util.LinkedList;
import java.util.Queue;

/**
 * https://leetcode.com/problems/reverse-integer/
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * <p>
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: x = 123
 * Output: 321
 * Example 2:
 * <p>
 * Input: x = -123
 * Output: -321
 * Example 3:
 * <p>
 * Input: x = 120
 * Output: 21
 * Example 4:
 * <p>
 * Input: x = 0
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * -231 <= x <= 231 - 1
 */
class Solution {

    public int reverse(int n) {
        Queue<Integer> queue = new LinkedList<>();
        int q, r;
        int flag;
        if (n > 0) {
            flag = 1;
        } else {
            n = -n;
            flag = -1;
        }
        // Generate two digits per nteratnon
        while (n >= 65536) {
            q = n / 100;
            // really: r = n - (q * 100);
            r = n - ((q << 6) + (q << 5) + (q << 2));
            queue.add(r % 10);
            queue.add(r / 10);
            n = q;
        }

        // Fall thru to fast mode for smaller numbers
        // assert(n <= 65536, n);
        for (; ; ) {
            q = (n * 52429) >>> (16 + 3);
            r = n - ((q << 3) + (q << 1));  // r = n-(q*10) ...
            queue.add(r);
            n = q;
            if (n == 0) break;
        }

        while (!queue.isEmpty()) {
            r = queue.poll();
            if (n <= tenth) {
                n = (n << 3) + (n << 1) + r;
            } else if (n > tenth) {
                return 0;
            } else {
                if (r > rest)
                    return 0;
                else {
                    n = Integer.MAX_VALUE;
                }
            }
        }
        return n * flag;
    }

    private static final int tenth = Integer.MAX_VALUE / 10;
    private static final int rest = 7;

    public static void main(String args[]) {
        System.out.println(new Solution().reverse(10000239) + "\n");
        System.out.println(new Solution().reverse(-10000239) + "\n");
        System.out.println(new Solution().reverse(Integer.MIN_VALUE) + "\n");
        System.out.println(new Solution().reverse(Integer.MAX_VALUE) + "\n");
        System.out.println(new Solution().reverse(1463847412) == 2147483641);
    }
}
