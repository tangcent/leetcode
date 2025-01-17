package com.itangcent.leetcode_427_construct_quad_tree;


/*
 * @lc app=leetcode id=427 lang=java
 *
 * [427] Construct Quad Tree
 */

// @lc code=start
/*
// Definition for a QuadTree node.
class Node {
    public boolean val;
    public boolean isLeaf;
    public Node topLeft;
    public Node topRight;
    public Node bottomLeft;
    public Node bottomRight;

    
    public Node() {
        this.val = false;
        this.isLeaf = false;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = null;
        this.topRight = null;
        this.bottomLeft = null;
        this.bottomRight = null;
    }
    
    public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
        this.val = val;
        this.isLeaf = isLeaf;
        this.topLeft = topLeft;
        this.topRight = topRight;
        this.bottomLeft = bottomLeft;
        this.bottomRight = bottomRight;
    }
}
*/

class Solution {
    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length);
    }


    public Node construct(int[][] grid, int x, int y, int length) {
        if (length == 1) {
            return new Node(
                    grid[x][y] == 1,
                    true
            );
        }
        int subLength = length / 2;
        Node topLeft = construct(grid, x, y, subLength);
        Node topRight = construct(grid, x, y + subLength, subLength);
        Node bottomLeft = construct(grid, x + subLength, y, subLength);
        Node bottomRight = construct(grid, x + subLength, y + subLength, subLength);
        if (canCombine(topLeft, topRight, bottomLeft, bottomRight)) {
            return new Node(topLeft.val, true);
        }
        
        // For a non-leaf node, val should be true if it represents a node with all 1's
        // or false otherwise, but it doesn't matter since isLeaf is false
        return new Node(false, false, topLeft, topRight, bottomLeft, bottomRight);
    }

    private boolean canCombine(Node n1, Node n2, Node n3, Node n4) {
        return n1.isLeaf && n2.isLeaf && n3.isLeaf && n4.isLeaf
                && n1.val == n2.val && n1.val == n3.val && n1.val == n4.val;

    }
}
// @lc code=end

