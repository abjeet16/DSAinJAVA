package course.array.mid;

public class stockProfit {
    public static void main(String[] args) {
        int arr[] = {2,10,4,5,1,30,20,40};
        profit(arr);
    }

    private static void myway(int[] prices) {
        int profit = 0;
        int min = prices[0];
        int max = 0;
        for(int i = 1;i < prices.length;i++){
            if (prices[i]>min && max<prices[i]){
                max = prices[i];
            }
            if ((max>prices[i] || i == prices.length-1) && max!=0){
                System.out.println(max + "-" +min);
                profit+=(max-min);
                min = Integer.MAX_VALUE;
                max = 0;
            }
            if(min>prices[i]){
                min = prices[i];
                System.out.println(min);
            }
        }
        System.out.println(profit);
    }

    public static void profit(int[] prices) {
        int profit = 0;
        /*
        * for 2,10,4,5,1,30,40,50 this it starts form i1 = 10
        * and checks if 10 is greater than i1-1 = 2
        * if yes then profit = profit + 10-2
        * then  i becomes i2 = 4 but 4 is not grater than i2-1 = 10 so skip
        * then it goes to i3 = 5 , 5 is greater than 4 so profit += 5-4
        * then i = 1 skip, then i = 30 , here profit += 30-1, now i = 40 ,profit += 40-30 and so on
        * */
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                profit += (prices[i] - prices[i - 1]);
            }
        }
        System.out.println(profit);
    }
}
