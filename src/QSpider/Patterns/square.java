package QSpider.Patterns;

public class square {
    public static void main(String[] args) {
        hollowSquare(6);
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
}
