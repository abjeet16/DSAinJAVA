package course.array.easy;

public class removeDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6,7,7,8,8,8,8};
        remove(arr);
    }

    private static void printArray(int[] arr,int size) {
        for(int i = 0 ; i<size;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void remove(int[] arr) {
        int index = 1;  // Start from 1 since arr[0] is always unique
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        printArray(arr, index);
    }
}
