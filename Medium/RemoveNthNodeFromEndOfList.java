/**
 Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode counterNode = head;
        while (counterNode.next != null) {
            count++;
            counterNode = counterNode.next;
        }
        int index = count - n;
        
        ListNode copyHead = head;

        for (int i = 0; i <= index; i++) {
            if (index == 0) {
                if (head.next == null) {
                    return null;
                } else {
                    head.val = head.next.val;
                    head.next = head.next.next;
                }
            } else if (i == index - 1){
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
        }
        return copyHead;
    }
}
