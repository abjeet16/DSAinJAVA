package QSpider.dailyProblems;

public class CatalanNumber {
    public static void main(String[] args) {
        generateCatalanNumber(10);
    }

    private static void generateCatalanNumber(int till) {
        for (int i = 1 ; i < till ; i++)
            System.out.print(findCatalan(i)+" ");
    }

    private static long findCatalan(int num) {
        return solveBinomial(num)/(num+1);
    }

    private static long solveBinomial(int num) {
        long denominator = 1;
        long numarator = 1;
        for (int i = 1; i <= num*2; i++){
            numarator*=i;
        }
        for (int i = 1;i<=num;i++){
            denominator*=i;
        }
        //System.out.println("num : "+numarator+" deno : "+denominator + " = "+numarator/(denominator*denominator));
        return numarator/(denominator *denominator);
    }
}
