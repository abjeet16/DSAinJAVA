package course.array.easy;

import static college.QuickSort.printArray;

public class rightRotateArrayByN {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,0};
        int n = 4;
        rotate(arr, n);
    }

    private static void rotate(int arr[], int n) {
        n %= arr.length;  // handle large n
        if (n < 0) {
            n += arr.length;  // handle negative rotation
        }

        // Reverse 3 times
        reverse(arr, 0, arr.length - n - 1);
        printArray(arr);

        reverse(arr, arr.length - n, arr.length - 1);
        printArray(arr);

        reverse(arr, 0, arr.length - 1);
        printArray(arr);
    }

    private static void reverse(int arr[], int start, int last) {
        while (start < last) {
            arr[start] = arr[start] + arr[last];
            arr[last] = arr[start] - arr[last];
            arr[start] = arr[start] - arr[last];
            start++;
            last--;
        }
    }
}

