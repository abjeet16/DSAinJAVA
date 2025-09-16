package course.array.sortedArray;

import java.util.Arrays;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,7,8,40,90};
        int[] arr1 = {2,3,4,5,70,80};
        int med = median(arr,arr1);
        System.out.println(med);
    }

    private static int median(int[] arr, int[] arr1) {
        int i = 0,j=0;
        int[] resultArr = new int[arr.length+arr1.length];
        while (i+j< resultArr.length){
            if (j>arr1.length-1||(i<arr.length && arr[i]<=arr1[j])){
                resultArr[i+j]=arr[i];
                i++;
            } else {
                resultArr[i+j]=arr1[j];
                j++;
            }
            System.out.println(Arrays.toString(resultArr));
        }
        if (resultArr.length%2==0)
            return (resultArr[resultArr.length/2]+resultArr[resultArr.length/2+1])
                    /2;
        else
            return resultArr[resultArr.length/2];
    }
}
