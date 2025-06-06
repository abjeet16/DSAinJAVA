package course.array.mid;

public class minFlip1or0 {
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 0, 0, 1,0,1,1,0};
        minFlip(arr);
    }
    static void minFlip(int[] arr){
       for (int i = 1;i<arr.length;i++){
           if (arr[i]!=arr[i-1]){
               if (arr[i]!=arr[0]){
                   System.out.print("From "+i+" To ");
               }else {
                   System.out.println(i-1);
               }
           }
       }
    }
}
