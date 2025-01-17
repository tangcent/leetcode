package com.itangcent.leetcode_210_course_schedule_ii;

import java.util.Arrays;

/**
 * Test class for the solution to LeetCode problem #210: course-schedule-ii
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #210: course-schedule-ii");
        
        // Test case 1: Simple chain - 2 courses
        testFindOrder(solution, 2, new int[][]{{1, 0}}, new int[][]{{0, 1}});
        
        // Test case 2: Multiple possibilities - 4 courses
        testFindOrder(solution, 4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}}, 
                     new int[][]{{0, 1, 2, 3}, {0, 2, 1, 3}});
        
        // Test case 3: Cycle detection - should return empty array
        testFindOrder(solution, 2, new int[][]{{1, 0}, {0, 1}}, new int[][]{{}});
        
        // Test case 4: No prerequisites
        testFindOrder(solution, 3, new int[][]{}, null);
        
        // Test case 5: Complex case
        testFindOrder(solution, 6, 
                     new int[][]{{1, 0}, {2, 1}, {3, 2}, {4, 3}, {5, 4}, {3, 0}, {4, 1}, {5, 2}},
                     null);
    }
    
    private static void testFindOrder(Solution solution, int numCourses, int[][] prerequisites, int[][] expectedResults) {
        int[] result = solution.findOrder(numCourses, prerequisites);
        
        String testName = "numCourses=" + numCourses + ", prerequisites=" + Arrays.deepToString(prerequisites);
        
        // If expectedResults is null, we just check if a valid order was found
        if (expectedResults == null) {
            boolean isValid = result.length == numCourses && isValidOrder(result, prerequisites, numCourses);
            System.out.println("Test case for " + testName + ": " + (isValid ? "PASSED" : "FAILED"));
            System.out.println("  Result: " + Arrays.toString(result));
            return;
        }
        
        // For empty result case
        if (expectedResults.length == 1 && expectedResults[0].length == 0) {
            boolean passed = result.length == 0;
            System.out.println("Test case for " + testName + ": " + (passed ? "PASSED" : "FAILED"));
            if (!passed) {
                System.out.println("  Expected: empty array");
                System.out.println("  Actual: " + Arrays.toString(result));
            }
            return;
        }
        
        // Check if result matches any of the expected results
        boolean passed = false;
        for (int[] expected : expectedResults) {
            if (Arrays.equals(result, expected)) {
                passed = true;
                break;
            }
        }
        
        // If not directly matched, check if it's a valid ordering
        if (!passed && result.length == numCourses) {
            passed = isValidOrder(result, prerequisites, numCourses);
        }
        
        System.out.println("Test case for " + testName + ": " + (passed ? "PASSED" : "FAILED"));
        if (!passed && expectedResults.length > 0) {
            System.out.println("  Expected one of: " + Arrays.deepToString(expectedResults));
            System.out.println("  Actual: " + Arrays.toString(result));
        }
    }
    
    private static boolean isValidOrder(int[] order, int[][] prerequisites, int numCourses) {
        // Check if all courses are included
        if (order.length != numCourses) {
            return false;
        }
        
        // Check for duplicates
        boolean[] visited = new boolean[numCourses];
        for (int course : order) {
            if (course < 0 || course >= numCourses || visited[course]) {
                return false;
            }
            visited[course] = true;
        }
        
        // Check if prerequisites are satisfied
        for (int[] prereq : prerequisites) {
            int course = prereq[0];
            int prerequisite = prereq[1];
            
            int courseIndex = -1;
            int prerequisiteIndex = -1;
            
            for (int i = 0; i < order.length; i++) {
                if (order[i] == course) {
                    courseIndex = i;
                }
                if (order[i] == prerequisite) {
                    prerequisiteIndex = i;
                }
            }
            
            // Prerequisite must come before the course
            if (prerequisiteIndex >= courseIndex) {
                return false;
            }
        }
        
        return true;
    }
}
