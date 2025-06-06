package course.math;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int [] arr = {3,4,8,-9,9,7};
        equilibriumPoint(arr);
    }
    static void equilibriumPoint(int[] arr){
        int[] preSum = new int[arr.length];
        int[] sufSum = new int[arr.length];
        preSum[0] = arr[0];
        sufSum[arr.length-1] = arr[arr.length-1];
        for (int i = 1 ; i < arr.length ; i++){
            preSum[i] = preSum[i-1] + arr[i];
        }
        for (int i = arr.length-2 ; i >= 0 ; i--){
            sufSum[i]+= sufSum[i+1]+arr[i];
        }
        for (int i = 1 ; i< arr.length-1 ; i++){
            if (preSum[i-1] == sufSum[i+1]){
                System.out.println(i);
            }
        }
    }
}
