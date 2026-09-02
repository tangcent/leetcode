package com.itangcent.leetcode_58_length_of_last_word;

public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: "Hello World"
        System.out.println("Test case 1: \"Hello World\"");
        String s1 = "Hello World";
        int result1 = solution.lengthOfLastWord(s1);
        System.out.println("Result: " + result1);
        System.out.println();

        // Test case 2: "   fly me   to   the moon  "
        System.out.println("Test case 2: \"   fly me   to   the moon  \"");
        String s2 = "   fly me   to   the moon  ";
        int result2 = solution.lengthOfLastWord(s2);
        System.out.println("Result: " + result2);
        System.out.println();

        // Test case 3: "luffy is still joyboy"
        System.out.println("Test case 3: \"luffy is still joyboy\"");
        String s3 = "luffy is still joyboy";
        int result3 = solution.lengthOfLastWord(s3);
        System.out.println("Result: " + result3);
        System.out.println();

        // Test case 4: "a"
        System.out.println("Test case 4: \"a\"");
        String s4 = "a";
        int result4 = solution.lengthOfLastWord(s4);
        System.out.println("Result: " + result4);
        System.out.println();

        // Test case 5: "a "
        System.out.println("Test case 5: \"a \"");
        String s5 = "a ";
        int result5 = solution.lengthOfLastWord(s5);
        System.out.println("Result: " + result5);
    }
} 