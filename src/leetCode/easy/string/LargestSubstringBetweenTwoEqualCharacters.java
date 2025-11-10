package leetCode.easy.string;

/// 1624. Largest Substring Between Two Equal Characters
public class LargestSubstringBetweenTwoEqualCharacters {
    /*public static int maxLengthBetweenEqualCharacters(String s) {
        int max = -1;
        for (int i = 0 ; i < s.length() ; i++)
            for (int j = s.length()-1; j > i ; j--)
                if (s.charAt(i)==s.charAt(j)) {
                    max=Math.max(max,j-i-1);
                }
        return max;
    }*/

    public static int maxLengthBetweenEqualCharacters(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0 ; i < 26 ; i++){
            lastIndex[i]=-1;
        }
        int max = -1;
        for (int i = 0 ; i < s.length() ; i ++){
            int ch = s.charAt(i)-'a';
            if (lastIndex[ch]!=-1){
                max = Math.max(max,i-lastIndex[ch]-1);
            }else {
                lastIndex[ch]=i;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        String s = "mgntdygtxrvxjnwksqhxuxtrv";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
