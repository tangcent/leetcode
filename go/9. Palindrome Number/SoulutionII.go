package main

import (
	"fmt"
	"math"
)

/*
https://leetcode.com/problems/palindrome-number/
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.



Example 1:

Input: x = 121
Output: true
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Example 4:

Input: x = -101
Output: false


Constraints:

-231 <= x <= 231 - 1


Follow up: Could you solve it without converting the integer to a string?
*/
func isPalindrome(x int) bool {
	if x < 0 {
		return false
	}
	if x == 0 {
		return true
	}

	tail := x % 10
	if tail == 0 {
		return false
	}
	len := numberLen(x)
	base := decimalism[len]
	header := x / base
	if header != tail {
		return false
	}
	x = (x - base*header) / 10
	len -= 2

	for x > 0 && len > 1 {
		base := decimalism[len]
		if x > base {
			header = x / base
		} else {
			header = 0
		}
		tail = x % 10
		if header != tail {
			return false
		}
		x = (x - base*header) / 10
		len -= 2
	}
	return true
}

func numberLen(num int) int {
	for i := maxLen; i > 0; i-- {
		if num >= decimalism[i] {
			return i
		}
	}
	return 1
}

const maxLen = 10

var decimalism = [...]int{1, 1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000}

func main() {
	for _, x := range [...]int{math.MaxInt32, 0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000,
		101, 1001, 10001, 100001, 1000001, 10000001, 100000001, 1000000001, 10000000001,
		191, 1091, 10901, 109001, 1009001, 10090001, 100090001, 1000900001, 10000900001,
		543212345,
	} {
		if x > math.MaxInt32 {
			continue
		}
		fmt.Printf("[%d]\t\t:\t[%t]\n", x, isPalindrome(x))
		fmt.Printf("[%d]\t\t:\t[%t]\n", -x, isPalindrome(-x))
	}
}
