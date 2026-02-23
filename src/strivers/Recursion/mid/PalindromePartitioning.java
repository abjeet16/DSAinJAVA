package strivers.Recursion.mid;

import java.util.ArrayList;
import java.util.List;

/// 131. Palindrome Partitioning
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        generate(res,new ArrayList<String>(),new StringBuilder(),0,s);
        return res;
    }

    private void generate(List<List<String>> res, ArrayList<String> curr, StringBuilder str, int i, String s) {
        if (i==s.length()){
            if (check(str))
                res.add(new ArrayList<>(curr));
            return;
        }
        if (check(str)){
            curr.add(str.toString());
            generate(res, curr, new StringBuilder(), i+1, s);
            curr.removeLast();
        }
        str.append(s.charAt(i));
        generate(res, curr, str, i+1, s);
    }

    private boolean check(StringBuilder str){
        if (str.isEmpty())
            return false;
        int i = 0;
        int j = str.length()-1;
        while (i<j){
            if (str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
