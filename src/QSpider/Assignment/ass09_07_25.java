package QSpider.Assignment;

public class ass09_07_25 {
    public static void main(String[] args) {
        leftInvertedStar(6);
        leftInvertedAtoZAsc(6);
        leftInvertedAtoZDesc(6);
        leftInvertedNumAsc(6);
        leftInvertedNumDesc(6);
        leftInvertedAtoZRowAsc(6);
        leftInvertedAtoZRowDesc(6);
        leftInvertedNumRowAsc(6);
        leftInvertedNumRowDesc(6);
        leftInvertedAtoZColDesc(6);
        leftInvertedAtoZColAsc(6);
        leftInvertedNumColDesc(6);
    }

    /**
       * * * * * *
       * * * * *
       * * * *
       * * *
       * *
       *
     */
    static void leftInvertedStar(int size){
        for (int i = 0; i <size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }

    /**
     * A B C D E F
     * A B C D E
     * A B C D
     * A B C
     * A B
     * A
     */
    static void leftInvertedAtoZAsc(int size){
        for (int i = 0; i <size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print((char) ('A'+j)+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * F E D C B A
     * F E D C B
     * F E D C
     * F E D
     * F E
     * F
     */
    static void leftInvertedAtoZDesc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print((char) ('A'+size-1-j)+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 1 2 3 4 5 6
     * 1 2 3 4 5
     * 1 2 3 4
     * 1 2 3
     * 1 2
     * 1
     */
    static void leftInvertedNumAsc(int size){
        for (int i = 0; i < size ; i++){
            int count = 0;
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print(++count+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 6 5 4 3 2 1
     * 6 5 4 3 2
     * 6 5 4 3
     * 6 5 4
     * 6 5
     * 6
     */
    static void leftInvertedNumDesc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print(size-j+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * A A A A A A
     * B B B B B
     * C C C C
     * D D D
     * E E
     * F
     */
    static void leftInvertedAtoZRowAsc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print((char) ('A'+i)+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * F F F F F F
     * E E E E E
     * D D D D
     * C C C
     * B B
     * A
     */
    static void leftInvertedAtoZRowDesc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print((char) ('A'+size-1-i)+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 1 1 1 1 1 1
     * 2 2 2 2 2
     * 3 3 3 3
     * 4 4 4
     * 5 5
     * 6
     */
    static void leftInvertedNumRowAsc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print(i+1+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 6 6 6 6 6 6
     * 5 5 5 5 5
     * 4 4 4 4
     * 3 3 3
     * 2 2
     * 1
     */
    static void leftInvertedNumRowDesc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print(size-i+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * A B C D E F
     * B C D E F
     * C D E F
     * D E F
     * E F
     * F
     */
    static void leftInvertedAtoZColAsc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print((char) ('A'+i+j)+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * F E D C B A
     * E D C B A
     * D C B A
     * C B A
     * B A
     * A
     */
    static void leftInvertedAtoZColDesc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print((char) ('A'+size-1-i-j)+" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 6 5 4 3 2 1
     * 5 4 3 2 1
     * 4 3 2 1
     * 3 2 1
     * 2 1
     * 1
     */
    static void leftInvertedNumColDesc(int size){
        for (int i = 0; i < size ; i++){
            for (int j = 0 ; j < size ; j ++){
                if (j >= size-i){
                    System.out.print("  ");
                }else {
                    System.out.print(size-i-j+" ");
                }
            }
            System.out.println();
        }
    }
}
