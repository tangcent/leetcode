package main

import (
	"fmt"
	"strings"
)

/*
https://leetcode.com/problems/zigzag-conversion/
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);


Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:
P     I    N
A   L S  I G
Y A   H R
P     I
Example 3:

Input: s = "A", numRows = 1
Output: "A"


Constraints:

1 <= s.length <= 1000
s consists of English letters (lower-case and upper-case), ',' and '.'.
1 <= numRows <= 1000
*/
func convert(s string, numRows int) string {
	if numRows == 1 {
		return s
	}
	length := len(s)
	if numRows >= length {
		return s
	}

	lastRaw := numRows - 1
	gap := lastRaw * 2
	var next, left, right int
	var result strings.Builder
	result.Grow(length)

	//first raw
	for {
		result.WriteByte(s[next])
		next = next + gap
		if next >= length {
			break
		}
	}

	//mid raws
	for raw := 1; raw < lastRaw; raw++ {
		result.WriteByte(s[raw])
		next = gap
		for {
			//left
			left = next - raw
			if left >= length {
				break
			}
			result.WriteByte(s[left])
			//rigth
			right = next + raw
			if right >= length {
				break
			}
			result.WriteByte(s[right])
			next = next + gap
		}
	}

	//last raw
	next = lastRaw
	for {
		result.WriteByte(s[next])
		next = next + gap
		if next >= length {
			break
		}
	}

	return result.String()
}

func main() {

	fmt.Println("A,1:")
	fmt.Println(convert("A", 1))
	fmt.Println("A,3:")
	fmt.Println(convert("A", 3))
	fmt.Println("abcdefg:")
	fmt.Println(convert("abcdefg", 2))
	fmt.Println("PAYPALISHIRING:")
	fmt.Println(convert("PAYPALISHIRING", 4))
	fmt.Println("PAYPALISHIRING,100:")
	fmt.Println(convert("PAYPALISHIRING", 100))
}
