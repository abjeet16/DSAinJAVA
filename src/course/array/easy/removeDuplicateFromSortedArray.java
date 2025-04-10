package course.array.easy;

public class removeDuplicateFromSortedArray {
    public static void main(String[] args) {
        int arr[] = {1,1,1,1,2,2,2,3,3,3,4,4,4,5,5,5};
        myMethod(arr);
    }

    private static void printArray(int[] arr,int size) {
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void myMethod(int[] arr) {
       int size = arr.length;
       int count = 0;
       for (int i = 0; i < arr.length-1;i++){
           if (arr[i]==arr[i+1]){
               count++;
           }else{
               for (int j = i+1;j< arr.length;j++){
                   System.out.print(arr[j] + " " + arr[j-count] + " | ");
                   arr[j-count] = arr[j];
                   size-=count;
                   count = 0;
               }
           }
       }
       printArray(arr,size);
    }
}
