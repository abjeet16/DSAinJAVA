package college;

public class QuickSort {

    // Method to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Choose the last element as the pivot
        int i = low - 1; // Pointer for the smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to the pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and the pivot (arr[high])
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i + 1; // Return the partition index
    }

    // QuickSort method
    private static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Get the partition index
            int partitionIndex = partition(arr, low, high);

            // Recursively sort elements before and after the partition
            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 80, 30, 90, 40, 50, 70};
        int n = arr.length;

        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("\nSorted array:");
        printArray(arr);
    }

    // Method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

