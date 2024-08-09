package sorting;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 4, 1, 6, 8, 0, 6, 1, 10};

        // Outer loop to iterate over each element from the second element to the last
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i]; // Element to be inserted in the sorted portion
            int j = i - 1;

            // Move elements of arr[0. .i-1], that are greater than key, to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Insert the key at the correct position
        }

        // Print sorted array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}

