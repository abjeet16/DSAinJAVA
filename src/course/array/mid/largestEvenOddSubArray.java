package course.array.mid;

public class largestEvenOddSubArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9,10,11,12,13,14,16};
        System.out.println(largestSubArray(arr));
    }

    private static int largestSubArray(int[] arr) {
        int current = arr[0]%2==0?1:0;
        int result = current;
        for (int i = 1; i<arr.length;i++){
            if (arr[i]%2==0){
                if (current%2==0){
                    current++;
                    result = Math.max(current,result);
                }else{
                    current = 0;
                }
            }else{
                if (current%2!=0){
                    current++;
                    result = Math.max(current,result);
                }else{
                    current = 0;
                }
            }
        }
        return result;
    }
}
