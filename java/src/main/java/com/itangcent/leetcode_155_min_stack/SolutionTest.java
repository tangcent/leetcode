package com.itangcent.leetcode_155_min_stack;

/**
 * Test class for the solution to LeetCode problem #155: min-stack
 */
public class SolutionTest {
    public static void main(String[] args) {
        // Test case 1: Basic operations
        System.out.println("Running tests for LeetCode problem #155: min-stack");
        System.out.println("Test case for basic operations: " + testBasicOperations());
        
        // Test case 2: Min value tracking
        System.out.println("Test case for min value tracking: " + testMinValueTracking());
        
        // Test case 3: Multiple min values
        System.out.println("Test case for multiple min values: " + testMultipleMinValues());
        
        // Test case 4: Pop operations
        System.out.println("Test case for pop operations: " + testPopOperations());
    }
    
    private static String testBasicOperations() {
        try {
            MinStack minStack = new MinStack();
            minStack.push(5);
            
            // Test top operation
            if (minStack.top() != 5) {
                return "FAILED - Expected top value: 5, Actual: " + minStack.top();
            }
            
            // Test min operation
            if (minStack.getMin() != 5) {
                return "FAILED - Expected min value: 5, Actual: " + minStack.getMin();
            }
            
            return "PASSED";
        } catch (Exception e) {
            return "FAILED - Exception: " + e.getMessage();
        }
    }
    
    private static String testMinValueTracking() {
        try {
            MinStack minStack = new MinStack();
            minStack.push(5);
            minStack.push(2);
            minStack.push(7);
            
            // Test min tracking
            if (minStack.getMin() != 2) {
                return "FAILED - Expected min value: 2, Actual: " + minStack.getMin();
            }
            
            // Test top
            if (minStack.top() != 7) {
                return "FAILED - Expected top value: 7, Actual: " + minStack.top();
            }
            
            return "PASSED";
        } catch (Exception e) {
            return "FAILED - Exception: " + e.getMessage();
        }
    }
    
    private static String testMultipleMinValues() {
        try {
            MinStack minStack = new MinStack();
            minStack.push(5);
            minStack.push(2);
            minStack.push(2);
            minStack.push(7);
            
            // Initial min
            if (minStack.getMin() != 2) {
                return "FAILED - Expected min value: 2, Actual: " + minStack.getMin();
            }
            
            // Pop once, min should still be 2
            minStack.pop(); // Removes 7
            if (minStack.getMin() != 2) {
                return "FAILED - After first pop, expected min: 2, Actual: " + minStack.getMin();
            }
            
            // Pop again, min should still be 2
            minStack.pop(); // Removes one 2
            if (minStack.getMin() != 2) {
                return "FAILED - After second pop, expected min: 2, Actual: " + minStack.getMin();
            }
            
            // Pop again, min should change to 5
            minStack.pop(); // Removes last 2
            if (minStack.getMin() != 5) {
                return "FAILED - After third pop, expected min: 5, Actual: " + minStack.getMin();
            }
            
            return "PASSED";
        } catch (Exception e) {
            return "FAILED - Exception: " + e.getMessage();
        }
    }
    
    private static String testPopOperations() {
        try {
            MinStack minStack = new MinStack();
            minStack.push(3);
            minStack.push(1);
            minStack.push(5);
            
            // Initial state check
            if (minStack.top() != 5 || minStack.getMin() != 1) {
                return "FAILED - Initial state incorrect. Top: " + minStack.top() + ", Min: " + minStack.getMin();
            }
            
            // First pop
            minStack.pop(); // Removes 5
            if (minStack.top() != 1) {
                return "FAILED - After first pop, expected top: 1, Actual: " + minStack.top();
            }
            
            // Second pop
            minStack.pop(); // Removes 1
            if (minStack.top() != 3 || minStack.getMin() != 3) {
                return "FAILED - After second pop, expected top: 3, min: 3, Actual top: " + 
                      minStack.top() + ", min: " + minStack.getMin();
            }
            
            // Pop the last element
            minStack.pop();
            
            // Stack should be empty, but operations should not cause errors
            minStack.pop(); // Should not throw an exception on empty stack
            
            return "PASSED";
        } catch (Exception e) {
            return "FAILED - Exception: " + e.getMessage();
        }
    }
}
