package course.array.mid;

public class maxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-5,1,-2,3,-1,2,-2};
        System.out.println(subArraySum(arr));
    }

    static int subArraySum(int[] arr) {
        int pastBest = arr[0];
        int max = arr[0];
        for (int i = 1; i<arr.length;i++) {
            pastBest = Math.max(pastBest + arr[i], arr[i]);
            max =  Math.max(pastBest,max);
        }
        return max;
    }
}
