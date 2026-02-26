package leetCode.mid;

/// 1404. Number of Steps to Reduce a Number in Binary Representation to One
public class NumberOfStepsToReduceNumberInBinaryRepresentationToOne {
    public int numSteps(String s) {
        long num = convertBToD(s);
        int res = 0;
        while(num!=1){
            if (num%2==0){
                num/=2;
            }else{
                num++;
            }
            res++;
        }
        return res;
    }

    private long convertBToD(String s) {
        long res = 0;
        long sq = 1;
        for (int i = s.length()-1;i>=0;i--){
            res +=sq*(s.charAt(i)-'0');
            sq*=2;
        }
        return res;
    }
}
