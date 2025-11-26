package leetCode.mid.math;

public class SmallestIntegerDivisibleByK {
    public int smallestRepunitDivByK(int k) {
        if (k%2==0||k%5==0)
            return -1;
        int num = 0;
        for (int i = 0; i < k; i++) {
            num = (num*10+1)%k;
            if (num==0)
                return i+1;
        }
        return -1;
    }
}
