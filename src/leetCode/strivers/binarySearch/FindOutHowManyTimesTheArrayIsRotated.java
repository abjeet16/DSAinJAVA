package leetCode.strivers.binarySearch;

import java.util.ArrayList;

public class FindOutHowManyTimesTheArrayIsRotated {
    public static int findKRotation(ArrayList<Integer> nums) {
        int left = 0 , right = nums.size()-1;
        int res = 0;
        while (left<=right){
            int mid = (left+right)/2;
            if (nums.get(left)<nums.get(right)){
                return left;
            }
            if (nums.get(left)<nums.get(mid)){
                if (nums.get(left)<=nums.get(res))
                    res = left;
                left = mid+1;
            }else {
                if (nums.get(mid)<nums.get(res))
                    res = mid;
                right = mid-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {3, 4, 5, 1, 2};
        for (int i : arr)
            list.add(i);
        //4, 5, 6, 7, 0, 1, 2, 3
        System.out.println(findKRotation(list));
    }
}
