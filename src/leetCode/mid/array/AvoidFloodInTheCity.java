package leetCode.mid.array;

import java.util.*;

public class AvoidFloodInTheCity {
    public static int[] avoidFlood(int[] rains) {
        HashMap<Integer,Integer> DayIndex = new HashMap<>();
        List<Integer> dryDays = new ArrayList<>();
        for (int  i = 0 ; i < rains.length ; i ++){
            System.out.println(DayIndex);
            if (rains[i]==0) {
                dryDays.add(i);
                rains[i] = 1;
            }
            else {
                if (DayIndex.containsKey(rains[i])){
                    if (dryDays.isEmpty())
                        return new int[0];
                    //int dryingDay = searchDayToDry(dryDays,i);
                    DayIndex.remove(rains[i]);
                    rains[dryDays.getFirst()] = rains[i];
                    rains[i] = -1;
                    dryDays.removeFirst();
                }else {
                    DayIndex.put(rains[i],i);
                    rains[i] = -1;
                }
            }
        }
        return rains;
    }

    private static int searchDayToDry(List<Integer> dryDays, int i) {
        int left = 0 , right = dryDays.size(),res = -1;
        while (left<=right){
            int mid = (left+right)/2;
            if (mid > i){
                res = mid;
                right = mid -1;
            }else {
                left = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> arr1 = Arrays.asList(0,1,3,4,5,6);
        System.out.println(searchDayToDry(arr1,1));
        int[] arr = {1,2,0,0,2,1};
        System.out.println(Arrays.toString(avoidFlood(arr)));
    }
}
