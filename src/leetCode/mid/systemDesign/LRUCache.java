package leetCode.mid.systemDesign;

import java.util.Arrays;
import java.util.HashMap;

/// 146. LRU Cache
class LRUCache {
    private int[] useage = new int[3001];
    private int capacity;
    HashMap<Integer,Integer> map = new HashMap<>();
    public LRUCache(int capacity) {
        Arrays.fill(useage,-1);
        this.capacity = capacity;
    }

    public int get(int key) {
        if (map.containsKey(key)){
            useage[key]++;
            return map.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
        System.out.println(map);
        if (map.size()==capacity){
            int toRemove = getLRU(useage);
            map.remove(toRemove);
        }else {
            useage[key]=0;
        }
        map.put(key,value);
    }

    private int getLRU(int[] useage) {
        System.out.println(Arrays.toString(useage));
        int least = -1;
        for (int i = 0 ; i < useage.length ; i++){
            if (least==-1&&useage[i]!=-1){
                least=i;
            } else if (least!=-1&&useage[i]!=-1&&useage[least]>useage[i]) {
                least=i;
            }
        }
        useage[least]=-1;
        return least;
    }
}
