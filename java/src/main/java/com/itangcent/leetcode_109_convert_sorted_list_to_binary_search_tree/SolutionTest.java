package com.itangcent.leetcode_109_convert_sorted_list_to_binary_search_tree;

/**
 * Test class for the solution to LeetCode problem #109: convert-sorted-list-to-binary-search-tree
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #109: convert-sorted-list-to-binary-search-tree");
        
        // Test case 1: Empty list
        ListNode emptyList = null;
        TreeNode result1 = solution.sortedListToBST(emptyList);
        System.out.println("Test case 1 (Empty list): " + (result1 == null ? "PASSED" : "FAILED"));
        
        // Test case 2: Single node
        ListNode singleNode = createLinkedList(new int[]{1});
        TreeNode result2 = solution.sortedListToBST(singleNode);
        System.out.println("Test case 2 (Single node): " + (isValidBST(result2) ? "PASSED" : "FAILED"));
        
        // Test case 3: Two nodes
        ListNode twoNodes = createLinkedList(new int[]{1, 2});
        TreeNode result3 = solution.sortedListToBST(twoNodes);
        System.out.println("Test case 3 (Two nodes): " + (isValidBST(result3) ? "PASSED" : "FAILED"));
        
        // Test case 4: Three nodes
        ListNode threeNodes = createLinkedList(new int[]{1, 2, 3});
        TreeNode result4 = solution.sortedListToBST(threeNodes);
        System.out.println("Test case 4 (Three nodes): " + (isValidBST(result4) ? "PASSED" : "FAILED"));
        
        // Test case 5: Multiple nodes
        ListNode multipleNodes = createLinkedList(new int[]{-10, -3, 0, 5, 9});
        TreeNode result5 = solution.sortedListToBST(multipleNodes);
        System.out.println("Test case 5 (Multiple nodes): " + (isValidBST(result5) ? "PASSED" : "FAILED"));
    }
    
    private static ListNode createLinkedList(int[] values) {
        if (values == null || values.length == 0) {
            return null;
        }
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }
    
    private static boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    private static boolean isValidBSTHelper(TreeNode node, int min, int max) {
        if (node == null) {
            return true;
        }
        
        // Check if current node's value is within valid range
        if (node.val <= min || node.val >= max) {
            return false;
        }
        
        // Recursively check left and right subtrees
        return isValidBSTHelper(node.left, min, node.val) && 
               isValidBSTHelper(node.right, node.val, max);
    }
}
