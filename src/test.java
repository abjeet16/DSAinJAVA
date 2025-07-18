import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.BiFunction;
import java.util.function.Function;

public class test {
    public static void main(String[] args) {
        /*Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate - ignored
        set.add("abjeet");
        set.add(null);   // Allowed once

        System.out.println(set); // Output might be: [null, Java, Python]*/

        /*Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(50);
        pq.offer(10);
        pq.offer(30);
        pq.offer(5);
        pq.offer(100);

        System.out.println(pq);      // [10, 50, 30] (internal structure)
        System.out.println(pq.poll()); // 10 (smallest first)
        System.out.println(pq);        // [30, 50]*/

        /*HashMap<String,String> map = new HashMap<>();
        map.put("FB", "Value1");  // hash = 2236
        map.put("Ea", "Value2");  // hash = 2236 —> same bucket!
        System.out.println(map.get("Ea"));*/

        //List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));

        /*for (String lang : list) {
            list.remove(lang);  // ❌ Will almost always throw ConcurrentModificationException here
        }*/
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if (it.next().equals("A"))
                it.remove();
        }*/
        for (String el:list)
            list.remove(el);
        System.out.println(list);
    }
}
