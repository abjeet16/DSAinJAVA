package HackerRank.easy.array;

import java.util.List;

public class LeftRotation {
    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
        int len = arr.size();
        if (d==len)
            return arr;
        rev(arr,0,d-1);
        rev(arr,d,len-1);
        rev(arr,0,len-1);
        return arr;
    }

    private static void rev(List<Integer> arr, int i, int j) {
        while (i<j){
            int temp = arr.get(i);
            arr.set(i,arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
    }
}
