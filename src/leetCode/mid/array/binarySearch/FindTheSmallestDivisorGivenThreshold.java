package leetCode.mid.array.binarySearch;
/// 1283. Find the Smallest Divisor Given a Threshold
public class FindTheSmallestDivisorGivenThreshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        int right = findMax(nums) , left = 1;
        int res = 0 ;
        while (left <= right){
            int mid = (left+right)/2;
            if (canDiv(nums,mid,threshold)){
                res = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return res;
    }

    private static boolean canDiv(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int ele : nums){
            sum+=ele/divisor;
            if (ele%divisor!=0)
                sum++;
            if (sum>threshold)
                return false;
        }
        return true;
    }

    private static int findMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int ele : nums)
            max = Math.max(ele,max);
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,5,9};//0,0,1,3
        int t = 6;
        System.out.println(smallestDivisor(nums,t));
    }
}
