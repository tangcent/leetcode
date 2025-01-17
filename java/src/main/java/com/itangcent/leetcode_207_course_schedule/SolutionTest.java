package com.itangcent.leetcode_207_course_schedule;

/**
 * Test class for the solution to LeetCode problem #207: course-schedule
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #207: course-schedule");
        
        // Test case 1: Simple cycle detection
        int numCourses1 = 2;
        int[][] prerequisites1 = {{1,0}};
        boolean expected1 = true;
        boolean actual1 = solution.canFinish(numCourses1, prerequisites1);
        System.out.println("Test case for simple prerequisite: " + 
                            (actual1 == expected1 ? "PASSED" : "FAILED"));
        if (actual1 != expected1) {
            System.out.println("  Expected: " + expected1 + ", Actual: " + actual1);
        }
        
        // Test case 2: Cycle detection (impossible to finish)
        int numCourses2 = 2;
        int[][] prerequisites2 = {{1,0}, {0,1}};
        boolean expected2 = false;
        boolean actual2 = solution.canFinish(numCourses2, prerequisites2);
        System.out.println("Test case for cycle detection: " + 
                            (actual2 == expected2 ? "PASSED" : "FAILED"));
        if (actual2 != expected2) {
            System.out.println("  Expected: " + expected2 + ", Actual: " + actual2);
        }
        
        // Test case 3: No prerequisites
        int numCourses3 = 3;
        int[][] prerequisites3 = {};
        boolean expected3 = true;
        boolean actual3 = solution.canFinish(numCourses3, prerequisites3);
        System.out.println("Test case for no prerequisites: " + 
                            (actual3 == expected3 ? "PASSED" : "FAILED"));
        if (actual3 != expected3) {
            System.out.println("  Expected: " + expected3 + ", Actual: " + actual3);
        }
        
        // Test case 4: Complex course dependencies
        int numCourses4 = 4;
        int[][] prerequisites4 = {{1,0}, {2,1}, {3,2}};
        boolean expected4 = true;
        boolean actual4 = solution.canFinish(numCourses4, prerequisites4);
        System.out.println("Test case for linear dependencies: " + 
                            (actual4 == expected4 ? "PASSED" : "FAILED"));
        if (actual4 != expected4) {
            System.out.println("  Expected: " + expected4 + ", Actual: " + actual4);
        }
        
        // Test case 5: Complex course dependencies with cycle
        int numCourses5 = 5;
        int[][] prerequisites5 = {{1,0}, {2,1}, {3,2}, {0,3}};
        boolean expected5 = false;
        boolean actual5 = solution.canFinish(numCourses5, prerequisites5);
        System.out.println("Test case for complex cycle: " + 
                            (actual5 == expected5 ? "PASSED" : "FAILED"));
        if (actual5 != expected5) {
            System.out.println("  Expected: " + expected5 + ", Actual: " + actual5);
        }
        
        // Test case 6: Multiple independent courses
        int numCourses6 = 4;
        int[][] prerequisites6 = {{1,0}, {3,2}};
        boolean expected6 = true;
        boolean actual6 = solution.canFinish(numCourses6, prerequisites6);
        System.out.println("Test case for independent course groups: " + 
                            (actual6 == expected6 ? "PASSED" : "FAILED"));
        if (actual6 != expected6) {
            System.out.println("  Expected: " + expected6 + ", Actual: " + actual6);
        }
    }
}
