package course.array.easy;

import static college.QuickSort.printArray;

public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 9};
        reverse(arr);
        printArray(arr);
    }

    private static void reverse(int[] arr) {
        for(int i = 0 ; i < arr.length/2;i++){
            arr[i] = arr[i]*arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i]/arr[arr.length-1-i];
            arr[i] = arr[i]/arr[arr.length-1-i];
        }
    }
}
