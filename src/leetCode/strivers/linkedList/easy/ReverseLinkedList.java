package leetCode.strivers.linkedList.easy;

import leetCode.strivers.linkedList.mid.AddTwoNumbers;

/// 206. Reverse Linked List TODO
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
        if (head==null){
            return null;
        }
        reverseList(head.next);
        System.out.print(head.val+" - > ");
        return head;
    }
}
