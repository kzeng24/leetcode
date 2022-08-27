/**

Given the head of a singly linked list, reverse the list, and return the reversed list.

 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
 
class Solution {
    public ListNode reverseList(ListNode head) {
        
        if (head == null) {
            return head;
        }
        ListNode cur = head.next;
        ListNode prev = head;
        head.next = null;
        ListNode next;
        
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
    
        return prev;
        
    }
}

/* Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List. */
