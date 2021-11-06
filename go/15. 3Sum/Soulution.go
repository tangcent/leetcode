package main

import (
	"encoding/json"
	"fmt"
	"sort"
)

/*
https://leetcode.com/problems/3sum/
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.



Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Example 2:

Input: nums = []
Output: []
Example 3:

Input: nums = [0]
Output: []


Constraints:

0 <= nums.length <= 3000
-105 <= nums[i] <= 105
*/
func threeSum(nums []int) [][]int {
	result := make([][]int, 0)
	length := len(nums)
	if length < 3 {
		return result
	}

	sort.Ints(nums)
	indexes := make(map[int]int, length)
	for i := 0; i < length; i++ {
		indexes[-nums[i]] = i
	}
	var a, b int
	for i := 0; i < length-1; i++ {
		a = nums[i]
		if i > 0 && a == nums[i-1] {
			continue
		}
		for j := i + 1; j < length; j++ {
			b = nums[j]
			if j > i+1 && b == nums[j-1] {
				continue
			}
			k, ok := indexes[a+b]
			if ok && k > j {
				result = append(result, []int{a, b, nums[k]})
			}
		}
	}
	return result
}

func test(nums []int, expect [][]int) {
	r := threeSum(nums)
	r_b, err := json.Marshal(r)
	if err != nil {
		fmt.Println("failed json", err)
	}
	e_b, err := json.Marshal(expect)
	if err != nil {
		fmt.Println("failed json", err)
	}
	r_s := string(r_b)
	e_s := string(e_b)
	fmt.Printf("%v=[%s] | expect [%v]? [%t]\n", nums, r_s, e_s, r_s == e_s)
}

func main() {
	test([]int{-1, 0, 1, 2, -1, -4}, [][]int{[]int{-1, -1, 2}, []int{-1, 0, 1}})
}
