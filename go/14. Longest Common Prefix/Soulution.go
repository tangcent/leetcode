package main

import (
	"fmt"
)

/*
https://leetcode.com/problems/longest-common-prefix
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".



Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.


Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
*/
func longestCommonPrefix(strs []string) string {
	length := len(strs)
	if length == 1 {
		return strs[0]
	}
	first := strs[0]
	var next string
	commonPrefix := len(first)
	for i := 1; i < length; i++ {
		next = strs[i]
		commonPrefix = Min(commonPrefix, len(next))
		for j := 0; j < commonPrefix; j++ {
			if first[j] != next[j] {
				commonPrefix = j
				break
			}
		}
		if commonPrefix == 0 {
			return ""
		}
	}
	return first[0:commonPrefix]
}
func Min(x, y int) int {
	if x > y {
		return y
	}
	return x
}

func test(strs []string, expect string) {
	r := longestCommonPrefix(strs)
	fmt.Printf("%v=[%s] | expect [%s]? [%t]\n", strs, r, expect, expect == r)
}

func main() {
	test([]string{""}, "")
	test([]string{"abc"}, "abc")
	test([]string{"abc", "abcd"}, "abc")
	test([]string{"abcd", "abc"}, "abc")
	test([]string{"flower", "flow", "flight"}, "fl")
	test([]string{"flower", "abcd", "flight"}, "")
}
