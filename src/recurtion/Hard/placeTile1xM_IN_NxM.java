package recurtion.Hard;

public class placeTile1xM_IN_NxM {
    public static void main(String[] args) {
        int n = 4,m=2;
        System.out.println(placeTile(n,m));
    }

    private static int placeTile(int n, int m) {
        if (n==m){
            return 2;
        }
        if (n<m){
            return 1;
        }
        // if the tile is placed horizontal
        int horizontal = placeTile(n-1,m);
        // if he tile is placed vertically
        int vertical = placeTile(n-m,m);

        return horizontal+vertical;
    }
}
