package com.itangcent.leetcode_149_max_points_on_a_line;

import java.util.HashMap;
import java.util.Map;

/*
 * @lc app=leetcode id=149 lang=java
 *
 * [149] Max Points on a Line
 */

// @lc code=start
class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2) return n;
        
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            Map<String, Integer> slopeCount = new HashMap<>();
            int duplicate = 0;
            int maxPoints = 0;

            int x1 = points[i][0];
            int y1 = points[i][1];

            for (int j = i + 1; j < n; j++) {
                int x2 = points[j][0];
                int y2 = points[j][1];
                
                // Check for duplicate points
                if (x1 == x2 && y1 == y2) {
                    duplicate++;
                    continue;
                }
                
                // Calculate slope
                int dx = x2 - x1;
                int dy = y2 - y1;
                
                // Normalize the slope representation
                String slope;
                if (dx == 0) {
                    // Vertical line
                    slope = "inf";
                } else if (dy == 0) {
                    // Horizontal line
                    slope = "0";
                } else {
                    // Find greatest common divisor to simplify the slope
                    int gcd = findGCD(dx, dy);
                    
                    // Normalize to ensure dx is positive for consistent representation
                    if (dx < 0) {
                        dx = -dx;
                        dy = -dy;
                    }
                    
                    dx /= gcd;
                    dy /= gcd;
                    slope = dy + "/" + dx;
                }
                
                slopeCount.put(slope, slopeCount.getOrDefault(slope, 0) + 1);
                maxPoints = Math.max(maxPoints, slopeCount.get(slope));
            }
            
            // Include the current point and any duplicates
            result = Math.max(result, maxPoints + duplicate + 1);
        }
        
        return result;
    }
    
    // Find greatest common divisor using Euclidean algorithm
    private int findGCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
// @lc code=end

