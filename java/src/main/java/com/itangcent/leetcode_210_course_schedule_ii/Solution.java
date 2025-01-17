package com.itangcent.leetcode_210_course_schedule_ii;


/*
 * @lc app=leetcode id=210 lang=java
 *
 * [210] Course Schedule II
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

// @lc code=start
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        HashMap<Integer, List<Integer>> consequentCourses = new HashMap<>();
        for (int[] prerequisite : prerequisites) {
            degree[prerequisite[0]]++;
            consequentCourses.computeIfAbsent(prerequisite[1], k -> new ArrayList<>())
                    .add(prerequisite[0]);
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (degree[i] == 0) {
                queue.add(i);
            }
        }
        if (queue.isEmpty()) return new int[0];

        int count = 0;
        int[] result = new int[numCourses];
        while (!queue.isEmpty()) {
            int course = queue.poll();
            result[count++] = course;
            List<Integer> courses = consequentCourses.get(course);
            if (courses == null) continue;
            for (Integer i : courses) {
                if (--degree[i] == 0) {
                    queue.add(i);
                }
            }
        }
        if (count != numCourses) return new int[0];
        return result;
    }
}
// @lc code=end

