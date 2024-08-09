package sorting;

public class bubbleSort {
    public static void main(String[] args) {
        int[] arr = {6, 2, 8, 4, 1, 6, 8, 0, 6, 1, 10};

        // Outer loop iterates over each element
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop for comparing adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap the elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print sorted array
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
