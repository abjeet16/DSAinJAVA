package QSpider.JavaProgramming.Arrays;

import static QSpider.JavaProgramming.Arrays.class18_07_25.printArr;

public class class24_07_25 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,3,3,6,7,8,9,6,7};
        System.out.println("Original Array");
        printArr(arr);
        int element = 10;
        /**
         * for leanear search
         */
        linearSearch(arr,element);
    }

    private static void linearSearch(int[] arr, int n) {
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i]==n){
                System.out.println("index : "+i+" number : "+n+" found");
                return;
            }
        }
        System.out.println("not found ");
    }
}
