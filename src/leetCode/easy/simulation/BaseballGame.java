package leetCode.easy.simulation;

import java.util.Arrays;

/// 682. Baseball Game
public class BaseballGame {
    /**
     * An integer x.
     * Record a new score of x.
     * '+'.
     * Record a new score that is the sum of the previous two scores.
     * 'D'.
     * Record a new score that is the double of the previous score.
     * 'C'.
     * Invalidate the previous score, removing it from the record.
     */
    public static int calPoints(String[] operations) {
        int score = 0;
        int len = operations.length;
        int[] resArr = new int[len];
        int idx = 0;
        for (String operation : operations) {
            char ch = operation.charAt(0);
            if (ch=='C') {
                score-=resArr[idx-1];
                idx -= 2;
            } else if (ch == '+') {
                resArr[idx] = resArr[idx - 1] + resArr[idx - 2];
                score += resArr[idx];
            } else if (ch == 'D') {
                resArr[idx] = resArr[idx - 1] * 2;
                score += resArr[idx];
            } else {
                resArr[idx] = Integer.parseInt(operation);
                score += resArr[idx];
            }
            System.out.println(Arrays.toString(resArr));
            System.out.println("op "+operation+" score "+score+" idx : "+idx);
            idx++;
        }
        return score;
    }

    public static void main(String[] args) {
        String[] score = {"1","C","-62","-45","-68"};
        System.out.println(calPoints(score));
    }
}
