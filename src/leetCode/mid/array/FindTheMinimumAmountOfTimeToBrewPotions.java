package leetCode.mid.array;

import java.util.Arrays;

/**<a href="https://youtu.be/nCutrlJaRBo">...</a>*/
public class FindTheMinimumAmountOfTimeToBrewPotions {
    public static long minTime(int[] skill, int[] mana) {
        if (mana.length==1&&skill.length==1)
            return (long) skill[0] *mana[0];
        long[] prevRow = new long[skill.length];
        long[] currRow = new long[skill.length];
        prevRow[0] = (long) skill[0] *mana[0];
        for (int i = 1 ; i < prevRow.length ; i++){
            prevRow[i] = prevRow[i-1]+ (long) mana[0] *skill[i];
        }
        if (mana.length==1)
            return prevRow[currRow.length-1];
        for (int manaI = 1 ; manaI < mana.length ; manaI++){
            currRow[0] = prevRow[0]+ (long) mana[manaI] *skill[0];
            for (int skillI = 1 ; skillI < skill.length ; skillI++){
                currRow[skillI] = Math.max(
                        prevRow[skillI]+ (long) mana[manaI] *skill[skillI],
                    currRow[skillI-1]+ (long) mana[manaI] *skill[skillI]
                );
            }

            for (int skillI = skill.length-2 ; skillI >= 0 ;skillI--){
                currRow[skillI] = currRow[skillI+1]- (long) mana[manaI] *skill[skillI+1];
            }
            prevRow = currRow.clone();
        }
        return currRow[currRow.length-1];
    }

    public static void main(String[] args) {
        int[] skill =  {1,5,2,4} , mana = {5,1,4,2};
        System.out.println(minTime(skill,mana));
    }
}
