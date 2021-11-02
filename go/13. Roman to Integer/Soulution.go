package main

import (
	"fmt"
)

/*
https://leetcode.com/problems/roman-to-integer/
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:

Input: s = "III"
Output: 3
Example 2:

Input: s = "IV"
Output: 4
Example 3:

Input: s = "IX"
Output: 9
Example 4:

Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
Example 5:

Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*/
func romanToInt(s string) int {
	sLen := len(s)
	var r, v, u, nextU int

	u = unitMap[s[0]]
	v = u
	for i := 1; i < sLen; i++ {
		nextU = unitMap[s[i]]
		if u == 0 {
			u = nextU
			v = nextU
		} else if u > nextU {
			r += v
			u = nextU
			v = nextU
		} else if u == nextU {
			v += nextU
		} else { //u<nextU
			r += nextU - v
			u = 0
			v = 0
		}
	}
	if v != 0 {
		r += v
	}
	return r
}

/*
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
*/
var unitMap = map[byte]int{'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}

func main() {
	fmt.Printf("I=[%d]\n", romanToInt("I"))
	fmt.Printf("M=[%d]\n", romanToInt("M"))
	fmt.Printf("III=[%d]\n", romanToInt("III"))
	fmt.Printf("IV=[%d]\n", romanToInt("IV"))
	fmt.Printf("IX=[%d]\n", romanToInt("IX"))
	fmt.Printf("LVIII=[%d]\n", romanToInt("LVIII"))
	fmt.Printf("MCMXCIV=[%d]\n", romanToInt("MCMXCIV"))
	fmt.Printf("MMMMM=[%d]\n", romanToInt("MMMM"))
	fmt.Printf("MMMCMXCIX=[%d]\n", romanToInt("MMMCMXCIX"))
}
