package geeksForGeeks.linkedList.mid;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class PairSumInDoublyLinkedList {
    class Node {
        int data;
        Node next,prev;

        Node(int x){
            data = x;
            next = null;
            prev = null;
        }
    }
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target, Node head) {
        Node last = head;
        Node start = head;
        while(last.next!=null)
            last = last.next;
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        while(last!=start){
            int sum = last.data + start.data;
            if(sum == target){
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(start.data);
                pair.add(last.data);
                res.add(pair);
                start = start.next;
                if (start==last)
                    break;
                last = last.prev;
            }else if (sum>target){
                last = last.prev;
            }else {
                start = start.next;
            }
        }
        return res;
    }
}
