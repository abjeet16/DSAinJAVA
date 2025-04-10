package course.array.easy;

import static college.QuickSort.printArray;

public class lestRotateArrayByOne {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        rotate(arr);
    }

    private static void rotate(int[] arr) {
        int first = arr[0];
        for(int i = 0 ; i< arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = first;
        printArray(arr);
    }
}
