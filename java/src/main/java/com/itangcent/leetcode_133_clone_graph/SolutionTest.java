package com.itangcent.leetcode_133_clone_graph;

/**
 * Test class for the solution to LeetCode problem #133: clone-graph
 */
public class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        System.out.println("Running tests for LeetCode problem #133: clone-graph");
        
        // Test Case 1: Empty graph (null input)
        Node result1 = solution.cloneGraph(null);
        System.out.println("Test case for empty graph: " + (result1 == null ? "PASSED" : "FAILED"));
        
        // Test Case 2: Single node graph
        Node singleNode = new Node(1);
        Node result2 = solution.cloneGraph(singleNode);
        System.out.println("Test case for single node: " + 
            (result2 != null && result2.val == 1 && result2.neighbors.isEmpty() ? "PASSED" : "FAILED"));
        
        // Test Case 3: Two connected nodes
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        node1.neighbors.add(node2);
        node2.neighbors.add(node1);
        Node result3 = solution.cloneGraph(node1);
        boolean test3Passed = result3 != null && 
                            result3.val == 1 && 
                            result3.neighbors.size() == 1 &&
                            result3.neighbors.get(0).val == 2 &&
                            result3.neighbors.get(0).neighbors.get(0) == result3;
        System.out.println("Test case for two connected nodes: " + (test3Passed ? "PASSED" : "FAILED"));
        
        // Test Case 4: Cycle of 4 nodes (LeetCode example)
        Node[] nodes = createCyclicGraph();
        Node result4 = solution.cloneGraph(nodes[0]);
        boolean test4Passed = verifyClonedGraph(result4, nodes[0]);
        System.out.println("Test case for cyclic graph of 4 nodes: " + (test4Passed ? "PASSED" : "FAILED"));
    }
    
    // Helper method to create a cyclic graph of 4 nodes
    private static Node[] createCyclicGraph() {
        Node[] nodes = new Node[4];
        for (int i = 0; i < 4; i++) {
            nodes[i] = new Node(i + 1);
        }
        // Connect nodes in a cycle: 1-2-3-4-1
        nodes[0].neighbors.add(nodes[1]);
        nodes[0].neighbors.add(nodes[3]);
        nodes[1].neighbors.add(nodes[0]);
        nodes[1].neighbors.add(nodes[2]);
        nodes[2].neighbors.add(nodes[1]);
        nodes[2].neighbors.add(nodes[3]);
        nodes[3].neighbors.add(nodes[2]);
        nodes[3].neighbors.add(nodes[0]);
        return nodes;
    }
    
    // Helper method to verify if the cloned graph is correct
    private static boolean verifyClonedGraph(Node cloned, Node original) {
        if (cloned == null || original == null) return false;
        if (cloned == original) return false; // Should be a deep copy
        if (cloned.val != original.val) return false;
        if (cloned.neighbors.size() != original.neighbors.size()) return false;
        
        // Verify neighbors
        for (int i = 0; i < original.neighbors.size(); i++) {
            Node originalNeighbor = original.neighbors.get(i);
            Node clonedNeighbor = cloned.neighbors.get(i);
            if (clonedNeighbor.val != originalNeighbor.val) return false;
        }
        return true;
    }
}
