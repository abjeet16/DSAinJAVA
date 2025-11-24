package HackerRank.easy.linklist;

public class PrintTheElementsOfLinkedList {
    class SinglyLinkedListNode {
        int data;
        SinglyLinkedListNode next;
    }
    static void printLinkedList(SinglyLinkedListNode head) {
        while(head!=null){
            System.out.println(head.data);
            head = head.next;
        }
    }
}
