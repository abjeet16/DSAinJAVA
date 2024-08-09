public class rotatedInvertedHalfPyramid {
    public static void main(String[] args) {
        int size = 4;
        rotatedInvertedHalfPyramid.upSideDownTrangle(size);
        rotatedInvertedHalfPyramid.leftsideTrangle(size);
    }
    static void upSideDownTrangle(int size){
        for (int i = 0 ; i <  size ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print("  ");
            }
            for (int j = 0 ; j<size-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0 ; i <  size ; i++){
            for (int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            for (int j = 0 ; j<size-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void leftsideTrangle(int size){
        for (int i = size ; i > 0 ;i--){
            for (int j = 0 ; j < 5 ; j++ ){
                if (j>=i){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        for (int i = 0 ; i < size;i++){
            for (int j = 0 ; j < size-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
