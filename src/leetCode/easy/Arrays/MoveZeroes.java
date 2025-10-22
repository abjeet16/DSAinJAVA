package leetCode.easy.Arrays;

//283. Move Zeroes
public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int insertIndex = 0;
        for (int i : nums){
            if (i!=0){
                nums[insertIndex]=i;
                insertIndex++;
            }
        }
        int len = nums.length;
        for (int i = insertIndex ; i < len ; i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
    }
}
