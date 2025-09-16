package QSpider.Practice;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,5,6,7,8,9));
        list.add(8);
        list.add(9);

        Set<Integer> set = new LinkedHashSet<>(Set.of(1,2,3,4,5,6));
        set.add(7);

        Queue<Integer> queue = new LinkedList<>(List.of(1,2,3,4,5,6));
        queue.add(7);

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(5);
        deque.addLast(7);

        Map<Integer,String> map= new HashMap<>();
        map.put(1,"one");
        map.put(2,"two");
    }
}
