package course.math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AllPrimeNumberTillN {
    public static void main(String[] args) {
        allPrimeNumberTillN(100);
    }
    static void allPrimeNumberTillN(int num){
        List<Boolean> isPrime = new ArrayList<>(Collections.nCopies(num,true));
        for (int i = 2; i < num; i++) {
            if (isPrime.get(i)) {
                System.out.print(i + " ");
                for (int j = i * i; j < num; j += i) {
                    isPrime.set(j,false);
                }
            }
        }
    }
}
