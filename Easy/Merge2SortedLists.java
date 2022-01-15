/* You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.*/

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

// recursion
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}

// using references
class Solution1 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode headNode = new ListNode(0);
        ListNode mergeList = headNode;
        while(list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                mergeList.next = list1;
                list1 = list1.next;
            }
            else {
                mergeList.next = list2;
                list2 = list2.next;
            }
            mergeList = mergeList.next;
        }
        if (list1 != null) {
            mergeList.next = list1;
        }
        else if (list2 != null) {
            mergeList.next = list2;
        }
        return headNode.next;
    }
}
