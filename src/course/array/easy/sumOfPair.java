package course.array.easy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class sumOfPair {
    public static void main(String[] args) {
        int[] arr = {10,10,20,30,40,50,60,40};
        int sum = 40;
        System.out.println(checkSumINSortedArray(arr,sum));
        System.out.println(checkTripleINSortedArray(arr,sum));
    }

    private static boolean checkSumINSortedArray(int[] arr, int sum) {
        int i = 0,j= arr.length-1;
        while (i<j){
            int currSum = arr[i]+arr[j];
            if (currSum==sum) {
                System.out.println(arr[i]+"("+i+")"+arr[j]+"("+j+") = "+sum);
                return true;
            }
            else if (currSum>sum)
                j--;
            else
                i++;
        }
        return false;
    }
    private static boolean checkTripleINSortedArray(int[] arr, int sum) {
        for (int i = 0 ; i < arr.length-1; i ++){
            if(checkSumINSortedArrayCopy(arr,sum-i,i)) {
                System.out.println(arr[i]+"("+i+")  = "+sum);
                return true;
            }
        }
        return false;
    }
    private static boolean checkSumINSortedArrayCopy(int[] arr, int sum,int start) {
        int i = start+1,j= arr.length-1;
        while (i<j){
            int currSum = arr[i]+arr[j];
            if (currSum==sum) {
                System.out.print(arr[i]+"("+i+") + "+arr[j]+"("+j+") + ");
                return true;
            }
            else if (currSum>sum)
                j--;
            else
                i++;
        }
        return false;
    }
}
