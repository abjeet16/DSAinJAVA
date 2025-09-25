package leetCode.easy.Arrays;

class Rotate {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
                //8 9 0 1 2 3 4 5 6 7
        int n = 3;
        rotate(arr,n);
    }
    public static void rotate(int[] nums, int k) {
        k = k % nums.length;
        if(k < 0){
            k += nums.length;
        }
        int[] arr = new int[k];
        for(int i = 0;i<k ;i++){
            arr[i] = nums[nums.length-k+i];
        }
        for(int i = nums.length-1-k;i>=0;i--){
            nums[i+k] = nums[i];
        }
        for (int i = 0;i<k;i++){
            nums[i] = arr[i];
        }
    }
}
