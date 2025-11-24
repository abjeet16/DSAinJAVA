package leetCode.easy.stackQueue.MonotonicStack;

import java.util.Stack;

/// [...](https://youtu.be/y5CZ7LhqSAU)
/// 1475. Final Prices With a Special Discount in a Shop
public class FinalPricesWithASpecialDiscountInShop {
    public int[] finalPricesMonotonicStack(int[] prices){
        Stack<Integer> ms = new Stack<>();
        int len = prices.length;
        ms.add(0);
        for (int i = 1; i < len; i++) {
            while (!ms.isEmpty()||prices[ms.peek()]>=prices[i]){
                int idx = ms.pop();
                prices[idx]-=prices[i];
            }
            ms.push(i);
        }
        return prices;
    }
    public int[] finalPrices(int[] prices) {
        for (int i = 0; i < prices.length-1; i++) {
            int idx = getNextSmall(i+1,prices[i], prices);
            if (idx!=-1)
                prices[i]-=prices[idx];
        }
        return prices;
    }

    private int getNextSmall(int i,int target, int[] prices) {
        while(i< prices.length){
            if (prices[i]<=target)
                return i;
            i++;
        }
        return -1;
    }
}
