package strivers.linkList.mid;

import strivers.linkList.hard.ReverseNodesInKGroup;

/// Flattening a Linked List
public class FlatteningLinkedList {

class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
    public Node flatten(Node root) {
        Node list1 = root;
        Node list2 = root.next;
        while(list2!=null){
            merge(list1,list2);
            list1 = list2;
            list2 = list2.next;
        }
        return root;
    }

    private void merge(Node list1, Node list2) {
        Node res = list1;
        list1 = list1.bottom;
        while (list1!=null&&list2!=null){
            if (list1.data<list2.data){
                res.bottom = list1;
                list1 = list1.bottom;
            }else{
                res.bottom = list2;
                list2 = list2.bottom;
            }
            res = res.bottom;
        }
        if (list1!=null)
            res.bottom = list1;
        if (list2!=null)
            res.bottom = list2;
    }
}
