package leetCode.easy.string;

import java.util.Arrays;

/// 1160. Find Words That Can Be Formed by Characters
public class FindWordsThatCanBeFormedByCharacters {
    public static int countCharacters(String[] words, String chars) {
        int[] count = new int[26];
        int res = 0 ;
        for (char ch : chars.toCharArray())
            count[ch-'a']++;
        for (String word : words) {
            res+=check(count,word);
        }
        return res;
    }

    private static int check(int[] allowed, String word) {
        int[] count = new int[26];
        for (char ch : word.toCharArray()){
            int pos = ch-'a';
            count[pos]++;
            if (count[pos]>allowed[pos])
                return 0;
        }
        return word.length();
    }

    public static void main(String[] args) {
        String[] arr = {"dyiclysmffuhibgfvapygkorkqllqlvokosagyelotobicwcmebnpznjbirzrzsrtzjxhsfpiwyfhzyonmuabtlwin"
                ,"ndqeyhhcquplmznwslewjzuyfgklssvkqxmqjpwhrshycmvrb"
                ,"ulrrbpspyudncdlbkxkrqpivfftrggemkpyjl"
                ,"boygirdlggnh"
                ,"xmqohbyqwagkjzpyawsydmdaattthmuvjbzwpyopyafphx"
                ,"nulvimegcsiwvhwuiyednoxpugfeimnnyeoczuzxgxbqjvegcxeqnjbwnbvowastqhojepisusvsidhqmszbrnynkyop"
                ,"hiefuovybkpgzygprmndrkyspoiyapdwkxebgsmodhzpx"
                ,"juldqdzeskpffaoqcyyxiqqowsalqumddcufhouhrskozhlmobiwzxnhdkidr"
                ,"lnnvsdcrvzfmrvurucrzlfyigcycffpiuoo"
                ,"oxgaskztzroxuntiwlfyufddl"
                ,"tfspedteabxatkaypitjfkhkkigdwdkctqbczcugripkgcyfezpuklfqfcsccboarbfbjfrkxp","qnagrpfzlyrouolqquytwnwnsqnmuzphne","eeilfdaookieawrrbvtnqfzcricvhpiv","sisvsjzyrbdsjcwwygdnxcjhzhsxhpceqz","yhouqhjevqxtecomahbwoptzlkyvjexhzcbccusbjjdgcfzlkoqwiwue","hwxxighzvceaplsycajkhynkhzkwkouszwaiuzqcleyflqrxgjsvlegvupzqijbornbfwpefhxekgpuvgiyeudhncv","cpwcjwgbcquirnsazumgjjcltitmeyfaudbnbqhflvecjsupjmgwfbjo","teyygdmmyadppuopvqdodaczob","qaeowuwqsqffvibrtxnjnzvzuuonrkwpysyxvkijemmpdmtnqxwekbpfzs","qqxpxpmemkldghbmbyxpkwgkaykaerhmwwjonrhcsubchs"};
        String chars = "usdruypficfbpfbivlrhutcgvyjenlxzeovdyjtgvvfdjzcmikjraspdfp";
        System.out.println(countCharacters(arr,chars));
    }
}
