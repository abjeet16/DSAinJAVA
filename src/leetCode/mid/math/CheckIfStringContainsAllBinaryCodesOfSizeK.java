package leetCode.mid.math;

import java.util.HashSet;

/// 1461. Check If a String Contains All Binary Codes of Size K
public class CheckIfStringContainsAllBinaryCodesOfSizeK {
    /*public boolean hasAllCodes(String s, int k) {
        if (s.length()<k)
            return false;
        HashSet<String> set = new HashSet<>();
        generate(set,k,new StringBuilder(),0);
        StringBuilder curr = new StringBuilder();
        for (int i = 0 ; i < k;i++){
            curr.append(s.charAt(i));
        }
        set.remove(curr.toString());
        for (int i = k ; i < s.length() ; i++){
            curr.deleteCharAt(0);
            curr.append(s.charAt(i));
            set.remove(curr.toString());
        }
        return set.isEmpty();
    }

    private void generate(HashSet<String> set, int k, StringBuilder sb,int i) {
        if(i==k){
            set.add(sb.toString());
            return;
        }
        sb.append('1');
        generate(set,k,sb,i+1);
        sb.deleteCharAt(sb.length()-1);
        sb.append('0');
        generate(set,k,sb,i+1);
        sb.deleteCharAt(sb.length()-1);
    }*/
    public boolean hasAllCodes(String s, int k) {
        if(s.length() < k)
            return false;

        int uniqueSub      = pow(2,k);
        HashSet<String> st = new HashSet<>();

        for(int i = k; i <= s.length(); i++) {
            String sub = s.substring(i-k, i);

            if(!st.contains(sub)) {
                st.add(sub);
                uniqueSub--;
            }

            if(uniqueSub == 0)
                return true;
        }

        return false;
    }

    private static int pow(int num, int k) {
        if (k==0)
            return 1;
        int res = pow(num,k/2);
        res*=res;
        if (k%2!=0)
            res*=num;
        return res;
    }

    public static void main(String[] args) {
        System.out.println(pow(2,3));
    }
}
