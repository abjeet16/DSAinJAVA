package leetCode.strivers.binarySearch;

/// 875. Koko Eating Bananas
public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int right = getMaxValue(piles);
        int left = 1 , res = 0;
        while (left<=right){
            int mid = (left+right)/2;
            if (canHeEat(mid,piles,h)){
                res = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return res;
    }

    private static int getMaxValue(int[] piles) {
        int max = Integer.MIN_VALUE;
        for (int ele : piles)
            max = Math.max(ele,max);
        return max;
    }

    private static boolean canHeEat(int eatPerHour, int[] piles, int maxHours) {
        int hoursTaken = 0;
        for (int ele : piles){
            hoursTaken+= ele / eatPerHour;
            if (ele %eatPerHour!=0){
                hoursTaken++;
            }
            if (hoursTaken>maxHours)
                return false;
        }
        System.out.println(eatPerHour+" : "+(hoursTaken<=maxHours)+" ( "+hoursTaken+" )");
        return true;
    }

    public static void main(String[] args) {
        int[] piles = {805306368,805306368,805306368};
        int h = 1000000000;
        System.out.println(minEatingSpeed(piles,h));
    }
}
