package leetCode.easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        boolean[] flag = new boolean[nums.length+1];
        for (int i = 0 ; i < nums.length; i ++){
            flag[nums[i]]=true;
        }
        for (int i = 1; i < flag.length; i ++){
            if (!flag[i])
                list.add(i);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
