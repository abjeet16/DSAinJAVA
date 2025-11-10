package leetCode.easy.hashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/// 1496. Path Crossing
public class PathCrossing {
    ///'N', 'S', 'E', or 'W'.
    public static boolean isPathCrossing(String path) {
        HashSet<String> set = new HashSet<>();
        int x = 0 , y = 0 ;
        set.add(x+","+y);
        for (char ch : path.toCharArray()){
            if (ch=='N')
                x++;
            else if (ch=='S')
                x--;
            else if (ch=='E')
                y++;
            else
                y--;
            if (!set.add(x+","+y))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String path = "NEEEEEEEEEENNNNNNNNNNWWWWWWWWWW";
        System.out.println(isPathCrossing(path));
    }
}
