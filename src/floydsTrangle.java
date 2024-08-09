public class floydsTrangle {
    public static void main(String[] args) {
        int count = 1;
        int size = 5;
        for (int i = 0;i<size;i++){
            for (int j = 0 ; j<i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
