package leetCode.easy.math;

/// 1688. Count of Matches in Tournament
public class CountOfMatchesInTournament {
    public static int numberOfMatches(int n) {
        int res = 0;
        while (n!=1){
            res+=n/2;
            if (n%2==0) {
                n /= 2;
            }else {
                n = n / 2 + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numberOfMatches(7));
    }
}
