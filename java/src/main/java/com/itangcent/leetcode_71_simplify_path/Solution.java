package com.itangcent.leetcode_71_simplify_path;
/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

import java.util.LinkedList;
import java.util.List;

// @lc code=start
class Solution {
    public String simplifyPath(String path) {
        List<String> stack = new LinkedList<>();
        String[] dirs = path.split("/");
        for (String dir : dirs) {
            if (dir.equals("") || dir.equals(".")) continue;
            if (dir.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.remove(stack.size() - 1);
                }
            } else {
                stack.add(dir);
            }
        }

        if (stack.isEmpty()) return "/";
        StringBuilder sb = new StringBuilder();
        for (String dir : stack) {
            sb.append("/").append(dir);
        }
        return sb.toString();
    }
}
// @lc code=end 