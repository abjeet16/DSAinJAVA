package QSpider.JavaProgramming.Patterns;

public class rightHAlfTriangle {
    public static void main(String[] args) {
        rightHAlfTriangleStar(6);
        rightHalfCharAtoB(6);
        rightHalfNumAsc(6);
        rightHalfNumDesc(6);
        rightHalfNumRowDec(6);
        rightHalfNumRowAsc(6);
        rightHalfOddEven0And1(6);
        rightHalfRowOddEven0And1(6);
        rightHalfRow1StartThan0(6);
        rightHalfNumAsc0to9(6);
    }
    /**
                 *
               * *
             * * *
           * * * *
         * * * * *

     **/
    static void rightHAlfTriangleStar(int size){
        // MY WAY
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
        // Sir's way
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (j+i >= size-1){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
     *           A
     *         B A
     *       C B A
     *     D C B A
     *   E D C B A
     * F E D C B A
     * **/
    static void rightHalfCharAtoB(int size){
        for (int i = 1 ; i <= size ; i++){
            for (int j = 1 ; j <= size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print((char) ('A'+size-j)+" ");
                }
            }
            System.out.println();
        }
    }
    /**
     *           1
     *         1 2
     *       1 2 3
     *     1 2 3 4
     *   1 2 3 4 5
     * 1 2 3 4 5 6
     * */
    static void rightHalfNumAsc(int size){
        for (int i = 1 ; i <= size ; i++){
            int num = 0;
            for (int j = 1 ; j <= size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print(++num + " ");
                }
            }
            System.out.println();
        }
    }
    /**
     *           6
     *         6 5
     *       6 5 4
     *     6 5 4 3
     *   6 5 4 3 2
     * 6 5 4 3 2 1
     * */
    static void rightHalfNumDesc(int size){
        for (int i = 1 ; i <= size ; i ++){
            int count = size+1;
            for (int j = 1 ; j <= size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print(--count + " ");
                }
            }
            System.out.println();
        }
    }
    /**
     *           5
     *         4 4
     *       3 3 3
     *     2 2 2 2
     *   1 1 1 1 1
     * */
    static void rightHalfNumRowDec(int size){
        for (int i = 0 ; i < size ; i ++){
            for (int j = 0 ; j < size ; j++){
                if (j >= size- i){
                    System.out.print(size-i + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
     *           1
     *         2 2
     *       3 3 3
     *     4 4 4 4
     *   5 5 5 5 5
     * 6 6 6 6 6 6
     * */
    static void rightHalfNumRowAsc(int size){
        for (int i = 1 ; i <= size ; i ++){
            for (int j = 1 ; j <= size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
    /**
     *             0
     *           1 0
     *         0 1 0
     *       1 0 1 0
     *     0 1 0 1 0
     *   1 0 1 0 1 0
     * */
    static void rightHalfOddEven0And1(int size){
        for (int i = 0 ; i <= size ; i ++){
            for (int j = 0 ; j <= size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print(j%2+ " ");
                }
            }
            System.out.println();
        }
    }
    /**
     *             1
     *           0 0
     *         1 1 1
     *       0 0 0 0
     *     1 1 1 1 1
     *   0 0 0 0 0 0
     * */
    static void rightHalfRowOddEven0And1(int size){
        for (int i = 0 ; i <= size ; i ++){
            for (int j = 0 ; j <= size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print(i%2+ " ");
                }
            }
            System.out.println();
        }
    }
    /**
     *             1
     *           1 0
     *         1 0 1
     *       1 0 1 0
     *     1 0 1 0 1
     *   1 0 1 0 1 0
     * */
    static void rightHalfRow1StartThan0(int size){
        for (int i = 0 ; i <= size ; i ++){
            int count = 1;
            for (int j = 0 ; j <= size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print(count+ " ");
                    count = (count == 1) ? 0 : 1;
                }
            }
            System.out.println();
        }
    }
    /**
     *           1
     *         2 3
     *       4 5 6
     *     7 8 9 1
     *   2 3 4 5 6
     * 7 8 9 1 2 3
     * */
    static void rightHalfNumAsc0to9(int size){
        int num = 1;
        for (int i = 1 ; i <= size ; i ++){
            for (int j = 1 ; j <= size ; j++){
                if (j <= size- i){
                    System.out.print("  ");
                }else {
                    System.out.print(num++ + " ");
                    if (num==10)
                        num = 1;
                }
            }
            System.out.println();
        }
    }
}
