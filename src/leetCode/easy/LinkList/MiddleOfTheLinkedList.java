package leetCode.easy.LinkList;

/// 876. Middle of the Linked List
public class MiddleOfTheLinkedList {
    class ListNode {
        int data;
        ListNode next;
    }
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
