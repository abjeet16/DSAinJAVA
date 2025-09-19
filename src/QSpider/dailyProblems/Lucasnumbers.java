package QSpider.dailyProblems;

public class Lucasnumbers {
    public static void main(String[] args) {
        generateLucasNumber(2,1,1,100);
    }

    private static void generateLucasNumber(int num1, int num2, int count, int till) {
        if (count==till)
            return;
        if (count==1){
            System.out.print(num1+" ");
        }
        System.out.print(num2+" ");
        generateLucasNumber(num2,num1+num2,count+1,till);
    }
}
