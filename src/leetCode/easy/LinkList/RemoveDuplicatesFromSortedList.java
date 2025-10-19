package leetCode.easy.LinkList;

//83. Remove Duplicates from Sorted List
public class RemoveDuplicatesFromSortedList {
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }ListNode(int val,ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode curr = head;

        while(curr.next!=null){
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
