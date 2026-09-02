package com.itangcent.leetcode_116_populating_next_right_pointers_in_each_node;

/**
 * Test class for the solution to LeetCode problem #116: populating-next-right-pointers-in-each-node
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #116: populating-next-right-pointers-in-each-node");
        
        // Test case 1: Empty tree
        Node emptyTree = null;
        Node result1 = solution.connect(emptyTree);
        System.out.println("Test case 1 (Empty tree): " + (result1 == null ? "PASSED" : "FAILED"));
        
        // Test case 2: Single node
        Node singleNode = new Node(1);
        Node result2 = solution.connect(singleNode);
        System.out.println("Test case 2 (Single node): " + (result2.next == null ? "PASSED" : "FAILED"));
        
        // Test case 3: Perfect binary tree with height 2
        Node root3 = new Node(1);
        root3.left = new Node(2);
        root3.right = new Node(3);
        Node result3 = solution.connect(root3);
        boolean test3 = result3.next == null && 
                       result3.left.next == result3.right && 
                       result3.right.next == null;
        System.out.println("Test case 3 (Height 2): " + (test3 ? "PASSED" : "FAILED"));
        
        // Test case 4: Perfect binary tree with height 3
        Node root4 = new Node(1);
        root4.left = new Node(2);
        root4.right = new Node(3);
        root4.left.left = new Node(4);
        root4.left.right = new Node(5);
        root4.right.left = new Node(6);
        root4.right.right = new Node(7);
        Node result4 = solution.connect(root4);
        boolean test4 = result4.next == null && 
                       result4.left.next == result4.right && 
                       result4.right.next == null &&
                       result4.left.left.next == result4.left.right &&
                       result4.left.right.next == result4.right.left &&
                       result4.right.left.next == result4.right.right &&
                       result4.right.right.next == null;
        System.out.println("Test case 4 (Height 3): " + (test4 ? "PASSED" : "FAILED"));
    }
}
