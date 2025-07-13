package QSpider.JavaProgramming.Patterns;

public class pyramid {
    public static void main(String[] args) {
        pyramidStar(6);
        pyramidAtoZRowAsc(6);
        pyramidAtoZRowDesc(6);
        pyramidAtoZColAsc(6);
        pyramidAtoZRowDescLeftAscRight(6);
        pyramidNumRowAscLeftDescRight(6);
        pyramidAtoZRowDescRightAscLeft(6);
        pyramidNumRowDescRightAscLeft(6);
        pyramidAtoZRowDescFromLeft(6);
        pyramidNumRowDescFromLeft(5);
        pyramid1And0StartWith1(6);
        pyramid1And0EvenOddCol(6);
        pyramid1And0EvenOddRow(6);
    }

    /**
     * _ _ _ * _ _ _
     * _ _ * * * _ _
     * _ * * * * * _
     * * * * * * * *
     */
    static void pyramidStar(int size){
        System.out.println();
        System.out.println("------------------pyramidStar------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < col ; j++){
                if (j> col/2-i &&j < col/2+i){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ A _ _ _ _ _
     * _ _ _ _ B B B _ _ _ _
     * _ _ _ C C C C C _ _ _
     * _ _ D D D D D D D _ _
     * _ E E E E E E E E E _
     * F F F F F F F F F F F
     */
    static void pyramidAtoZRowAsc(int size){
        System.out.println();
        System.out.println("------------------pyramidAtoZRowAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < col ; j++){
                if (j>= col/2-i &&j <= col/2+i){
                    System.out.print((char) ('A'+i)+" ");
                }else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ G _ _ _ _ _
     * _ _ _ _ F F F _ _ _ _
     * _ _ _ E E E E E _ _ _
     * _ _ D D D D D D D _ _
     * _ C C C C C C C C C _
     * B B B B B B B B B B B
     * @param size
     */
    static void pyramidAtoZRowDesc(int size){
        System.out.println();
        System.out.println("------------------pyramidAtoZRowDesc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < col ; j++){
                if (j>= col/2-i &&j <= col/2+i){
                    System.out.print((char) ('A'+size-i)+" ");
                }else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ A _ _ _
     * _ _ B A B _ _
     * _ C B A B C _
     * D C B A B C D
     */
    static void pyramidAtoZRowDescLeftAscRight(int size) {
        System.out.println();
        System.out.println("------------------pyramidAtoZRowDescLeftAscRight------------");
        int col = size * 2 - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    int dist = Math.abs(j - (size - 1));
                    System.out.print((char)('A' + dist) + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ 0 _ _ _ _ _
     * _ _ _ _ 1 0 1 _ _ _ _
     * _ _ _ 2 1 0 1 2 _ _ _
     * _ _ 3 2 1 0 1 2 3 _ _
     * _ 4 3 2 1 0 1 2 3 4 _
     * 5 4 3 2 1 0 1 2 3 4 5
     * @param size
     */
    static void pyramidNumRowAscLeftDescRight(int size) {
        System.out.println();
        System.out.println("------------------pyramidNumRowAscLeftDescRight------------");
        int col = size * 2 - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    int dist = Math.abs(j - (size -1));
                    System.out.print(dist + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ A _ _ _ _ _
     * _ _ _ _ A B C _ _ _ _
     * _ _ _ A B C D E _ _ _
     * _ _ A B C D E F G _ _
     * _ A B C D E F G H I _
     * A B C D E F G H I J K
     * @param size
     */
    static void pyramidAtoZColAsc(int size){
        System.out.println();
        System.out.println("------------------pyramidAtoZColAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            char ch = 'A';
            for (int j = 0 ; j < col ; j++){
                if (j>= col/2-i && j <= col/2+i ) {
                    System.out.print(ch++ +" ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ F _ _ _ _ _
     * _ _ _ _ E F E _ _ _ _
     * _ _ _ D E F E D _ _ _
     * _ _ C D E F E D C _ _
     * _ B C D E F E D C B _
     * A B C D E F E D C B A
     * @param size
     */
    static void pyramidAtoZRowDescRightAscLeft(int size) {
        System.out.println();
        System.out.println("------------------pyramidAtoZRowDescRightAscLeft------------");
        int col = size * 2 - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    int dist = Math.abs(j - (size - 1));
                    System.out.print((char)('A'+size-1- dist) + " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ 5 _ _ _ _ _
     * _ _ _ _ 4 5 4 _ _ _ _
     * _ _ _ 3 4 5 4 3 _ _ _
     * _ _ 2 3 4 5 4 3 2 _ _
     * _ 1 2 3 4 5 4 3 2 1 _
     * 0 1 2 3 4 5 4 3 2 1 0
     * @param size
     */
    static void pyramidNumRowDescRightAscLeft(int size) {
        System.out.println();
        System.out.println("------------------pyramidNumRowDescRightAscLeft------------");
        int col = size * 2 - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    int dist = Math.abs(j - (size - 1));
                    System.out.print(size-1 -dist+ " ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ A _ _ _ _ _
     * _ _ _ _ C B A _ _ _ _
     * _ _ _ E D C B A _ _ _
     * _ _ G F E D C B A _ _
     * _ I H G F E D C B A _
     * K J I H G F E D C B A
     * @param size
     */
    static void pyramidAtoZRowDescFromLeft(int size){
        System.out.println();
        System.out.println("------------------pyramidAtoZRowDescFromRight------------");
        int col = size * 2 - 1;

        for (int i = 0; i < size; i++) {
            char ch = (char)('A'+2*i);
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    System.out.print(ch--+" ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ A _ _ _ _ _
     * _ _ _ _ C B A _ _ _ _
     * _ _ _ E D C B A _ _ _
     * _ _ G F E D C B A _ _
     * _ I H G F E D C B A _
     * K J I H G F E D C B A
     * @param size
     */
    static void pyramidNumRowDescFromLeft(int size){
        System.out.println();
        System.out.println("------------------pyramidNumRowDescFromLeft------------");
        int col = size * 2 - 1;

        for (int i = 0; i < size; i++) {
            int count = 2 * i+1;
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    System.out.print(count--+" ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ 1 _ _ _ _ _
     * _ _ _ _ 1 0 1 _ _ _ _
     * _ _ _ 1 0 1 0 1 _ _ _
     * _ _ 1 0 1 0 1 0 1 _ _
     * _ 1 0 1 0 1 0 1 0 1 _
     * 1 0 1 0 1 0 1 0 1 0 1
     * @param size
     */
    static void pyramid1And0StartWith1(int size){
        System.out.println();
        System.out.println("------------------pyramid1And0StartWith1------------");
        int col = size * 2 - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    System.out.print((i+j)%2+" ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ 1 _ _ _ _ _
     * _ _ _ _ 0 1 0 _ _ _ _
     * _ _ _ 1 0 1 0 1 _ _ _
     * _ _ 0 1 0 1 0 1 0 _ _
     * _ 1 0 1 0 1 0 1 0 1 _
     * 0 1 0 1 0 1 0 1 0 1 0
     * @param size
     */
    static void pyramid1And0EvenOddCol(int size){
        System.out.println();
        System.out.println("------------------pyramid1And0EvenOdd------------");
        int col = size * 2 - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    System.out.print(j%2+" ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ 1 _ _ _ _ _
     * _ _ _ _ 0 0 0 _ _ _ _
     * _ _ _ 1 1 1 1 1 _ _ _
     * _ _ 0 0 0 0 0 0 0 _ _
     * _ 1 1 1 1 1 1 1 1 1 _
     * 0 0 0 0 0 0 0 0 0 0 0
     */
    static void pyramid1And0EvenOddRow(int size){
        System.out.println();
        System.out.println("------------------pyramid1And0EvenOddRow------------");
        int col = size * 2 - 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < col; j++) {
                if (j >= size - 1 - i && j <= size - 1 + i) {
                    System.out.print(((i%2==0)?1:0)+" ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }


}
