package QSpider.JavaProgramming.Arrays;

import static QSpider.JavaProgramming.Arrays.class18_07_25.printArr;

public class class23_07_25 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,3,3,6,7,8,9,6,7};
        System.out.println("Original Array");
        printArr(arr);
        /**
         * to find fre of number in array
         */
        //findFrequancy(arr);
        //duplicate(arr);
        /**
         * to left rotate the array by 2 times
         */
        //leftRotate(arr,2);
        /**
         *
         */
        rightRotate(arr,2);
    }

    private static void rightRotate(int[] arr, int rotateCount) {
        int size = arr.length;
        int[] result = new int[arr.length];
        for (int i = 0 ; i < rotateCount ; i ++){
            result[i] = arr[arr.length-rotateCount-1-i];
        } 
        for (int i = 0; i < size-rotateCount ; i++){
            result[rotateCount+i] = arr[i];
        }
        printArr(result);
    }

    private static int[] findFrequancy(int[] arr) {
        /*boolean[] done = new boolean[arr.length];
        for (int i = 0 ; i < arr.length ; i ++){
            if (done[i])
                continue;
            done[i] = true;
            int count = 1;
            for (int j = i+1; j < arr.length ; j++){
                if (arr[i] == arr[j]){
                    count++;
                    done[j] = true;
                }
            }
            System.out.println(arr[i]+" freq " + count);
        }*/
        //sir's way
        int[] freq = new int[arr.length];
        int visited = -1;
        for (int i = 0 ; i < arr.length ; i ++){
            if (freq[i]==visited)
                continue;
            int count = 1;
            for (int j = i+1; j < arr.length ; j++){
                if (arr[i] == arr[j]){
                    count++;
                    freq[j] = visited;
                }
            }
            //System.out.println(arr[i]+" freq " + count);
        }
        return freq;
    }
    static void duplicate(int [] arr){
        int [] freq = findFrequancy(arr);
        for (int i = 0 ; i < freq.length ; i ++){
            if (freq[i]==-1)
                System.out.print(arr[i]+" ");
        }
    }
    static void leftRotate(int [] arr,int count){
        int size = arr.length;
        int[] result = new int[arr.length];
        for (int i = 0; i < count;i++){
            result[size-i-1] = arr[count-1-i];
        }
        int index = 0;
        for (int i = count; i < size ; i++,index++){
            result[index] = arr[i];
        }
        printArr(result);
    }
}
