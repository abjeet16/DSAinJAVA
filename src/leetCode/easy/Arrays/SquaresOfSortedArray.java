package leetCode.easy.Arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static int[] sortedSquaresUsingInsertionSOrt(int[] nums) {
        nums[0]*=nums[0];
        for (int i = 1 ; i < nums.length ; i++){
            int num = nums[i]*nums[i];
            int j = i-1;
            while(j>=0&&nums[j]>num){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1]=num;
        }
        return nums;
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int right = 0;
        int left = nums.length-1;
        int resIndex = nums.length-1;
        while (right < left && resIndex > 0){
            int rightProduct = nums[right]*nums[right];
            int leftProduct = nums[left]*nums[left];
            if (leftProduct>rightProduct){
                res[resIndex] = leftProduct;
                resIndex--;left--;
            } else if (rightProduct==leftProduct) {
                res[resIndex] = rightProduct;
                resIndex--;right++;
                res[resIndex] = leftProduct;
                resIndex--;left--;
            } else {
                res[resIndex] = rightProduct;
                resIndex--;right++;
            }
        }
        if (resIndex==0){
            res[resIndex] = nums[right]*nums[left];
        }
        System.out.println("right : "+right+" left : "+left);
        System.out.println(resIndex);
        return res;
    }

    public static void main(String[] args) {
        /*System.out.println(Arrays.toString(
                sortedSquaresUsingInsertionSOrt(new int[]{-4,-1,0,3,10})
        ));*/
        System.out.println(Arrays.toString(
                sortedSquares(new int[]{-4,-1,0,3,10})
        ));
        /*System.out.println(
                Arrays.toString(
                        insertionSort(new int[]{-4,-1,0,3,10})
                )
        );*/
    }
}
