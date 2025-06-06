package course.math.slideWindow;

public class slidingWindow {
    public static void main(String[] args) {
        int[] arr = {100,5,100,-2,20,1};
        normalFindMax(arr,3);
        slideWindow(arr,3);
    }
    static void normalFindMax(int[] arr, int k) {
        int max = Integer.MIN_VALUE;
        for (int i = 0 ; i<arr.length-k ; i++){
            int temp = 0;
            for (int j = 0 ; j<k ; j++){
                temp +=arr[i+j];
            }
            if (temp>max){
                max = temp;
            }
        }
        System.out.println(max);
    }
    static void slideWindow(int [] arr,int k){
        int max = 0;
        for (int i = 0; i<k;i++){
            max += arr[i];
        }
        int currentSum = max;
        for (int i = k;i<arr.length;i++){
            currentSum = (currentSum - arr[i-k]) + arr[i];
            if (currentSum>max){
                max = currentSum;
            }
        }
        System.out.println(max);
    }
}
