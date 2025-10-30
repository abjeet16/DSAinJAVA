package leetCode.strivers.binarySearch.mid;

/// 1011. Capacity To Ship Packages Within D Days
public class CapacityToShipPackagesWithinDays {
    public static int shipWithinDays(int[] weights, int days) {
        int right = 0;
        int left = 0;
        for (int w : weights) {
            right += w;
            left = Math.max(left, w);
        }
        int res = right;
        while (left<=right){
            int mid = (left+right)/2;
            if (canBeShipped(weights,days,mid)){
                res = mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return res;
    }

    private static boolean canBeShipped(int[] weights, int days, int capacity) {
        int ship = 1;
        int load = 0;

        for (int weight : weights) {
            if (weight > capacity)
                return false;
            if (load + weight > capacity) {
                ship++;
                load = 0;
            }
            load += weight;
        }

        return ship <= days;
    }

    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days = 1;
        System.out.println(shipWithinDays(weights,days));
    }
}
