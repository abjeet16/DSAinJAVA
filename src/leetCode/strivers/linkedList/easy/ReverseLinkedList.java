package leetCode.strivers.linkedList.easy;

import leetCode.strivers.linkedList.mid.AddTwoNumbers;

/// 206. Reverse Linked List
/// TODO
public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;


        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseList(ListNode head) {
        // Base case: if list is empty or has only one node
        if (head == null || head.next == null)
            return head;

        // Recursively reverse the rest of the list
        ListNode newHead = reverseList(head.next);

        // Store reference to next node
        ListNode front = head.next;

        // Make the next node point to current node
        front.next = head;

        // Break original forward link
        head.next = null;

        // Return new head of reversed list
        return newHead;
    }
}
