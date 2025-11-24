package HackerRank.easy.strings;

public class Anagram {
    public static int anagram(String s) {
        // Write your code here
        int len = s.length();
        if (len%2!=0)
            return -1;
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        for (int i = 0; i < len/2; i++) {
            count1[s.charAt(i)-'a']++;
        }
        for (int i = len/2; i < len; i++) {
            count2[s.charAt(i)-'a']++;
        }
        int res = 0;
        for (int i = 0 ; i < 26 ; i++){
            if (count1[i]>count2[i]){
                res+=count1[i]-count2[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "fdhlvosfpafhalll";
        System.out.println(anagram(s));
    }
}
