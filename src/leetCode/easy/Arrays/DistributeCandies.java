package leetCode.easy.Arrays;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int i : candyType)
            set.add(i);
        if(set.size()>candyType.length)
            return candyType.length/2;
        else
            return set.size();
    }
}
