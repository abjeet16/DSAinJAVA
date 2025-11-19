package leetCode.easy.math;

/// 2582. Pass the Pillow
public class PassThePillow {
    public int passThePillow(int n, int time) {
        n--;
        int rounds = time/n;
        if (rounds%2!=0){
            return n+1-time%n;
        }else {
            return time%n;
        }
    }
}
