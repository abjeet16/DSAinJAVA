package course.array.easy;

public class maxConsicative1s {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1,1,1,1,1,0,0,0,1,1,0,0};
        System.out.println(count(arr));
    }

    private static int count(int[] arr) {
        int count = arr[0]==1?1:0;
        int ones = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if (arr[i] == 1){
                count++;
            }else{
                ones = Math.max(count,ones);
                count = 0;
            }
        }
        return ones;
    }
}
