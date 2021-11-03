package main

import (
	"fmt"
	"strings"
)

/*
https://leetcode.com/problems/integer-to-roman/
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
Given an integer, convert it to a roman numeral.



Example 1:

Input: num = 3
Output: "III"
Example 2:

Input: num = 4
Output: "IV"
Example 3:

Input: num = 9
Output: "IX"
Example 4:

Input: num = 58
Output: "LVIII"
Explanation: L = 50, V = 5, III = 3.
Example 5:

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.


Constraints:

1 <= num <= 3999
*/
func intToRoman(num int) string {
	var result strings.Builder
	result.Grow(4)
	var unit, n int
	for i := 0; i < 4; i++ {
		unit = unitV[i]
		if num < unit {
			continue
		}
		n = num / unit
		num = num - n*unit
		byteRoman(n, unitC[i], &result)
	}
	return result.String()
}

func byteRoman(n int, unit [3]byte, result *strings.Builder) {
	switch n {
	case 10:
		result.WriteByte(unit[2])
	case 9:
		result.WriteByte(unit[0])
		result.WriteByte(unit[2])
	case 8:
		result.WriteByte(unit[1])
		result.WriteByte(unit[0])
		result.WriteByte(unit[0])
		result.WriteByte(unit[0])
	case 7:
		result.WriteByte(unit[1])
		result.WriteByte(unit[0])
		result.WriteByte(unit[0])
	case 6:
		result.WriteByte(unit[1])
		result.WriteByte(unit[0])
	case 5:
		result.WriteByte(unit[1])
	case 4:
		result.WriteByte(unit[0])
		result.WriteByte(unit[1])
	case 3:
		result.WriteByte(unit[0])
		result.WriteByte(unit[0])
		result.WriteByte(unit[0])
	case 2:
		result.WriteByte(unit[0])
		result.WriteByte(unit[0])
	case 1:
		result.WriteByte(unit[0])
	}
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
var unitV = [...]int{1000, 100, 10, 1}
var unitC = [...][3]byte{{'M', ' ', ' '}, {'C', 'D', 'M'}, {'X', 'L', 'C'}, {'I', 'V', 'X'}}

func main() {
	fmt.Printf("1=[%s]\n", intToRoman(1))
	fmt.Printf("2=[%s]\n", intToRoman(2))
	fmt.Printf("3=[%s]\n", intToRoman(3))
	fmt.Printf("4=[%s]\n", intToRoman(4))
	fmt.Printf("5=[%s]\n", intToRoman(5))
	fmt.Printf("6=[%s]\n", intToRoman(6))
	fmt.Printf("7=[%s]\n", intToRoman(7))
	fmt.Printf("8=[%s]\n", intToRoman(8))
	fmt.Printf("9=[%s]\n", intToRoman(9))
	fmt.Printf("10=[%s]\n", intToRoman(10))
	fmt.Printf("99=[%s]\n", intToRoman(99))
	fmt.Printf("888=[%s]\n", intToRoman(888))
	fmt.Printf("3000=[%s]\n", intToRoman(3000))
	fmt.Printf("3999=[%s]\n", intToRoman(3999))
}
