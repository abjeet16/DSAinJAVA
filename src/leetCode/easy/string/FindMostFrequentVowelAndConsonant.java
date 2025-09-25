package leetCode.easy.string;

public class FindMostFrequentVowelAndConsonant {
    public static int maxFreqSum(String s) {
        int vowelMax = 0;
        int consonantMax = 0;
        int[] freq = new int[26];
        s=s.toLowerCase();
        for (int i = 0 ; i < s.length() ; i++){
            int index = s.charAt(i)-'a';
            freq[index]++;
            //'a', 'e', 'i', 'o', or 'u'
            if (s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                if (vowelMax < freq[index]) {
                    vowelMax = freq[index];
                }
            }else {
                if (consonantMax<freq[index]) {
                    consonantMax = freq[index];
                }
            }
        }
        System.out.println("vowelMax : "+vowelMax+"consonantMax : "+consonantMax);
        return vowelMax+consonantMax;
    }

    public static void main(String[] args) {
        System.out.println(maxFreqSum("abcdefgh"));
    }
}
