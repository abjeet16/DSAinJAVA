package QSpider.JavaProgramming.Arrays;

import static QSpider.JavaProgramming.Arrays.class18_07_25.printArr;

public class class24_07_25 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,9,10,45,77};
        System.out.println("Original Array");
        printArr(arr);
        int element = 10;
        /**
         * for leanear search
         */
        //linearSearch(arr,element);
        /**
         * binary search
         */
        //binarySearch(arr,element);
    }

    /*private static void binarySearch(int[] arr, int element) {
        if (arr.length/2!=0)
            if (arr[arr.length/2+1]==element){
                System.out.println("fount at index : "+(arr.length/2+1));
                return;
            }


        for (int i = 0 ; i < arr.length/2;i++){
            if (arr[i]==element){
                System.out.println("fount at index : "+i);
                return;
            } else if (arr[arr.length-1-i]==element) {
                System.out.println("fount at index : "+(arr.length-1-i));
                return;
            }
        }
        System.out.println("not found");
        int first = 0,last = arr.length-1;
        while (first<=last){
            if (arr[first]==element){
                System.out.println("fount at index : "+first);
                return;
            } else if (arr[last]==element) {
                System.out.println("fount at index : "+last);
                return;
            }
            first++;
            last--;
        }
        System.out.println("not found");
    }*/

    private static void linearSearch(int[] arr, int n) {
        for (int i = 0 ; i < arr.length ; i ++){
            if (arr[i]==n){
                System.out.println("index : "+i+" number : "+n+" found");
                return;
            }
        }
        System.out.println("not found ");
    }
    static int binarySearch(int[] arr, int element){
        int start = 0;
        int end = arr.length;
        while (start<=end) {
            int mid = (start+end)/ 2;
            if (arr[mid] == element)
                return mid;
            else if (arr[mid] > element) {
                end = mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
}
