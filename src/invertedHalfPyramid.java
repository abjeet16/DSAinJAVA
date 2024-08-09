public class invertedHalfPyramid {
    public static void main(String[] args) {
        int size = 5;
        for (int i = size ; i > 0 ; i --){
            for ( int j = 0 ; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = size ; i > 0 ; i --){
            for ( int j = 1 ; j <= i ; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
