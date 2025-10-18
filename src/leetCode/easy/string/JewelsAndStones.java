package leetCode.easy.string;
//771. Jewels and Stones
public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        boolean[] isJewel = new boolean[52];
        int res = 0 ;
        for (char ch : jewels.toCharArray()){
            if (ch>='a'){
                int pos = 26+ch-'a';
                isJewel[pos] = true;
            }else {
                int pos = ch-'A';
                isJewel[pos] = true;
            }
        }
        for (char ch : stones.toCharArray()){
            int pos;
            if (ch>='a'){
                pos = 26+ch-'a';
            }else {
                pos = ch-'A';
            }
            if (isJewel[pos])
                res++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println((int)'A');
        System.out.println((int)'a');
    }
}
