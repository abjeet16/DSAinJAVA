package course.array.mid;

import static course.array.mid.maxSubArraySum.subArraySum;

public class MaximumCircularSumSubArray {
    public static void main(String[] args) {
        int arr[] = {8,11,3,-5,4};
        System.out.println(maxCircularSum(arr));
    }

    private static int maxCircularSum(int[] arr) {
        int normalSum = subArraySum(arr);
        if (normalSum<0){
            return normalSum;
        }
        int sumOfArray = 0;
        for (int i = 0 ; i<arr.length;i++){
            sumOfArray+=arr[i];
            arr[i] = -arr[i];
        }
        return Math.max(sumOfArray+subArraySum(arr),normalSum);
    }
}
