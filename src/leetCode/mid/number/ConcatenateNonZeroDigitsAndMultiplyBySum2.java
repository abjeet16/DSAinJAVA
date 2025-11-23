package leetCode.mid.number;

public class ConcatenateNonZeroDigitsAndMultiplyBySum2 {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int [] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int n = Integer.parseInt(s.substring(queries[i][0],queries[i][1]+1));
            res[i] = sumAndMultiply(n);
        }
        return res;
    }
    public int sumAndMultiply(int n) {
        int noZeroNumber = 0;
        int sum = 0;
        while(n!=0){
            int rem = n%10;
            if (rem>0){
                sum+=rem;
                noZeroNumber = noZeroNumber*10+rem;
            }
            n/=10;
        }
        int temp = noZeroNumber;
        noZeroNumber=0;
        while (temp!=0){
            noZeroNumber= noZeroNumber*10+temp%10;
            temp/=10;
        }
        return noZeroNumber*sum;
    }
}
