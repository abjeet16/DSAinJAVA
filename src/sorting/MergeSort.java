package sorting;

class MergeSort {

    // Function to display the elements of the array
    public static void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to run the merge sort example
    public static void main(String[] args) {
        int[] a = {12, 8, 4, 14, 36, 64, 15, 72, 67, 84};
        int size = a.length;

        // Display the original array
        display(a, size);

        // Capture the start time for performance measurement
        long start = System.nanoTime();

        // Call merge sort on the array
        mergeSort(a, 0, size - 1);

        // Capture the end time after sorting
        long end = System.nanoTime();

        // Display the sorted array
        display(a, size);

        // Calculate and print the execution time
        long execution = end - start;
        System.out.println("Execution time: " + execution + " Nanoseconds");
    }

    // Recursive mergeSort function to divide the array
    static void mergeSort(int[] a, int left, int right) {
        int mid;
        if (left < right) {
            // Find the middle point to divide the array into two halves
            mid = (left + right) / 2;

            // Sort the first and second halves
            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            // Merge the sorted halves
            merge(a, left, mid, right);
        }
    }

    // Function to merge two sorted subarrays into a single sorted array
    static void merge(int[] a, int left, int mid, int right) {
        int i = left; // Starting index for left subarray
        int j = mid + 1; // Starting index for right subarray
        int index = left; // Starting index for merged array
        int[] temp = new int[a.length]; // Temporary array for merging

        // Merge elements from left and right subarrays in sorted order
        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                temp[index] = a[i];
                i++;
            } else {
                temp[index] = a[j];
                j++;
            }
            index++;
        }

        // Copy remaining elements of left subarray, if any
        while (i <= mid) {
            temp[index] = a[i];
            index++;
            i++;
        }

        // Copy remaining elements of right subarray, if any
        while (j <= right) {
            temp[index] = a[j];
            index++;
            j++;
        }

        // Copy the merged elements back into the original array
        for (int p = left; p <= right; p++) {
            a[p] = temp[p];
        }
    }
}

