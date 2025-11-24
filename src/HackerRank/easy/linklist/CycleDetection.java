package HackerRank.easy.linklist;

import HackerRank.easy.array.SimpleArraySum;

import java.util.HashSet;

public class CycleDetection {
    class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode slow = head;
        SinglyLinkedListNode fast = head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if (fast==slow)
                return true;
        }
        return false;
    }

    static boolean hasCycleHashing(SinglyLinkedListNode head) {
        HashSet<SinglyLinkedListNode> set = new HashSet<>();
        while (head!=null){
            if (!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
