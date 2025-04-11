package course.array.easy;

import java.util.HashMap;

public class frequenciesOfNumber {
    public static void main(String[] args) {
        int [] arr = {1,1,1,3,3,3,6,6,6,7,7,7,9,9,9,9,9,10};
        frequencies(arr);
    }

    private static void frequencies(int[] arr) {
        HashMap<Integer,Integer> answer = new HashMap<>();
        int count = 1;
        for(int i= 1;i < arr.length;i++) {
            if(i == arr.length-1){
                if (arr[i-1] != arr[i]){
                    answer.put(arr[i],1);
                }else{
                    answer.put(arr[i], ++count);
                }
            }
            if (arr[i - 1] != arr[i]) {
                answer.put(arr[i - 1], count);
                count = 1;
                continue;
            }
            count++;
        }
        System.out.println(answer);
    }
}
