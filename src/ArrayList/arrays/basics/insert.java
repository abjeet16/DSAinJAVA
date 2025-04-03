package ArrayList.arrays.basics;

public class insert {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 7};
        display(arr);

        arr = funInsert(arr, 1, 2); // Insert 2 at index 2
        display(arr);
    }

    static int[] funInsert(int[] arr, int index, int element) {
        if (index < 0 || index > arr.length) {
            System.out.println("Invalid index!");
            return arr;
        }

        int[] newArr = new int[arr.length + 1];

        // Copy elements before index
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        // Insert the new element
        newArr[index] = element;

        // Copy remaining elements
        for (int i = index; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }

        return newArr;
    }

    static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

