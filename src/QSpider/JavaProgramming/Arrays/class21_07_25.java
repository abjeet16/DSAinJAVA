package QSpider.JavaProgramming.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

import static QSpider.JavaProgramming.Arrays.class18_07_25.printArr;

public class class21_07_25 {
    public static void main(String[] args) {
        int[] arr = {0,3,5,3,3,3,6,7,8,0,0,0,1,4,7,7,7,5};
        System.out.println("Original Array");
        printArr(arr);
        //largestInArray(arr);
        //secondLargestInArray(arr);
        //findLargestSecondLargestLeastElement(arr);
        /**
         * to find Duplicate element in a
         */
        //findDuplicate(arr);
    }

    private static void findDuplicate(int[] arr) {
        int largest = largestInArray(arr);
        boolean[] marked = new boolean[largest+1];
        for (int ele : arr){
            if (marked[ele])
                System.out.print(ele);
            marked[ele]=true;
        }
    }
    private static void findDuplicateCollection(int[] arr) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int ele : arr)
            if (!hashSet.add(ele))
                System.out.print(ele+" ");
    }
    static int largestInArray(int [] arr){
        int largest = 0;
        for (int i = 1; i < arr.length;i++)
            if (arr[largest]<arr[i])
                largest = i;
        System.out.println("index : "+largest+" with the value : "+arr[largest]);
        return arr[largest];
    }
    static void secondLargestInArray(int [] arr){
        int largest = arr[0];
        //int secLargest = Integer.MIN_VALUE;
        int secLargest = -2147483648;
        for (int i = 1; i < arr.length;i++) {
            if (largest < arr[i]){
                secLargest = largest;
                largest = arr[i];
            } else if (secLargest < arr[i]&&largest!=arr[i]) {
                secLargest = arr[i];
            }
        }
        System.out.println("the largest is : "+ largest);
        System.out.println("the second largest is : "+secLargest);
    }
    static void findLargestSecondLargestLeastElement(int [] arr){
        int largest = arr[0];
        //int secLargest = Integer.MIN_VALUE;
        int secLargest = -2147483648;
        int smallest = arr[0];
        for (int i = 1; i < arr.length;i++) {
            if (smallest>arr[i]){
                smallest = arr[i];
            }
            if (largest < arr[i]){
                secLargest = largest;
                largest = arr[i];
            } else if (secLargest < arr[i]&&largest!=arr[i]) {
                secLargest = arr[i];
            }
        }
        System.out.println("the largest is : "+ largest);
        System.out.println("the second largest is : "+secLargest);
        System.out.println("the smallest is : "+smallest);
    }
}
