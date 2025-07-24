package QSpider.JavaProgramming.Arrays;

import static QSpider.JavaProgramming.Arrays.class18_07_25.printArr;

public class class19_07_25 {
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,0,7,9,7};
        printArr(arr);
        /**
         * inserstion sort
         */
        //insertionSortAsc(arr);
        //insertionSortDesc(arr);
        printArr(arr);
    }

    private static void insertionSortAsc(int[] arr) {
        //[0, 1, 2, 3, 4, 7, 7, 9]
        for (int i = 1 ; i < arr.length;i++){
            int temp = arr[i];
            int j = i -1;
            while (j>=0&&arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
    private static void insertionSortDesc(int[] arr) {
        //[0, 1, 2, 3, 4, 7, 7, 9]
        for (int i = 1 ; i < arr.length;i++){
            int temp = arr[i];
            int j = i -1;
            while (j>=0&&arr[j]<temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1]=temp;
        }
    }
}
