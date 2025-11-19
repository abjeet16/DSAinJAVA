package leetCode.easy.Arrays;

import java.util.Arrays;

/// 1122. Relative Sort Array
public class RelativeSortArray {
    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] arr1count = new int[1001];
        for (int i : arr1)
            arr1count[i]++;
        int resIndex = 0;
        for (int i : arr2){
            for (int j = 0 ; j < arr1count[i] ; j++){
                arr1[resIndex]=i;
                resIndex++;
            }
            arr1count[i]=0;
        }
        for (int i = 0 ; i < 1001 ; i++){
            for (int j = 0 ; j < arr1count[i] ; j++){
                arr1[resIndex]=i;
                resIndex++;
            }
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] num1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] num2 = {2,1,4,3,9,6};
        System.out.println(Arrays.toString(relativeSortArray(num1,num2)));
    }
}
