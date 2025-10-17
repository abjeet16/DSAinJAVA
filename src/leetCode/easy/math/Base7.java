package leetCode.easy.math;

//504. Base 7
public class Base7 {
    public String convertToBase7(int num) {
        if(num==0)
            return "0";
        StringBuilder res = new StringBuilder();
        boolean isNeg = num<0;
        if (num<0){
            num = Math.abs(num);
        }
        while (num!=0){
            res.append(num%7);
            num/=7;
        }
        if (isNeg)
            res.append('-');
        return res.reverse().toString();
    }
}
