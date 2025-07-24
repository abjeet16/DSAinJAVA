package QSpider.JavaProgramming.Arrays;

import static QSpider.JavaProgramming.Arrays.class18_07_25.printArr;

public class class22_07_25 {
    public static void main(String[] args) {
        int[] arr = {0,3,5,3,3,3,6,7,8,0,0,0,1,4,7,7,7,5};
        System.out.println("Original Array");
        printArr(arr);

        //findDuplicateCollection(arr);
        //removeDuplicateElements(arr);
        //copyArray(arr);
    }

    private static void copyArray(int[] arr) {
        int [] copy = new int[arr.length];
        for (int i = 0 ; i < arr.length;i++)
            copy[i] = arr[i];

        System.out.println("Copy of the Array");
        printArr(copy);
    }
    private static void removeDuplicateElements(int[] arr) {
        int[] temp = new int[arr.length];
        int resultIndex = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if(!checkDuplicate(arr,i+1,arr[i])){
                temp[resultIndex] = arr[i];
                resultIndex++;
            }
        }
        int[] result = new int[resultIndex];
        for (int i = 0 ; i < resultIndex ; i++)
            result[i] = temp[i];
        printArr(result);
    }
    static boolean checkDuplicate(int[] arr,int start,int element){
        while (start!=arr.length){
            if (arr[start]==element)
                return true;
            start++;
        }
        return false;
    }
}
