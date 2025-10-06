package leetCode.easy.Arrays;

public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        int res = duration;
        for (int i = 1 ; i < timeSeries.length;i++){
            res+=duration;
            if (timeSeries[i]-timeSeries[i-1]<duration) {
                res-=duration;
                res += timeSeries[i] - timeSeries[i - 1];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int duration = 5;
        System.out.println(findPoisonedDuration(arr,duration));
    }
}
