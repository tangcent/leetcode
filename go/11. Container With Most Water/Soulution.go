package main

import (
	"fmt"
)

/*
https://leetcode.com/problems/container-with-most-water/
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.



Example 1:


Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
Example 3:

Input: height = [4,3,2,1,4]
Output: 16
Example 4:

Input: height = [1,2,1]
Output: 2


Constraints:

n == height.length
2 <= n <= 105
0 <= height[i] <= 104
*/
func maxArea(height []int) int {
	l := 0
	r := len(height) - 1
	hl := height[l]
	hr := height[r]
	var tempHeight, tempArea int
	area := Min(hl, hr) * r
	for l < r {
		if hl > hr {
			r--
			tempHeight = height[r]
			if tempHeight < hr {
				continue
			}
			hr = tempHeight
			tempArea = Min(tempHeight, hl) * (r - l)
			if tempArea > area {
				area = tempArea
			}
		} else {
			l++
			tempHeight = height[l]
			if tempHeight < hl {
				continue
			}
			hl = tempHeight
			tempArea = Min(tempHeight, hr) * (r - l)
			if tempArea > area {
				area = tempArea
			}
		}
	}
	return area
}

func Min(x, y int) int {
	if x > y {
		return y
	}
	return x
}

func test(height []int, expect int) {
	r := maxArea(height)
	fmt.Printf("%v=%d | expect %d? [%t]\n", height, r, expect, expect == r)
}

func main() {
	test([]int{1, 8, 6, 2, 5, 4, 8, 3, 7}, 49)
	test([]int{1, 1}, 1)
	test([]int{4, 3, 2, 1, 4}, 16)
	test([]int{1, 2, 1}, 2)
	test([]int{2, 3, 10, 5, 7, 8, 9}, 36)
	test([]int{2, 3, 4, 5, 18, 17, 6}, 17)
	test([]int{2, 77, 3, 8, 4, 99, 18, 78, 6}, 462)

}
