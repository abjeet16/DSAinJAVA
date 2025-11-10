package leetCode.easy.Arrays;

import java.util.Arrays;

/// 2706. Buy Two Chocolates
public class BuyTwoChocolates {
    public static int buyChoco(int[] prices, int money) {
        int min = Integer.MAX_VALUE , min2 = Integer.MAX_VALUE;
        for (int ele : prices)
            if (ele<=min){
                min2 = min;
                min = ele;
            }else if (ele<min2)
                min2=ele;
        System.out.println(min+" "+min2);
        if (min+min2<money)
            return money-(min+min2);
        else
            return money;
    }

    public static void main(String[] args) {
        int[] price = {98,54,6,34,66,63,52,39};
        int money = 62;
        System.out.println(buyChoco(price,money));
    }
}
