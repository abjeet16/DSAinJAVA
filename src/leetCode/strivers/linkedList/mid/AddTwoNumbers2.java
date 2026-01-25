package leetCode.strivers.linkedList.mid;

/// 445. Add Two Numbers II
public class AddTwoNumbers2 {
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

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        l1 = rev(l1);
        l2 = rev(l2);
        ListNode res = sum(l1, l2, 0);
        return rev(res);
    }

    private ListNode sum(ListNode l1, ListNode l2, int carry) {
        if (l1==null&&l2==null) {
            if (carry==1){
                ListNode res = new ListNode();
                res.val = 1;
                res.next = null;
                return res;
            }
            return null;
        }
        int sum = carry;
        if (l1!=null)
            sum+=l1.val;
        if(l2!=null)
            sum+=l2.val;
        carry = sum>9?1:0;
        ListNode res = new ListNode();
        res.val = sum%10;
        res.next = sum(l1!=null?l1.next: null,
                l2!=null?l2.next:null, carry);
        return res;
    }

    private ListNode rev(ListNode root){
        ListNode prev = null;
        ListNode temp = root;
        while (temp!=null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    void printLL(ListNode head){
        while (head!=null){
            System.out.print(head.val+" - > ");
            head = head.next;
        }
        System.out.println(" null ");
    }
}
