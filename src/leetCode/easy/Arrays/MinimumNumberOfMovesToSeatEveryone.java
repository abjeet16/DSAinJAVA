package leetCode.easy.Arrays;

import java.util.Arrays;
import java.util.Map;

/// 2037. Minimum Number of Moves to Seat Everyone
public class MinimumNumberOfMovesToSeatEveryone {
    public int minMovesToSeat(int[] seats, int[] students) {
        int res = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0 ; i < seats.length ;i++)
            res+= Math.abs(seats[i]-students[i]);
        return res;
    }
}
