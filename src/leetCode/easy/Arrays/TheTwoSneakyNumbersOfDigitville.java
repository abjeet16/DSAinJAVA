package leetCode.easy.Arrays;

/// 3289. The Two Sneaky Numbers of Digitville
public class TheTwoSneakyNumbersOfDigitville {
    public int[] getSneakyNumbers(int[] nums) {
        boolean[] count = new boolean[100];
        int[] res = new int[2];
        for (int ele : nums){
            if (count[ele]) {
                if (res[0] == 0)
                    res[0] = ele;
                else {
                    res[1] = ele;
                    break;
                }
            }else {
                count[ele] = true;
            }
        }
        return res;
    }
}
