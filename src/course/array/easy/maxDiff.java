package course.array.easy;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class maxDiff {
    public static void main(String[] args) {
        int [] arr = {10,2,8,2,4,9,1,6,8,10};
        answer(arr);
    }

    private static void answer(int[] arr) {
        int diff = arr[1]-arr[0],min = arr[0];
        for (int i = 2;i< arr.length;i++){
            diff = max(diff,arr[i]-min);
            min = min(min,arr[i]);
        }
        System.out.print(diff);
    }
}
