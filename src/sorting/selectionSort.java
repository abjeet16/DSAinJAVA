package sorting;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 4, 1, 6, 8, 0, 6, 1, 10};

        // Outer loop to iterate over each element
        for (int i = 0; i < arr.length - 1; i++) {
            // Assume the minimum element is the first element of the unsorted part
            int minIndex = i;

            // Inner loop to find the index of the minimum element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element of the unsorted part
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }

        // Print sorted array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
