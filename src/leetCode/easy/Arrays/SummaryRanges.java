package leetCode.easy.Arrays;

import javax.sound.midi.MidiFileFormat;
import java.util.ArrayList;
import java.util.List;

public class SummaryRanges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> answer = new ArrayList<>();
        if (nums.length==0){
            return answer;
        }
        if (nums.length==1){
            answer.add(String.valueOf(nums[0]));
            return answer;
        }
        int curr = nums[0];
        int currIndex = 0;
        for (int i = 1 ; i < nums.length ; i ++){
            if (nums[i-1]!=nums[i]){
                if (currIndex==i-1){
                    answer.add(String.valueOf(curr));
                }else {
                    answer.add(nums[currIndex]+"->"+curr);
                }
                currIndex=i;
                curr = nums[i];
                if (i== nums.length-1){
                    answer.add(String.valueOf(curr));
                }
            }else {
                if (i== nums.length-1){
                    answer.add(nums[currIndex]+"->"+curr);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }
}
