package com.itangcent.leetcode_37_sudoku_solver;
/*
 * @lc app=leetcode id=37 lang=java
 *
 * [37] Sudoku Solver
 */

import java.util.*;

// @lc code=start
class Solution {

    private static final List<Integer> values = Arrays.asList(
            1, 2, 4, 8, 16, 32, 64, 128, 256
    );

    private static final Set<Integer> exactValues = new HashSet<>(values);

    public void solveSudoku(char[][] board) {
        solveSudokuWithConstriction(board);
        if (isSolved(board)) {
            return;
        }
        backtrack(board);
    }

    public void backtrack(char[][] board) {
        int[] pos = new int[]{-1, -1};
        findEmptyCell(board, pos);
        if (pos[0] == -1) {
            return;
        }
        for (int i = 1; i <= 9; i++) {
            if (isValid(board, pos[0], pos[1], (char) (i + '0'))) {
                board[pos[0]][pos[1]] = (char) (i + '0');
                backtrack(board);
                if (isSolved(board)) {
                    return;
                }
                board[pos[0]][pos[1]] = '.';
            }
        }
    }

    private boolean isValid(char[][] board, int row, int col, char num) {
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == num ||
                    board[i][col] == num ||
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == num) {
                return false;
            }
        }
        return true;
    }

    private void findEmptyCell(char[][] board, int[] pos) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    pos[0] = i;
                    pos[1] = j;
                    return;
                }
            }
        }
    }

    public void solveSudokuWithConstriction(char[][] board) {
        Group[] rows = new Group[9];
        Group[] cols = new Group[9];
        Group[] boxes = new Group[9];
        Group[] groups = new Group[27];

        for (int i = 0; i < 9; i++) {
            Group row = new Group();
            Group col = new Group();
            Group box = new Group();
            rows[i] = row;
            cols[i] = col;
            boxes[i] = box;
            groups[i] = row;
            groups[i + 9] = col;
            groups[i + 18] = box;
        }

        Node[][] nodes = new Node[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Node node = new Node();
                nodes[i][j] = node;
                node.setGroups(new Group[]{rows[i], cols[j], boxes[(i / 3) * 3 + j / 3]});
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    nodes[i][j].setRawValue(board[i][j] - '0');
                }
            }
        }

        boolean changed;
        while (true) {
            changed = false;
            for (Group group : groups) {
                if (group.isFull()) {
                    continue;
                }
                for (int n : group.rest) {
                    Node condicate = null;
                    for (Node node : group.nodes) {
                        if (node.isPossible(n)) {
                            if (condicate != null) {
                                condicate = null;
                                break;
                            } else {
                                condicate = node;
                            }
                        }
                    }
                    if (condicate != null) {
                        changed = true;
                        condicate.setValue(n);
                        break;
                    }
                }
            }
            if (!changed) {
                break;
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (nodes[i][j].exact) {
                    board[i][j] = (char) (nodes[i][j].getRawValue() + '0');
                }
            }
        }
    }

    private boolean isSolved(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '.') {
                    return false;
                }
            }
        }
        return true;
    }

    private class Group {
        List<Integer> rest = new ArrayList<>(values);
        List<Node> nodes = new ArrayList<>();

        boolean isFull() {
            return rest.isEmpty();
        }

        void addNode(Node node) {
            nodes.add(node);
        }

        void removeValue(int value) {
            rest.remove((Integer) value);
            for (Node node : nodes) {
                if (node.value != value) {
                    node.removeValue(value);
                }
            }
        }
    }

    private class Node {
        boolean exact = false;

        int value = 0b111111111;

        Group[] groups = new Group[3];

        void setRawValue(int value) {
            setValue(1 << (value - 1));
        }

        void setValue(int value) {
            this.value = value;
            exact = true;
            for (Group group : groups) {
                group.removeValue(value);
            }
        }

        void setGroups(Group[] groups) {
            this.groups = groups;
            for (Group group : groups) {
                group.addNode(this);
            }
        }

        void removeValue(int value) {
            if (exact) {
                return;
            }
            this.value = this.value & ~value;
            if (exactValues.contains(this.value)) {
                setValue(this.value);
            }
        }

        int getRawValue() {
            if (exact) {
                return values.indexOf(value) + 1;
            }
            return 0;
        }

        boolean isPossible(int value) {
            return (value & this.value) != 0;
        }
    }
}
// @lc code=end