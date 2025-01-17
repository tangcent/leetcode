package com.itangcent.leetcode_138_copy_list_with_random_pointer;

/**
 * Test class for the solution to LeetCode problem #138: copy-list-with-random-pointer
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #138: copy-list-with-random-pointer");
        
        // Test Case 1: Example from LeetCode - [[7,null],[13,0],[11,4],[10,2],[1,0]]
        runTestCase(solution, "Test Case 1", createTestCase1());
        
        // Test Case 2: Example from LeetCode - [[1,1],[2,1]]
        runTestCase(solution, "Test Case 2", createTestCase2());
        
        // Test Case 3: Example from LeetCode - [[3,null],[3,0],[3,null]]
        runTestCase(solution, "Test Case 3", createTestCase3());
        
        // Test Case 4: Empty list
        runTestCase(solution, "Test Case 4 (Empty List)", null);
        
        // Test Case 5: Single node without random pointer
        runTestCase(solution, "Test Case 5 (Single Node)", createTestCase5());
        
        // Test Case 6: Complex case with circular random pointers
        runTestCase(solution, "Test Case 6 (Circular Random Pointers)", createTestCase6());
    }
    
    // Helper method to run test cases
    private static void runTestCase(Solution solution, String caseName, Node head) {
        System.out.println("------------------");
        System.out.println("Running " + caseName);
        printList(head);
        
        Node result = solution.copyRandomList(head);
        
        // Verify that the copy is correct
        boolean passed = verifyDeepCopy(head, result);
        
        System.out.println("Test case for " + caseName + ": " + (passed ? "PASSED" : "FAILED"));
        printList(result);
        System.out.println();
    }
    
    // Helper method to create a linked list from an array
    private static Node createTestCase1() {
        // [[7,null],[13,0],[11,4],[10,2],[1,0]]
        Node n1 = new Node(7);
        Node n2 = new Node(13);
        Node n3 = new Node(11);
        Node n4 = new Node(10);
        Node n5 = new Node(1);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        
        n1.random = null;
        n2.random = n1;    // 13's random points to 7
        n3.random = n5;    // 11's random points to 1
        n4.random = n3;    // 10's random points to 11
        n5.random = n1;    // 1's random points to 7
        
        return n1;
    }
    
    private static Node createTestCase2() {
        // [[1,1],[2,1]]
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        
        n1.next = n2;
        
        n1.random = n1;    // 1's random points to itself
        n2.random = n1;    // 2's random points to 1
        
        return n1;
    }
    
    private static Node createTestCase3() {
        // [[3,null],[3,0],[3,null]]
        Node n1 = new Node(3);
        Node n2 = new Node(3);
        Node n3 = new Node(3);
        
        n1.next = n2;
        n2.next = n3;
        
        n1.random = null;
        n2.random = n1;    // Second 3's random points to first 3
        n3.random = null;
        
        return n1;
    }
    
    private static Node createTestCase5() {
        // Single node
        return new Node(5);
    }
    
    private static Node createTestCase6() {
        // Complex case with circular random pointers
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        
        // Create circular random pointers
        n1.random = n3;    // 1 points to 3
        n2.random = n4;    // 2 points to 4
        n3.random = n2;    // 3 points to 2
        n4.random = n1;    // 4 points to 1
        
        return n1;
    }
    
    // Helper method to print a linked list
    private static void printList(Node head) {
        if (head == null) {
            System.out.println("List: []");
            return;
        }
        
        StringBuilder sb = new StringBuilder("List: [");
        Node curr = head;
        while (curr != null) {
            sb.append("[").append(curr.val).append(",");
            if (curr.random == null) {
                sb.append("null");
            } else {
                // Find the position of the random node
                Node temp = head;
                int pos = 0;
                while (temp != null && temp != curr.random) {
                    pos++;
                    temp = temp.next;
                }
                sb.append(temp != null ? pos : "?");
            }
            sb.append("]");
            
            curr = curr.next;
            if (curr != null) {
                sb.append(",");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }
    
    // Verify that the copy is a deep copy and has the same structure
    private static boolean verifyDeepCopy(Node original, Node copy) {
        if (original == null && copy == null) {
            return true;
        }
        
        if (original == null || copy == null) {
            return false;
        }
        
        // Check that they're not the same object (deep copy)
        if (original == copy) {
            System.out.println("Failed: Original and copy are the same object");
            return false;
        }
        
        Node origCurr = original;
        Node copyCurr = copy;
        
        // Map to track the corresponding nodes in the original and copy lists
        java.util.Map<Node, Node> nodeMap = new java.util.HashMap<>();
        
        while (origCurr != null && copyCurr != null) {
            // Value should match
            if (origCurr.val != copyCurr.val) {
                System.out.println("Failed: Values don't match - Expected: " + origCurr.val + ", Actual: " + copyCurr.val);
                return false;
            }
            
            // Map original node to its copy
            nodeMap.put(origCurr, copyCurr);
            
            origCurr = origCurr.next;
            copyCurr = copyCurr.next;
        }
        
        // Both lists should end at the same time
        if (origCurr != null || copyCurr != null) {
            System.out.println("Failed: Lists have different lengths");
            return false;
        }
        
        // Now check random pointers
        origCurr = original;
        copyCurr = copy;
        
        while (origCurr != null) {
            if (origCurr.random == null) {
                if (copyCurr.random != null) {
                    System.out.println("Failed: Original random is null but copy random is not");
                    return false;
                }
            } else {
                if (copyCurr.random == null) {
                    System.out.println("Failed: Original random is not null but copy random is");
                    return false;
                }
                
                // The random pointer of the copy should point to the corresponding node in the copy
                Node origRandomNode = origCurr.random;
                Node expectedCopyRandomNode = nodeMap.get(origRandomNode);
                
                if (copyCurr.random != expectedCopyRandomNode) {
                    System.out.println("Failed: Random pointers don't match");
                    return false;
                }
            }
            
            origCurr = origCurr.next;
            copyCurr = copyCurr.next;
        }
        
        return true;
    }
}
