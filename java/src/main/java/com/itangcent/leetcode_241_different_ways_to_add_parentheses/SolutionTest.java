package com.itangcent.leetcode_241_different_ways_to_add_parentheses;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
//
        // Test case 1: Simple addition
        testCase(solution, "2+3", "Test case for 2+3: [5]");

        // Test case 2: Multiple operations
        testCase(solution, "2*3-4*5", "Test case for 2*3-4*5: [-34, -10, -14, -10, 10]");

        // Test case 3: Single number
        testCase(solution, "15", "Test case for 15: [15]");

        // Test case 4: Multi-digit numbers
        testCase(solution, "10+20", "Test case for 10+20: [30]");
        testCase(solution, "99-50", "Test case for 99-50: [49]");
        testCase(solution, "5*10+2", "Test case for 5*10+2: [52, 60]");
        
        // Test case 5: Complex expression with mixed digits
        testCase(solution, "2+30*4-5", "Test case for 2+30*4-5: [-28, -32, 117, 117, 123]");
    }

    private static void testCase(Solution solution, String input, String expectedOutput) {
        List<Integer> actual = solution.diffWaysToCompute(input);
        List<Integer> expected = parseExpectedOutput(expectedOutput);
        
        Collections.sort(actual);
        Collections.sort(expected);
        
        String actualOutput = "Test case for " + input + ": " + actual;
        if (actual.equals(expected)) {
            System.out.println(actualOutput + ": PASSED");
        } else {
            System.out.println(actualOutput + ": FAILED");
            System.out.println("Expected: " + expected);
        }
    }

    private static List<Integer> parseExpectedOutput(String expectedOutput) {
        // Extract the list part from the expected output string
        String listStr = expectedOutput.substring(expectedOutput.indexOf('['));
        return Arrays.stream(listStr.replaceAll("[\\[\\]]", "").split(", "))
                   .map(Integer::parseInt)
                   .collect(Collectors.toList());
    }
}
