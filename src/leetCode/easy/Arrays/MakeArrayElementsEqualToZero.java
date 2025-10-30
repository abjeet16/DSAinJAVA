package leetCode.easy.Arrays;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/// 3354. Make Array Elements Equal to Zero
public class MakeArrayElementsEqualToZero {
    public static int countValidSelections(int[] nums) {
        int res = 0;
        int len = nums.length;
        for (int i = 0 ; i < len ; i++){
            if (nums[i]==0) {
                res += isPossible(nums.clone(), i , true) ? 1 : 0;
                res += isPossible(nums.clone(), i , false) ? 1 : 0;
            }
        }
        return res;
    }

    private static boolean isPossible(int[] nums, int curr, boolean goingRight) {
        int len = nums.length;
        while (curr>-1 && curr < len){
            if (nums[curr]==0) {
                if (goingRight)
                    curr++;
                else
                    curr--;
                continue;
            }
            nums[curr]--;
            if (goingRight){
                curr--;
            }else {
                curr++;
            }
            goingRight=!goingRight;
        }
        for (int ele : nums){
            if (ele!=0)
                return false;
        }
        return true;
    }

    public static int countValidSelectionsPreFix(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[] left = new int[n];
        int[] right = new int[n];

        // Build left[] as prefix sum
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }

        // Build right[] as suffix sum
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));

        // Check valid selections
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) continue;

            if (left[i] == right[i]) {
                count += 2;
            } else if (Math.abs(left[i] - right[i]) == 1) {
                count += 1;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3};
        System.out.println(countValidSelectionsPreFix(arr));
    }
}
