package QSpider.JavaProgramming.Patterns;

public class square {
    public static void main(String[] args) {
        hollowSquare(6);
        hollowTriangle(9);
        invertedHollowTriangle(9);
        HollowDimond(9);
        doubleHollowTrangle(9);
        hollowSquareWithDiagonals(9);
        hollowSquareWithDiagonals1(9);
        hollowSquareWithDiagonals2(9);
        filledDimond(9);
    }

    /**
     * * * * * *
     * _ _ _ _ *
     * _ _ _ _ *
     * _ _ _ _ *
     * _ _ _ _ *
     * * * * * *
     */
    static void hollowSquare(int n){
        System.out.println("-------------hollowSquare-------------");
        for (int i = 1 ; i<=n; i ++){
            for (int j = 1 ; j<= n ; j++){
                if (i == 1||j==1||i==n||j==n)
                    System.out.print("* ");
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ * _ _ _ _
     * _ _ _ * _ * _ _ _
     * _ _ * _ _ _ * _ _
     * _ * _ _ _ _ _ * _
     * * * * * * * * * *
     * @param n
     */
    static void hollowTriangle(int n){
        System.out.println("-------------HollowTriangle-------------");
        for (int i = 0 ; i <= n/2 ; i ++){
            for (int j = 0 ; j < n ; j++){
                if (i==n/2){
                    System.out.print("* ");
                    continue;
                }
                if (j == n/2+i||j == n/2-i){
                    System.out.print("* ");
                }else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * * * * * * * * * *
     * _ * _ _ _ _ _ * _
     * _ _ * _ _ _ * _ _
     * _ _ _ * _ * _ _ _
     * _ _ _ _ * _ _ _ _
     * @param n
     */
    static void invertedHollowTriangle(int n){
        System.out.println("-------------invertedHollowTriangle-------------");
        for (int i = 0 ; i <= n/2 ; i ++){
            for (int j = 0 ; j < n ; j++){
                if (i==0){
                    System.out.print("* ");
                    continue;
                }
                if (j == i||j == n-i-1){
                    System.out.print("* ");
                }else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ * _ _ _ _
     * _ _ _ * _ * _ _ _
     * _ _ * _ _ _ * _ _
     * _ _ _ * _ * _ _ _
     * _ _ _ _ * _ _ _ _
     * @param n
     */
    static void HollowDimond(int n){
        System.out.println("-------------HollowDimond-------------");
        for (int i = 0 ; i <= n/2 ; i ++){
            for (int j = 0 ; j < n ; j++){
                if (i < n/4){
                    if (j == n/2+i||j == n/2-i){
                        System.out.print("* ");
                    }else {
                        System.out.print("_ ");
                    }
                }else {
                    if (j == i||j == n-i-1){
                        System.out.print("* ");
                    }else {
                        System.out.print("_ ");
                    }
                }
            }
            System.out.println();
        }
    }

    /**
     * * * * * * * * * *
     * _ * _ _ _ _ _ * _
     * _ _ * _ _ _ * _ _
     * _ _ _ * _ * _ _ _
     * _ _ _ _ * _ _ _ _
     * _ _ _ * _ * _ _ _
     * _ _ * _ _ _ * _ _
     * _ * _ _ _ _ _ * _
     * * * * * * * * * *
     * @param n
     */
    static void doubleHollowTrangle(int n){
        for (int i = 0 ; i <= n/2 ; i ++){
            for (int j = 0 ; j < n ; j++){
                if (i==0){
                    System.out.print("* ");
                    continue;
                }
                if (j == i||j == n-i-1){
                    System.out.print("* ");
                }else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
        for (int i = 1 ; i <= n/2 ; i ++){
            for (int j = 0 ; j < n ; j++){
                if (i==n/2){
                    System.out.print("* ");
                    continue;
                }
                if (j == n/2+i||j == n/2-i){
                    System.out.print("* ");
                }else {
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }

    /**
     * * * * * * * * *
     * * _ _ _ _ _ * *
     * _ * _ _ _ * _ *
     * _ _ * _ * _ _ *
     * _ _ _ * _ _ _ *
     * _ _ * _ * _ _ *
     * _ * _ _ _ * _ *
     * * _ _ _ _ _ * *
     * * * * * * * * *
     */
    static void hollowSquareWithDiagonals(int n){
        System.out.println("-------------hollowSquareWithDiagonals-------------");
        for (int i = 1 ; i<=n; i ++){
            for (int j = 1 ; j<= n ; j++){
                /**
                 * i==1 for first row
                 * j==1 for first column
                 * i==n for last row
                 * j==n for last column
                 * i==n/2+1 for mid row
                 *
                 */
                if (i == 1||j==1||i==n||j==n||j==i||j==n-i+1)
                    System.out.print("* ");
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }

    /**
     * * * * * * * * * *
     * * _ _ _ * _ _ _ *
     * * _ _ _ * _ _ _ *
     * * _ _ _ * _ _ _ *
     * * * * * * * * * *
     * * _ _ _ * _ _ _ *
     * * _ _ _ * _ _ _ *
     * * _ _ _ * _ _ _ *
     * * * * * * * * * *
     * @param n
     */
    static void hollowSquareWithDiagonals1(int n){
        System.out.println("-------------hollowSquareWithDiagonals1-------------");
        for (int i = 1 ; i<=n; i ++){
            for (int j = 1 ; j<= n ; j++){
                /**
                 * i==1 for first row
                 * j==1 for first column
                 * i==n for last row
                 * j==n for last column
                 * i==n/2+1 for mid row
                 * j==n/2+1 for mid column
                 */
                if (i == 1||j==1||i==n||j==n||i==n/2+1||j==n/2+1)
                    System.out.print("* ");
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }

    /**
     * * * * * * * * * *
     * * * _ _ * _ _ * *
     * * _ * _ * _ * _ *
     * * _ _ * * * _ _ *
     * * * * * * * * * *
     * * _ _ * * * _ _ *
     * * _ * _ * _ * _ *
     * * * _ _ * _ _ * *
     * * * * * * * * * *
     * @param n
     */
    static void hollowSquareWithDiagonals2(int n){
        System.out.println("-------------hollowSquareWithDiagonals1-------------");
        for (int i = 1 ; i<=n; i ++){
            for (int j = 1 ; j<= n ; j++){
                /**
                 * i==1 for first row
                 * j==1 for first column
                 * i==n for last row
                 * j==n for last column
                 * i==n/2+1 for mid row
                 * j==n/2+1 for mid column
                 * i==j and j==n-i+1 for diagonals
                 */
                if (i == 1||j==1||i==n||j==n||j==i||j==n-i+1||i==n/2+1||j==n/2+1)
                    System.out.print("* ");
                else
                    System.out.print("_ ");
            }
            System.out.println();
        }
    }

    static void filledDimond(int n){
        System.out.println("-------------HollowDimond-------------");
        int spaceCount = n-1;
        int charCount = 1;
        for (int i = 0 ; i <= n ; i ++){
            for (int j = 0 ; j < spaceCount/2; j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j<charCount; j++){
                if (j%2==0){
                    System.out.print("* ");
                }else{
                    System.out.print("$ ");
                }
            }
            for (int j = 0 ; j < spaceCount/2; j++){
                System.out.print("_ ");
            }
            if (i<n/2){
                spaceCount-=2;
                charCount+=2;
            }else {
                spaceCount+=2;
                charCount-=2;
            }
            System.out.println();
        }
    }

}
