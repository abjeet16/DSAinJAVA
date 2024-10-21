package leetCode;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // Dummy node to form the result linked list
        ListNode dummyNode = new ListNode(0);
        ListNode p = l1, q = l2, current = dummyNode;
        int carry = 0;

        // Traverse both linked lists
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;

            // Update carry for next calculation
            carry = sum / 10;

            // Create a new node with the sum's remainder
            current.next = new ListNode(sum % 10);

            // Move to the next nodes
            current = current.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }

        // If carry is left over at the end
        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        // Return the result list (skip the dummy head)
        return dummyNode.next;
    }

    // Helper method to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            node = node.next;
            if (node != null) {
                System.out.print(" -> ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create the first number: 342 (stored as 2 -> 4 -> 3)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create the second number: 465 (stored as 5 -> 6 -> 4)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        AddTwoNumbers solution = new AddTwoNumbers();

        // Add the two numbers
        ListNode result = solution.addTwoNumbers(l1, l2);

        // Print the result (should be 807, stored as 7 -> 0 -> 8)
        System.out.print("Sum: ");
        printList(result);
    }
}

