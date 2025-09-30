package leetCode.mid.array;

import javax.sound.midi.MidiFileFormat;

public class FindTriangularSumOfAnArray {
    public int triangularSum(int[] nums) {
        if (nums.length==1)
            return nums[0];
        int[] newArr = new int[nums.length-1];
        int count = 0 ;
        for (int i = 1; i < nums.length ; i++){
            newArr[count]=(nums[i-1]+nums[i])%10;
            count++;
        }
        return triangularSum(newArr);
    }

    //less space - better
    public int triangularSumLoop(int[] nums) {
        int n = nums.length;
        for (int len = n; len > 1; len--) {
            for (int i = 0; i < len - 1; i++) {
                nums[i] = (nums[i] + nums[i + 1]) % 10;
            }
        }
        return nums[0];
    }
}
