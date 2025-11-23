package leetCode.easy.bitManipulation;

/// 3750. Minimum Number of Flips to Reverse Binary String
public class MinimumNumberOfFlipsToReverseBinaryString {
    public static int minimumFlips(int n) {
        StringBuilder str = new StringBuilder();
        while (n!=0){
            str.append(n%2);
            n/=2;
        }
        int res = 0;
        int i = 0;
        int len = str.length();
        while (i < len){
            if (str.charAt(i)!=str.charAt(len-1-i))
                res++;
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(minimumFlips(7));
    }
}
