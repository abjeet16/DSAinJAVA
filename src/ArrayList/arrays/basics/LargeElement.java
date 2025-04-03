package ArrayList.arrays.basics;

public class LargeElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        largeElement(arr);
        secondLargest(arr);
    }
    static void largeElement(int[] arr){
        if (arr.length == 0) {
            return;
        } else if (arr.length == 1) {
            System.out.println(arr[0]);
        }
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (temp < arr[i]) {
                temp = arr[i];
            }
        }
        System.out.println(temp);
    }
    static void secondLargest(int[] arr){
        if (arr.length == 0) {
            return;
        } else if (arr.length == 1) {
            System.out.println("No second largest element");
        } else if (arr.length == 2) {
            if (arr[0] > arr[1]) {
                System.out.println(arr[0]);
            } else if (arr[0] < arr[1]) {
                System.out.println(arr[1]);
            }else{
                System.out.println("the 2 elements in array are both equal");
            }
        }
        int first = arr[0], second = arr[1];
        for (int j : arr) {
            if (j > first) {
                second = first;
                first = j;
            } else if (j > second && j < first) {
                second = j;
            }
        }
        System.out.println(second);
    }
}
