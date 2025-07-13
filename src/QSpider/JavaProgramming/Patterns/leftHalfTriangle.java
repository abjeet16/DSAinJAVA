package QSpider.JavaProgramming.Patterns;

public class leftHalfTriangle {
    public static void main(String[] args) {
        halfTriangleStar(6);
        halfTriangleCharAsc(6);
        halfTriangleCharDesc(6);
        halfTriangleNumDesc(6);
        halfTriangleNumAsc(6);
        halfTriangleChar(6);
        halfTriangleChar1(6);
        halfTriangleNum(6);
        halfTriangleNum1(6);
        halfTriangleAtoZ(6);
        halfTriangle1And0(6);
    }
    /*
     *
     * *
     * * *
     * * * *
     * * * * *
     * */
    static void halfTriangleStar(int size){
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
     * A
     * A B
     * A B C
     * A B C D
     * A B C D E
     * A B C D E F
    * */
    static void halfTriangleCharAsc(int size){
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print((char) ('A'+j)+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
     * G
     * G F
     * G F E
     * G F E D
     * G F E D C
     * G F E D C B
     * */
    static void halfTriangleCharDesc(int size){
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print((char) ('A'+size-j)+ " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
     * 6
     * 6 5
     * 6 5 4
     * 6 5 4 3
     * 6 5 4 3 2
     * 6 5 4 3 2 1
     * */
    static void halfTriangleNumDesc(int size){
        for (int i = 0 ; i < size ; i++){

            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print(size-j +" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
     * 1
     * 1 2
     * 1 2 3
     * 1 2 3 4
     * 1 2 3 4 5
     * 1 2 3 4 5 6
     * */
    static void halfTriangleNumAsc(int size){
        for (int i = 0 ; i < size ; i++){

            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print(j+1+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
    * E
    * D E
    * C D E
    * B C D E
    * A B C D E
    * */
    static void halfTriangleChar(int size){
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print((char) ('A'+size-i+j)+ " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
    * A
    * B A
    * C B A
    * D C B A
    * E D C B A
    * */
    static void halfTriangleChar1(int size){
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print((char) ('A'+i-j)+ " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
    *6
    *5 6
    *4 5 6
    *3 4 5 6
    *2 3 4 5 6
    * */
    static void halfTriangleNum(int size){
        for (int i = 0 ; i < size ; i++){

            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print(size+j-i+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
    *1
    *2 1
    *3 2 1
    *4 3 2 1
    *5 4 3 2 1
    * */
    static void halfTriangleNum1(int size){
        for (int i = 0 ; i < size ; i++){

            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print(1-j+i+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
    * A
    * B C
    * D E F
    * G H I J
    * K L M N O
    * */
    static void halfTriangleAtoZ(int size){
        char ch = 'A';
        for (int i = 0 ; i < size ; i++){
            for (int j = 0 ; j < size ; j++){
                if (i >= j){
                    System.out.print(ch++ + " ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    /**
     * 1
     * 1 0
     * 1 0 1
     * 1 0 1 0
     * 1 0 1 0 1
     */
    static void halfTriangle1And0(int size){
        for (int i = 1 ; i < size ; i++){
            for (int j = 1 ; j < size ; j++){
                if (i >= j){
                    System.out.print(j%2+" ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
