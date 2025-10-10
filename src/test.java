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
        /*
        //List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));
        CopyOnWriteArrayList<String> list = new CopyOnWriteArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F"));

        for (String lang : list) {
            list.remove(lang);  // ❌ Will almost always throw ConcurrentModificationException here
        }*/
        /*Iterator<String> it = list.iterator();
        while (it.hasNext()){
            if (it.next().equals("A"))
                it.remove();
        }*/
        /*for (String el:list)
            list.remove(el);
        System.out.println(list);*/

        /*Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        });

        t1.start();
        t2.start();*/

        /*Runable obj = new Runable();
        Thread t = new Thread(obj);
        t.start();*/

        /*Thread t1 = new MyThread(); // NEW
        System.out.println("State: " + t1.getState()); // NEW
        t1.start(); // RUNNABLE
        System.out.println("State after start: " + t1.getState()); // RUNNABLE or RUNNING*/
        //ArrayList<Integer> list = new ArrayList<>(List.of(1,2,3,46,7));
        /*try {
            int a=6/0;
        } catch (Exception e){
            throw new Exception("asca");
        }*/

        try {
            throw new CustomException("simply");
        }catch (CustomException e){
            System.out.println(e.getMessage());
        }
    }
    static class CustomException extends Exception{
        CustomException(String message){
            super(message);
        }
    }
    static class Runable implements Runnable{
        public void run() {
            for (int i = 0 ; i < 5 ; i++){
                System.out.println(i);
            }
        }
    }
    static class MyThread extends Thread {
        public void run() {
            System.out.println("Running...");
            try {
                Thread.sleep(500); // moves to Timed Waiting
            } catch (InterruptedException e) {}
            System.out.println("Finished.");
        }
    }












    public int alternatingSum(int[] nums) {
        int res = nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            if (i%2==0)
                res+=nums[i];
            else
                res-=nums[i];
        }
        return res;
    }
}
