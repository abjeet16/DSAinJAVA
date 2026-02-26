package strivers.stackAndQueue.easy;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/// 496. Next Greater Element I
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = nums2.length-1;i>=0;i--){
            while (!st.isEmpty()&&st.peek()<=nums2[i])st.pop();
            int greater = -1;
            if (!st.isEmpty())greater = st.peek();
            map.put(nums2[i],greater);
            st.push(nums2[i]);
        }
        for (int i = 0 ; i < nums1.length ; i++){
            nums1[i] = map.get(nums1[i]);
        }
        return nums1;
    }
}
