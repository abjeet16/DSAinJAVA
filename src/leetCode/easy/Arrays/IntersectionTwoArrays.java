package leetCode.easy.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        List<Integer> list = new ArrayList<>();
        while (i!= nums1.length&&j!= nums2.length){
            if (nums1[i]==nums2[j]) {
                list.add(nums1[i]);
                i++;j++;
                while (i!= nums1.length&&nums1[i]==nums1[i-1]) {
                    i++;
                }
                while (j!= nums2.length&&nums2[j]==nums2[j-1]) {
                    j++;
                }
            } else if (nums1[i]<nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        int [] ans = new int[list.size()];
        for (int k = 0 ; k < list.size() ; k++)
            ans[k] = list.get(k);
        return ans;
    }
    public int[] intersectionSet(int[] nums1, int[] nums2){
        List<Integer> anslist = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int item : nums1)
            set.add(item);
        for (int i : nums2)
            if (set.contains(i)) {
                set.remove(i);
                anslist.add(i);
            }
        int[] ans = new int[anslist.size()];
        for (int i = 0 ; i < anslist.size();i++){
            ans[i] = anslist.get(i);
        }
        return ans;
    }

    //Best for if values in array are below 1000 and above 0
    public int[] intersectionWithoutSetAndSort(int[] nums1, int[] nums2){
        boolean[] flag = new boolean[1001];
        for (int i : nums1)
            flag[i] = true;
        int ansSize = 0;
        List<Integer> anslist = new ArrayList<>();
        for (int i : nums2)
            if (flag[i]){
                anslist.add(i);
                flag[i] = false;
            }
        int[] ans = new int[anslist.size()];
        for (int i = 0 ; i < anslist.size();i++){
            ans[i] = anslist.get(i);
        }
        return ans;
    }
}
