public class numberPyramid {
    public static void main(String[] args) {
        int size = 5 ;
        numberpyramid(size);
        normalPyramid(size);
    }

    private static void normalPyramid(int size) {
        for (int i = 0 ; i < size ; i++){
            for (int j = 1 ; j < size-i ; j++){
                System.out.print(" ");
            }
            for (int j = 0 ; j <=i ; j++){
                System.out.print("* ");
            }
            for (int j = 1 ; j < size-i ; j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void numberpyramid(int size) {
        for (int i = 0 ; i < size ; i ++){
            int space = size - i ;
            for (int j = 0 ; j <space ; j++){
                System.out.print(" ");
            }
            for (int j = 0 ; j <= i ; j++){
                System.out.print( i +" ");
            }
            System.out.println();
        }
    }

}
