package com.itangcent.leetcode_385_mini_parser;

import java.util.List;

/**
 * Test class for the solution to LeetCode problem #385: mini-parser
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #385: mini-parser");
        
        // Test case 1: Simple integer
        testCase(solution, "324", "324");
        
        // Test case 2: Simple list with one element
        testCase(solution, "[123]", "[123]");
        
        // Test case 3: Nested list
        testCase(solution, "[123,[456,[789]]]", "[123,[456,[789]]]");
        
        // Test case 4: Empty list
        testCase(solution, "[]", "[]");
        
        // Test case 5: Complex nested list
        testCase(solution, "[1,[4,2],6,[5,[1],9]]", "[1,[4,2],6,[5,[1],9]]");
        
        // Test case 6: Negative numbers
        testCase(solution, "-123", "-123");
        
        // Test case 7: List with negative numbers
        testCase(solution, "[-1,2,-3,4,-5]", "[-1,2,-3,4,-5]");
        
        // Test case 8: Nested list with negative numbers
        testCase(solution, "[-1,[2,[-3]],4,[-5,[-6]]]", "[-1,[2,[-3]],4,[-5,[-6]]]");
    }
    
    private static void testCase(Solution solution, String input, String expected) {
        NestedInteger result = solution.deserialize(input);
        String actual = nestedIntegerToString(result);
        
        if (expected.equals(actual)) {
            System.out.println("Test case for input \"" + input + "\": PASSED");
        } else {
            System.out.println("Test case for input \"" + input + "\": FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }
    
    private static String nestedIntegerToString(NestedInteger ni) {
        if (ni.isInteger()) {
            return ni.getInteger().toString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            List<NestedInteger> list = ni.getList();
            for (int i = 0; i < list.size(); i++) {
                if (i > 0) {
                    sb.append(",");
                }
                sb.append(nestedIntegerToString(list.get(i)));
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
