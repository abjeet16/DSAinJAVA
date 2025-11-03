package leetCode.mid.linkList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/// 3217. Delete Nodes From Linked List Present in Array
public class DeleteNodesFromLinkedListPresentInArray {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int ele : nums)
            set.add(ele);
        while (set.contains(head.val)){
            head = head.next;
        }
        ListNode temp = head;
        while (temp.next!=null){
            if (set.contains(temp.next.val)){
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return head;
    }
}
