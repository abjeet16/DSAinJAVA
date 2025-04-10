package course.array.easy;


public class leaderInArray {
    public static void main(String[] args) {
        int arr[] = {10,6,7,11,2,10,8,4,3,8,2,6,5};
        leaders(arr);
    }
    static void leaders(int[] arr){
        int[] leaders = new int[arr.length];
        int index = 0;
        leaders[index] = arr[arr.length-1];
        for(int i = arr.length-2;i>=0;i--){
            if (arr[i]>leaders[index]){
                leaders[++index] = arr[i];
            }
        }
        printArray(leaders,index);
    }

    private static void printArray(int[] arr, int index) {
        for (int i = 0;i<=index;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
