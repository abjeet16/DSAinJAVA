package leetCode.easy.bitManipulation;

/// 476. Number Complement
public class NumberComplement {
    public static int findComplement(int num) {
        int res = 0;
        int twoPower = 1;
        while (num!=0){
            res+=(num%2==1?0:1)*twoPower;
            twoPower*=2;
            num/=2;
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }
}
