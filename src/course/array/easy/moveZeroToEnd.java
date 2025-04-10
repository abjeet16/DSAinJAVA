package course.array.easy;

import static college.QuickSort.printArray;

public class moveZeroToEnd {
    public static void main(String[] args) {
        int arr[] = {1,0,0,5,5,3,2,0,7,7};
        move(arr);
    }
    static void move(int arr[]){
        int index = 0;
        for(int i = 0; i< arr.length;i++){
            if (arr[i]!=0) {
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index;i<arr.length;i++){
            arr[i] = 0;
        }
        printArray(arr);
    }
}
