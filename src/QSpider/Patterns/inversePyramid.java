package QSpider.Patterns;

public class inversePyramid {
    public static void main(String[] args) {
        invertedPyramidStarEasyWay(6);
        invertedPyramidStar(6);
        invertedPyramidAtoZRowAsc(6);
        invertedPyramidNumRowAsc(6);
        invertedPyramidAtoZRowDesc(6);
        invertedPyramidNumRowDesc(6);
        invertedPyramidAtoZColAsc(6);
        invertedPyramidNumColAsc(6);
        invertedPyramidAtoZDescLeftAscRight(5);
        invertedPyramidAtoZAscLeftDescRight(5);
    }

    /**
     * * * * * * * * * * * *
     * _ * * * * * * * * * _
     * _ _ * * * * * * * _ _
     * _ _ _ * * * * * _ _ _
     * _ _ _ _ * * * _ _ _ _
     * _ _ _ _ _ * _ _ _ _ _
     */
    static void invertedPyramidStarEasyWay(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------pyramidStar------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                System.out.print("* ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
        /**
         * * * * * * * * * * * *
         * _ * * * * * * * * * _
         * _ _ * * * * * * * _ _
         * _ _ _ * * * * * _ _ _
         * _ _ _ _ * * * _ _ _ _
         * _ _ _ _ _ * _ _ _ _ _
         */
    }

    /**
     * A A A A A A A A A A A
     * _ B B B B B B B B B _
     * _ _ C C C C C C C _ _
     * _ _ _ D D D D D _ _ _
     * _ _ _ _ E E E _ _ _ _
     * _ _ _ _ _ F _ _ _ _ _
     * @param size
     */
    static void invertedPyramidAtoZRowAsc(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------invertedPyramidAtoZRowAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                System.out.print((char) ('A'+i)+" ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
        /**
         * * * * * * * * * * * *
         * _ * * * * * * * * * _
         * _ _ * * * * * * * _ _
         * _ _ _ * * * * * _ _ _
         * _ _ _ _ * * * _ _ _ _
         * _ _ _ _ _ * _ _ _ _ _
         */
    }

    /**
     * 1 1 1 1 1 1 1 1 1 1 1
     * _ 2 2 2 2 2 2 2 2 2 _
     * _ _ 3 3 3 3 3 3 3 _ _
     * _ _ _ 4 4 4 4 4 _ _ _
     * _ _ _ _ 5 5 5 _ _ _ _
     * _ _ _ _ _ 6 _ _ _ _ _
     * @param size
     */
    static void invertedPyramidNumRowAsc(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------invertedPyramidAtoZRowAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                System.out.print(i+1+" ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }

    /**
     * F F F F F F F F F F F
     * _ E E E E E E E E E _
     * _ _ D D D D D D D _ _
     * _ _ _ C C C C C _ _ _
     * _ _ _ _ B B B _ _ _ _
     * _ _ _ _ _ A _ _ _ _ _
     * @param size
     */
    static void invertedPyramidAtoZRowDesc(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------invertedPyramidAtoZRowAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                System.out.print((char) ('A'+size-1-i)+" ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }

    /**
     * 6 6 6 6 6 6 6 6 6 6 6
     * _ 5 5 5 5 5 5 5 5 5 _
     * _ _ 4 4 4 4 4 4 4 _ _
     * _ _ _ 3 3 3 3 3 _ _ _
     * _ _ _ _ 2 2 2 _ _ _ _
     * _ _ _ _ _ 1 _ _ _ _ _
     * @param size
     */
    static void invertedPyramidNumRowDesc(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------invertedPyramidNumRowDesc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                System.out.print(size-i+" ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }

    /**
     * A B C D E F G H I J K
     * _ A B C D E F G H I _
     * _ _ A B C D E F G _ _
     * _ _ _ A B C D E _ _ _
     * _ _ _ _ A B C _ _ _ _
     * _ _ _ _ _ A _ _ _ _ _
     * @param size
     */
    static void invertedPyramidAtoZColAsc(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------invertedPyramidAtoZColAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                System.out.print((char) ('A'+j)+" ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }

    /**
     * 1 2 3 4 5 6 7 8 9 10 11
     * _ 1 2 3 4 5 6 7 8 9 _
     * _ _ 1 2 3 4 5 6 7 _ _
     * _ _ _ 1 2 3 4 5 _ _ _
     * _ _ _ _ 1 2 3 _ _ _ _
     * _ _ _ _ _ 1 _ _ _ _ _
     * @param size
     */
    static void invertedPyramidNumColAsc(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------invertedPyramidNumColAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                System.out.print(j+1+" ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }


    /**
     E D C B A B C D E
     _ D C B A B C D _
     _ _ C B A B C _ _
     _ _ _ B A B _ _ _
     _ _ _ _ A _ _ _ _
     * @param size
     */
    static void invertedPyramidAtoZDescLeftAscRight(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------invertedPyramidAtoZColAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                int dis = Math.abs(size-i-j-1);
                System.out.print((char) ('A'+dis)+" ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }

    //to do 
    static void invertedPyramidAtoZAscLeftDescRight(int size){
        //Sir's Way
        System.out.println();
        System.out.println("------------------invertedPyramidAtoZColAsc------------");
        int col = size*2 - 1;
        for (int i = 0 ; i < size ; i++){
            char ch = 'A';
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < col-2*i ; j++){
                int dis = Math.abs(size-j-1);
                System.out.print((char)('A'+dis)+" ");
            }
            for (int x = 0; x<i;x++){
                System.out.print("_ ");
            }
            System.out.println();
        }
    }

    static void invertedPyramidStar(int size){
        System.out.println();
        System.out.println("------------invertedPyramidStar------------");
        int col = size * 2 - 1;
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < col ; j++){
                if (j >= i && j <= col - i-1){
                    System.out.print("* ");
                } else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
}
