package leetCode.mid.math;

public class WaterBottles2 {
    public static int numWaterBottles(int numBottles, int numExchange) {
        int totalDrunk = 0;
        int emptyBottles = 0;
        System.out.printf("%-10s %-10s %-10s %-10s%n",
                "Full", "Empty", "Exchange", "Drunk");
        while (numBottles!=0||emptyBottles>=numExchange){
            System.out.printf("%-10d %-10d %-10d %-10d%n",
                    numBottles, emptyBottles, numExchange, totalDrunk);
            if(emptyBottles>=numExchange){
                numBottles++;
                emptyBottles-=numExchange;
                numExchange++;
            }else{
                emptyBottles+=numBottles;
                totalDrunk+=numBottles;
                numBottles=0;
            }
        }
        System.out.printf("%-10d %-10d %-10d %-10d%n",
                numBottles, emptyBottles, numExchange, totalDrunk);
        return totalDrunk;
    }

    public static void main(String[] args) {
        System.out.println(numWaterBottles(10,3));
    }
}
