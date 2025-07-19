package QSpider.JavaProgramming.Arrays;

import java.util.Arrays;

public class class18_07_25 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,0,7,9,7};
        printArr(arr);
        /**
         * bubble sort Asc
         */
        //bubbleSortAsc(arr);
        /**
         * bubble sort Desc
         */
        //bubbleSortDesc(arr);
        /**
         * selection sort
         */
        selectionSortAsc(arr);
        /**
         * selection sort desc
         */
        //selectionSortDesc(arr);
        printArr(arr);
    }

    private static void selectionSortDesc(int[] arr) {
        for (int i = 0 ; i < arr.length-1 ; i++){
            int max = i;
            for (int j = i+1 ; j < arr.length;j++){
                if (arr[max]<arr[j])
                    max=j;
            }
            if (max!=i)
                swap(arr,i,max);
        }
    }
    private static void selectionSortAsc(int[] arr) {
        for (int i = 0 ; i < arr.length-1 ; i++){
            int min = i;
            for (int j = i+1 ; j < arr.length;j++){
                if (arr[min]>arr[j])
                    min=j;
            }
            if (min!=i)
                swap(arr,i,min);
        }
    }
    private static void bubbleSortAsc(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            for (int j = 0 ; j < arr.length-1-i;j++){
                if (arr[j]>arr[j+1])
                    swap(arr,j, j+1);
            }
        }
    }
    private static void bubbleSortDesc(int[] arr) {
        for (int i = 0;i<arr.length;i++){
            for (int j = 0 ; j < arr.length-1-i;j++){
                if (arr[j]<arr[j+1])
                    swap(arr,j, j+1);
            }
        }
    }
    static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }
    private static void swap(int[]arr , int i , int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
