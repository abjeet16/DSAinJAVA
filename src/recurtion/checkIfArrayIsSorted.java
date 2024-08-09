package recurtion;

public class checkIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,1};
        checkSorted(arr,arr[0]);
    }

    private static void checkSorted(int[] arr, int index) {
        if (index == arr.length-1){
            System.out.println("it is sorted");
            return;
        }
        if (arr[index]>arr[index+1]){
            System.out.println("it is not sorted");
            return;
        }
        checkSorted(arr,index+1);
    }
}
