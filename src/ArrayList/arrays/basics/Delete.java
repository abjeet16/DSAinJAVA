package ArrayList.arrays.basics;

public class Delete {
    public static void main(String[] args) {
        int[] arr = {1,6, 3, 4, 5, 6, 7};
        display(arr);
        deleteByIndex(arr, 2);
        display(arr);
        deleteByValue(arr, 6);
        display(arr);
    }
    static void deleteByIndex(int[] arr, int index) {
        for (int i = index; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
    }
    static void deleteByValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                deleteByIndex(arr, i);
            }
        }
    }
    static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
