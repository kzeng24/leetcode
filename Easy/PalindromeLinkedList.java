/*Given the head of a singly linked list, return true if it is a palindrome or false otherwise.*/

class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> reverseList = new Stack<Integer>();
        ListNode temp = head;
        while (temp != null) {
            reverseList.push(temp.val);
            temp = temp.next;
        }
        while (head != null) {
            if (head.val != reverseList.pop()) {
                return false;
            }
            head = head.next;
        }
        return true;
    }
}
