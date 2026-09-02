package com.itangcent.leetcode_214_shortest_palindrome;


/*
 * @lc app=leetcode id=214 lang=java
 *
 * [214] Shortest Palindrome
 *
 * Problem: prepend the minimum number of characters to `s` (only before it)
 *          so that the result becomes a palindrome.
 *
 * Key insight: the chars we can only add go at the FRONT. So a valid answer is
 *          (a reversed suffix) + (a prefix of s that is already a palindrome).
 *          To minimize added chars, we want the LONGEST prefix of s that is a
 *          palindrome. Then we just prepend the reversed rest.
 *
 * How to find the longest palindromic prefix efficiently (KMP prefix function):
 *   - palindrome s[0..k-1] <=> prefix s[0..k-1] equals reverse of itself.
 *   - Build r = reverse(s). Then a palindrome prefix of length k means:
 *        the prefix of length k in s  ==  the suffix of length k in r.
 *   - We can detect "prefix equals suffix" with the KMP prefix (LPS) table.
 *   - We must forbid the match from mixing s and r, so join them with '#'.
 */
// @lc code=start
class Solution {
    public String shortestPalindrome(String s) {
        // r is exactly the reverse of s
        String r = new StringBuilder(s).reverse().toString();

        // Build the searchable string: s + '#' + r
        // The '#' is a separator: it never appears in s or r, so a matched
        // "prefix == suffix" can never span across it. This keeps the match
        // contained so that a match reaching the end really means:
        //     a prefix of s that is a palindrome.
        String t = s + "#" + r;

        // KMP prefix function table (LPS: Longest Proper Prefix that is also a Suffix)
        // prefix[i] = length of the longest proper prefix of t[0..i]
        //             that is also a suffix of t[0..i]
        int[] prefix = new int[t.length()];
        for (int i = 1, j = 0; i < t.length(); i++) {
            // j tracks how many chars already matched.
            // If current chars mismatch, fall back to the next shorter
            // candidate length instead of restarting from scratch.
            while (j > 0 && t.charAt(i) != t.charAt(j)) {
                j = prefix[j - 1];
            }
            // If they match, extend the current matched prefix length.
            if (t.charAt(i) == t.charAt(j)) {
                j++;
            }
            // Store the best matched length ending at position i.
            prefix[i] = j;
        }

        // After processing the whole t, prefix[last] equals the length of the
        // longest palindromic prefix of s (because we forced the match against r).
        int longest = prefix[t.length() - 1];

        // s.length() - longest chars of r are the leftover non-palindromic suffix.
        // Prepend exactly those (in reversed order = r's prefix) before s.
        return r.substring(0, s.length() - longest) + s;
    }
}
// @lc code=end