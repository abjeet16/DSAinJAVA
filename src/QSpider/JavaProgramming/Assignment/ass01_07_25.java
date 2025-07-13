package QSpider.JavaProgramming.Assignment;

public class ass01_07_25 {
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

    static void halfTriangleStar(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void halfTriangleCharAsc(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + j) + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangleCharDesc(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + size - j) + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangleNumDesc(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(size - j + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangleNumAsc(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangleChar(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + size - i + j - 1) + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangleChar1(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('A' + i - j) + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangleNum(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(size + j - i + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangleNum1(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(1 - j + i + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangleAtoZ(int size) {
        char ch = 'A';
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch++ + " ");
            }
            System.out.println();
        }
    }

    static void halfTriangle1And0(int size) {
        for (int i = 1; i < size; i++) {
            printSpaces(size - i - 1);
            for (int j = 1; j <= i; j++) {
                System.out.print(j % 2 + " ");
            }
            System.out.println();
        }
    }

    static void printSpaces(int count) {
        for (int k = 0; k < count; k++) {
            System.out.print("  ");
        }
    }
}

