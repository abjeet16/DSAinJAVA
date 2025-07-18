package QSpider.JavaProgramming.Arrays;

public class class17_07_25 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,9,7};

        /**
         * rev an array
         */
        //revArray(arr);
        /**
         * sum of all elements in array
         */
        //sumArr(arr);
        /**
         * product of all digit in a number
         */
        //proArr(arr);
        
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int el : arr)
            System.out.print(el+" ");
    }
    private static void sumArr(int[] arr) {
        int sum =0;
        for (int el : arr)
            sum+=el;
        System.out.println(sum);
    }
    private static void proArr(int[] arr) {
        int pro =1;
        for (int el : arr)
            pro*=el;
        System.out.println(pro);
    }
    private static void revArray(int[] arr) {
        for (int i = 0 ; i< arr.length/2; i++ ){
            int temp = arr[arr.length-1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = temp;
        }
    }
}
