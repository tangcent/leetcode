package com.itangcent.leetcode_207_course_schedule;


/*
 * @lc app=leetcode id=207 lang=java
 *
 * [207] Course Schedule
 */

import java.util.*;

// @lc code=start
class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Integer> inDegree = new HashMap<>();
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int i = 0; i < numCourses; i++) {
            inDegree.put(i, 0);
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            inDegree.put(prerequisites[i][0], inDegree.get(prerequisites[i][0]) + 1);
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree.get(i) == 0) {
                queue.add(i);
            }
        }

        int cnt = 0;
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            cnt++;
            for (int next : graph.get(cur)) {
                int in = inDegree.get(next) - 1;
                inDegree.put(next, in);
                if (in == 0) {
                    queue.add(next);
                }
            }
        }
        return cnt == numCourses;
    }
}
// @lc code=end

