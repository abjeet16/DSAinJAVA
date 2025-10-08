package leetCode.mid.array;

import java.util.Arrays;

public class SuccessfulPairsOfSpellsAndPotions {
    public static int[] successfulPairs(int[] spells, int[] potions, long success) {
        Arrays.sort(potions);
        for (int i = 0 ; i < spells.length ; i++){
            int currAns = SearchSuccessfulPair(spells[i],potions,success);
            spells[i] = currAns;
        }
        return spells;
    }

    private static int SearchSuccessfulPair(int spell, int[] potions, long success) {
        int right = potions.length-1 , left = 0 , res = 0 ;
        while (right>=left){
            int mid = (right+left)/2;
            if (success/spell==potions[mid]){
                return potions.length-mid;
            } else if (success/spell < potions[mid]) {
                res = potions.length-mid;
                right = mid-1;
            } else {
                left = mid +1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {5,1,3},arr2 = {1,2,3,4,5};
        int success = 7;
        System.out.println(Arrays.toString(successfulPairs(arr1, arr2, success)));
    }
}
