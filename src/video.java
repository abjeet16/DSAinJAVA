import static QSpider.JavaProgramming.Arrays.class17_07_25.printArr;

public class video {
    public static void main(String[] args) {
        int[] arr = {0,2,4,1,3,7,9,7};
        printArr(arr);
        selectionSortAsc(arr);
    }
    private static void selectionSortAsc(int[] arr) {
        for (int i = 0 ; i < arr.length-1 ; i++){
            int min = i;
            for (int j = i+1 ; j < arr.length;j++){
                if (arr[min]>arr[j])
                    min=j;
            }
            if (min!=i)
                swap(arr,i,min);
        }
    }
    private static void swap(int[]arr , int i , int j ){
        //example : arr[i] = 10 , arr[j] = 20;
        int temp = arr[i];//temp = 10
        arr[i] = arr[j];//arr[i] = 20
        arr[j] = temp;//arr[j] = 10
    }
    private static void swapWithTemp(int[]arr , int i , int j ){
        //example : arr[i] = 10 , arr[j] = 20;
        arr[i] = arr[i]*arr[j];//arr[i] = 20 x 10 = 200
        arr[j] = arr[i]/arr[j];//arr[j] = 200/20 = 10
        arr[i] = arr[i]/arr[j];//arr[j] = 200/10 = 20
    }
}
