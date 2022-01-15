/* Problem:
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node. */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

// Intuitive Solution
class Solution2 {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode curNode = head;
        int count = 0;
        while (curNode != null) {
            curNode = curNode.next;
            count++;
        }
        int middle = count / 2;
        ListNode middleNode = head;
        for (int i = 0; i < middle; i++) {
            middleNode = middleNode.next;
        }
        return middleNode;
    }
}

// Smart simple solution
class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode doublefast = head;
        ListNode slow = head;
        while (doublefast != null && doublefast.next != null) {
            doublefast = doublefast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

