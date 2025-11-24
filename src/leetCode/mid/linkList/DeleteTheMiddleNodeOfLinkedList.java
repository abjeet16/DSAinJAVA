package leetCode.mid.linkList;

import leetCode.easy.LinkList.MiddleOfTheLinkedList;

/// 2095. Delete the Middle Node of a Linked List
public class DeleteTheMiddleNodeOfLinkedList {
    class ListNode {
        int data;
        ListNode next;
    }
    public ListNode deleteMiddle(ListNode head) {
        if (head.next==null)
            return null;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while (fast!=null&&fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
