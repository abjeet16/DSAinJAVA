package leetCode.easy.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//830. Positions of Large Groups
public class PositionsOfLargeGroups {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> res = new ArrayList<>();
        int len = s.length();
        for (int i = 0 ; i < len-2 ; i++){
            char curr = s.charAt(i);
            if (curr==s.charAt(i+1)&&curr==s.charAt(i+2)){
                int j = getLargeGroupEnd(i+3,s,len);
                List<Integer> currList = new ArrayList<>();
                currList.add(i);
                currList.add(j);
                res.add(currList);
                i += j-i;
            }
            System.out.println(i);
        }
        return res;
    }

    private int getLargeGroupEnd(int i,String s,int len) {
        while (i<len&&s.charAt(i-1)==s.charAt(i)){
            i++;
        }
        return --i;
    }
}
