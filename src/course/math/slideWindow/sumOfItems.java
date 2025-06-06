package course.math.slideWindow;

public class sumOfItems {
    public static void main(String[] args) {
        int[] arr = {2,4,5,20,3,1};
        int sum = 33;
        findSum(arr,sum);
    }
    static void findSum(int[] arr, int k) {
       int start = 0, sum = 0;
       for(int i = 0 ; i < arr.length ; i++){
           sum+=arr[i];
           while (sum > k){
               sum-=arr[start];
               start++;
           }
           if (sum==k){
               printArray(arr,start,i);
               System.out.print(" = " + k);
               return;
           }
       }
       System.out.println("no sum found");
    }

    private static void printArray(int[] arr, int start, int end) {
        for (int i = start ; i<end ; i++){
            System.out.print(arr[i] + "( index: " + i + " )" + "+");
        }
        System.out.print(arr[end] + "( index: " + end + " )");
    }
}
