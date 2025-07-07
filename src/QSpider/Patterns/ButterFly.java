package QSpider.Patterns;

public class ButterFly {
    public static void main(String[] args) {
        int size = 7;
        starButterFly(size);
        rightStarHalfButterFly(size);
        topToBottomButterFly(size);
        horizontalButterFly(size);
        pattern1(size);
        pattern2(size);
    }

    /**
     * * _ _ _
     * * * _ _
     * * * * _
     * * * * *
     * * * * _
     * * * _ _
     * * _ _ _
     * @param n
     */
    static void starButterFly(int n){
        System.out.println();
        System.out.println("-----------starButterFly-----------");
        if (n%2==0){
            System.out.println("invalid size , it cant be a even number");
            return;
        }
        int starCount = 1;
        int spaceCount = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < starCount ; j++){
                System.out.print("* ");
            }
            for (int j = 0 ; j < spaceCount ; j++){
                System.out.print("_ ");
            }
            if (i < n/2){
                starCount++;
                spaceCount--;
            }else {
                starCount--;
                spaceCount++;
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ *
     * _ _ * *
     * _ * * *
     * * * * *
     * _ * * *
     * _ _ * *
     * _ _ _ *
     * @param n
     */
    static void rightStarHalfButterFly(int n){
        System.out.println();
        System.out.println("-----------rightStarHalfButterFly-----------");
        if (n%2==0){
            System.out.println("invalid size , it cant be a even number");
            return;
        }
        int starCount = 1;
        int spaceCount = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < spaceCount ; j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < starCount ; j++){
                System.out.print("* ");
            }
            if (i < n/2){
                starCount++;
                spaceCount--;
            }else {
                starCount--;
                spaceCount++;
            }
            System.out.println();
        }
    }

    /**
     * * * * * * * *
     * _ * * * * * _
     * _ _ * * * _ _
     * _ _ _ * _ _ _
     * _ _ * * * _ _
     * _ * * * * * _
     * * * * * * * *
     * @param n
     */
    static void topToBottomButterFly(int n){
        System.out.println();
        System.out.println("-----------topToBottomButterFly-----------");
        if (n%2==0){
            System.out.println("invalid size , it cant be a even number");
            return;
        }
        int starCount = n;
        int spaceCount = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < spaceCount/2 ; j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < starCount ; j++){
                System.out.print("* ");
            }
            for (int j = 0 ; j < spaceCount/2 ; j++){
                System.out.print("_ ");
            }
            if (i < n/2){
                starCount-=2;
                spaceCount+=2;
            }else {
                starCount+=2;
                spaceCount-=2;
            }
            System.out.println();
        }
    }

    /**
     * * _ _ _ _ _ _ *
     * * * _ _ _ _ * *
     * * * * _ _ * * *
     * * * * * * * * *
     * * * * _ _ * * *
     * * * _ _ _ _ * *
     * * _ _ _ _ _ _ *
     * @param n
     */
    static void horizontalButterFly(int n){
        System.out.println();
        System.out.println("-----------horizontalButterFly-----------");
        if (n%2==0){
            System.out.println("invalid size , it cant be a even number");
            return;
        }
        int starCount = 1;
        int spaceCount = n-1;
        for (int i = 0; i < n; i++) {
            for (int j = 0 ; j < starCount ; j++){
                System.out.print("* ");
            }
            for (int j = 0 ; j < spaceCount; j++){
                System.out.print("_ ");
            }
            for (int j = 0 ; j < starCount ; j++){
                System.out.print("* ");
            }
            if (i < n/2){
                starCount++;
                spaceCount-=2;
            }else {
                starCount--;
                spaceCount+=2;
            }
            System.out.println();
        }
    }

    /**
     * _ _ _ _ _ _ * * * * * * *
     * _ _ _ _ _ * * * * * * *
     * _ _ _ _ * * * * * * *
     * _ _ _ * * * * * * *
     * _ _ * * * * * * *
     * _ * * * * * * *
     * * * * * * * *
     * @param n
     */
    static void pattern1(int n){
        System.out.println();
        System.out.println("-----------pattern1-----------");
        int space = n-1;
        for (int i = 0; i < n ; i ++){
            for (int j = 0 ; j < space ; j++){
                System.out.print("_ ");
            }for (int j = 0 ; j < n; j++){
                System.out.print("* ");
            }
            space--;
            System.out.println();
        }
    }

    /**
     * * * * * * * *
     * _ * * * * * * *
     * _ _ * * * * * * *
     * _ _ _ * * * * * * *
     * _ _ _ _ * * * * * * *
     * _ _ _ _ _ * * * * * * *
     * _ _ _ _ _ _ * * * * * * *
     * @param n
     */
    static void pattern2(int n){
        System.out.println();
        System.out.println("-----------pattern2-----------");
        int space = 0;
        for (int i = 0; i < n ; i ++){
            for (int j = 0 ; j < space ; j++) {
                System.out.print("_ ");
            }
            for (int j = 0 ; j < n; j++){
                System.out.print("* ");
            }
            space++;
            System.out.println();
        }
    }
}
