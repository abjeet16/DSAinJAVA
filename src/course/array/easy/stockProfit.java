package course.array.easy;

public class stockProfit {
    public static void main(String[] args) {
        int arr[] = {2,10,4,5,1,20,10};
        myway(arr);
    }

    private static void myway(int[] arr) {
        int profit = 0;
        int min = arr[0];
        int max = 0;
        for(int i = 1;i < arr.length;i++){
            if(min>arr[i]){
                System.out.println(min);
                min = arr[i];
                System.out.println(min);
            }
            if (arr[i]>min && max<arr[i]){
                max = arr[i];
            }
            if (max>arr[i]){
                System.out.println(max + "-" +min);
                profit+=(max-min);
                min = Integer.MIN_VALUE;
                max = 0;
            }
        }
        System.out.println(profit);
    }
}
