package course.math;

public class divisorsOfNumber {
    public static void main(String[] args) {
        int num = 100;
        divisors(num);
    }
    static void divisors(int num){
        for(int i=1;i * i<=num;i++){
            if(num%i==0){
                System.out.println(i);
                if (i != num/i)
                    System.out.println(num/i);
            }
        }
    }
}
