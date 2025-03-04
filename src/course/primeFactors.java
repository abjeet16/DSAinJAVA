package course;

public class primeFactors {
    public static void main(String[] args) {
        int num = 13;
        primeFactors(num);
        primeFactorsOptimized(num);
    }
    static void primeFactors(int num){
        if (num <= 1) return;
        System.out.println("Prime Factors of " + num + ": ");
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                int x = i;
                while (num % x == 0) {
                    System.out.print(x +" ");
                    num /= x;
                }
            }
        }
        if (num > 1) System.out.println(num);
    }

    static void primeFactorsOptimized(int num){
        if (num <= 1) return;
        System.out.println("Prime Factors of " + num + ": ");
        if (num % 2 == 0) {
            System.out.print(2 + " ");
            num /= 2;
        } else if (num%3==0) {
            System.out.print(3 + " ");
            num /= 3;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0) {
                System.out.print(i + " ");
                num /= i;
            } else if (num % (i + 2) == 0) {
                System.out.print(i + 2 + " ");
                num /= (i + 2);
            }
        }
        if (num > 1) System.out.println(num);
    }
}
