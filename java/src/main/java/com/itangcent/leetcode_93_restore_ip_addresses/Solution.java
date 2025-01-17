package com.itangcent.leetcode_93_restore_ip_addresses;

/*
 * @lc app=leetcode id=93 lang=java
 *
 * [93] Restore IP Addresses
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

// @lc code=start
class Solution {
    public List<String> restoreIpAddresses(String s) {
        int[] nums = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            nums[i] = s.charAt(i) - '0';
        }
        return restoreIpAddresses(nums, 0, 4);
    }

    private List<String> restoreIpAddresses(int[] nums, int start, int parts) {
        if (parts == 0 || start == nums.length) {
            return Collections.emptyList();
        }
        // If it's the last part, we need to check if the remaining part is valid
        if (parts == 1) {
            if (nums[start] == 0) {
                if (start == nums.length - 1) {
                    return Collections.singletonList("0"); // Valid last part
                } else {
                    return Collections.emptyList(); // Invalid last part
                }
            }
            int n = 0;
            for (int i = start; i < nums.length; i++) {
                n = n * 10 + nums[i];
                if (n > 255) {
                    return Collections.emptyList(); // Invalid last part
                }
            }
            return Collections.singletonList(String.valueOf(n)); // Valid last part
        }
        int length = nums.length;
        if (nums[start] == 0) {
            return concate(0, restoreIpAddresses(nums, start + 1, parts - 1));
        }

        List<String> results = new ArrayList<>();
        int n = 0;
        for (int i = start; i < length; i++) {
            n = n * 10 + nums[i];
            if (n > 255) {
                break;
            }
            results.addAll(concate(n, restoreIpAddresses(nums, i + 1, parts - 1)));
        }
        return results;
    }

    private List<String> concate(int i, List<String> parts) {
        if (parts.isEmpty()) {
            return Collections.emptyList();
        }
        return parts.stream().map(part -> i + "." + part).collect(Collectors.toList());
    }
}
// @lc code=end

