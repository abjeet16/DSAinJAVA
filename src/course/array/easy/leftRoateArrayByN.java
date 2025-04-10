package course.array.easy;

import static college.QuickSort.printArray;

public class leftRoateArrayByN {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int n = 4;
        rotate(arr,n);
    }

    private static void myWay(int[] arr,int n) {
        n %= arr.length;
        if (n<0){
            n+= arr.length;
        }
        int[] lastElements = new int[n];
        for (int i = 0 ; i<n;i++){
            lastElements[i]= arr[i];
        }
        for(int i = n ; i< arr.length;i++){
            arr[i-n]=arr[i];
        }
        for(int i = 0; i < lastElements.length;i++){
            arr[arr.length-n+i] = lastElements[i];
        }
        printArray(arr);
    }
    private static void rotate(int arr[],int n){
        reverse(arr,0,n);
        printArray(arr);
        reverse(arr,n+1, arr.length-1);
        printArray(arr);
        reverse(arr,0, arr.length-1);
        printArray(arr);
    }
    private static void reverse(int arr[],int start,int last){
        while(start<last){
            arr[start] = arr[start]+arr[last];
            arr[last] = arr[start]-arr[last];
            arr[start] = arr[start]-arr[last];
            start++;
            last--;
        }
    }
}