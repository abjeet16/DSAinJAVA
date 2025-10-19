package leetCode.mid.array;

import java.util.Arrays;

public class LexicographicallySmallestPermutationGreaterThanTarget {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        char[] freq = new char[26];
        for (char c : s.toCharArray()) freq[c - 'a']++;

        char[] result = new char[n];
        if (build(result, 0, freq, target.toCharArray(), false)) {
            return new String(result);
        }
        return "";
    }

    private boolean build(char[] res, int idx, char[] freq, char[] target, boolean alreadyGreater) {
        if (idx == res.length) return alreadyGreater;

        int start = alreadyGreater ? 0 : target[idx] - 'a';

        for (int i = start; i < 26; i++) {
            if (freq[i] == 0) continue;

            freq[i]--;
            res[idx] = (char) (i + 'a');
            boolean nextGreater = alreadyGreater || (i > target[idx] - 'a');

            if (build(res, idx + 1, freq, target, nextGreater)) return true;

            freq[i]++;
        }
        return false;
    }
}
