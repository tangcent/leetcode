package com.itangcent.leetcode_493_reverse_pairs;


/*
 * @lc app=leetcode id=493 lang=java
 *
 * [493] Reverse Pairs
 */

// @lc code=start
class SolutionB {
    public int reversePairs(int[] nums) {
        dutyVal = Long.MAX_VALUE;

        int result = 0;
        Node head = new Node(Long.MAX_VALUE, null, null);
        for (int i = nums.length - 1; i >= 0; i--) {
            long num = nums[i];
            Node p = head;
            while (p.next != null) {
                Node next = p.next;
                if (num > next.val) {
                    refresh(next);
                    result += next.cnt;
                    break;
                }
                p = next;
            }
            num = num * 2;
            p = head;
            while (p.next != null) {
                Node next = p.next;
                if (num > next.val) {
                    break;
                }
                p = next;
            }
            if (p.val == num) {
                p.incr();
            } else {
                Node next = p.next;
                Node newNode = new Node(num, p, next);
                p.next = newNode;
                if (next != null) {
                    newNode.cnt = next.cnt;
                    next.pre = newNode;
                }
            }
            dutyVal = Long.min(dutyVal, num);
        }
        return result;
    }

    private void refresh(Node node) {
        if (node.val < dutyVal) {
            return;
        }
        Node p = node;
        while (p.val != dutyVal) {
            p = p.next;
        }
        int dalt = 0;
        while (p.val <= node.val) {
            if (p.dalt != 0) {
                dalt += p.dalt;
                p.dalt = 0;
            }
            p.cnt += dalt;
            p = p.pre;
        }
        p.incr(dalt);
        dutyVal = p.val;
    }


    long dutyVal = Long.MAX_VALUE;

    static class Node {
        long val;
        int cnt;
        int dalt;
        Node pre;
        Node next;

        public Node(long val, Node pre, Node next) {
            this.val = val;
            this.cnt = 0;
            this.pre = pre;
            this.next = next;
            this.dalt = 1;
        }

        void incr() {
            ++dalt;
        }

        void incr(int num) {
            this.dalt += num;
        }
    }
}
// @lc code=end

